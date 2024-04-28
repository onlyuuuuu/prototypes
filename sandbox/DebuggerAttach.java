import com.sun.jdi.*;
import com.sun.jdi.connect.AttachingConnector;
import com.sun.jdi.connect.Connector;
import com.sun.jdi.event.*;
import com.sun.jdi.request.BreakpointRequest;
import com.sun.jdi.request.EventRequest;
import com.sun.jdi.request.EventRequestManager;
import com.sun.jdi.request.StepRequest;

import java.util.*;

public class DebuggerAttach
{
    private static final String _HOSTNAME = "127.0.0.1";
    private static final String _PORT = String.valueOf(1199);
    private static final String _TIMEOUT = String.valueOf(5l * 1000l);
    private static final String _ARG_HOSTNAME_KEY_NAME = "hostname";
    private static final String _ARG_PORT_KEY_NAME = "port";
    private static final String _ARG_TIMEOUT_KEY_NAME = "timeout";
    private static final Scanner _SCANNER = new Scanner(System.in);

    public static void main(String[] args)
    {
        VirtualMachineManager virtualMachineManager = Bootstrap.virtualMachineManager();

        AttachingConnector attachingConnector = virtualMachineManager
            .attachingConnectors()
            .stream()
            .filter(connector -> "com.sun.jdi.SocketAttach".equals(connector.name()))
            .findFirst()
            .orElseThrow();

        Map<String, Connector.Argument> arguments = attachingConnector.defaultArguments();

        final Connector.Argument _ARG_HOSTNAME_MODIFIED = arguments.get(_ARG_HOSTNAME_KEY_NAME);
        _ARG_HOSTNAME_MODIFIED.setValue(_HOSTNAME);

        final Connector.Argument _ARG_PORT_MODIFIED = arguments.get(_ARG_PORT_KEY_NAME);
        _ARG_PORT_MODIFIED.setValue(_PORT);

        final Connector.Argument _ARG_TIMEOUT_MODIFIED = arguments.get(_ARG_TIMEOUT_KEY_NAME);
        _ARG_TIMEOUT_MODIFIED.setValue(_TIMEOUT);

        Map<String, Connector.Argument> modifiedArguments = arguments;

        VirtualMachine virtualMachine = null;
        try
        {
            virtualMachine = attachingConnector.attach(modifiedArguments);
            System.out.printf("\n============ INFO ============\n");
            System.out.printf("\nName: \n" + virtualMachine.name() + "\n");
            System.out.printf("\nDescription: \n" + virtualMachine.description() + "\n");
            // TODO: Test this against different JVM languages such as Kotlin, Groovy, Scala, Clojure, Jython, JRuby
            System.out.printf("\nDefault Stratum: \n" + virtualMachine.getDefaultStratum() + "\n");
            System.out.printf("\n");
            System.out.printf("\n============ INFO ============\n");

            EventRequestManager eventRequestManager = virtualMachine.eventRequestManager();
            ReferenceType referenceType = virtualMachine.classesByName("Factorial").getFirst();

            Map<String, StepRequest> stepEnabledThreads = new TreeMap<>();

            int stop = 1;
            while (stop != 0)
            {
                System.out.printf("\nWhich line would you like to set a breakpoint (either 23 or 33 is recommended): ");
                int line = _SCANNER.nextInt();

                for (Location location : referenceType.locationsOfLine(line))
                {
                    BreakpointRequest breakpointRequest = eventRequestManager.createBreakpointRequest(location);
                    breakpointRequest.enable();
                }

                System.out.printf("\nBreakpoint has been set on line %s!\n\n", line);

                // Keep polling for events
                _LABELLED_BLOCK_EVENT_POLLING:
                while (true)
                {
                    System.out.printf("\nStanding by for incoming debugging events...\n\n", line);

                    EventQueue eventQueue = virtualMachine.eventQueue();
                    EventSet events = eventQueue.remove();

                    for (Event event : events)
                    {
                        System.out.printf("\n");
                        System.out.printf("Event Instance: " + event.getClass() + "\n");
                        boolean askForPrompt = false;
                        if (event instanceof LocatableEvent)
                        {
                            System.out.printf("Location event hit on line " + line + "!\n");
                            askForPrompt = true;
                        }
                        else if (event instanceof VMDisconnectEvent)
                        {
                            System.out.printf("Target VM has been disconnected!\n");
                            break;
                        }
                        else if (event instanceof VMDeathEvent)
                        {
                            System.out.printf("Target VM is dead!\n");
                            break;
                        }
                        else
                        {
                            System.out.printf("Unknow event!\n");
                        }
                        EventRequest request = event.request();
                        if (request == null)
                            continue;
                        System.out.printf("Request Instance: " + request.getClass() + "\n");
                        System.out.printf("Suspend Policy: " + request.suspendPolicy() + "\n");
                        System.out.printf("\n");
                        if (!askForPrompt)
                            continue;
                        _LABELLED_BLOCK_USER_PROMPTING:
                        while (true)
                        {
                            LocatableEvent locatableEvent = (LocatableEvent) event;

                            Location stopLocation = locatableEvent.location();
                            Method method = stopLocation.method();
                            List<LocalVariable> variables = Collections.emptyList();
                            try
                            {
                                variables = method.variables();
                            } catch (AbsentInformationException e)
                            {
                                System.err.printf("Method variables information is not available!\n");
                            }

                            ThreadReference thread = locatableEvent.thread();
                            List<StackFrame> frames = thread.frames();

                            System.out.printf("\n");
                            System.out.printf("Code Index: " + stopLocation.codeIndex() + "\n");
                            System.out.printf("Line number: " + stopLocation.lineNumber() + "\n");
                            System.out.printf("Source Name: " + stopLocation.sourceName() + "\n");
                            System.out.printf("Source Path: " + stopLocation.sourcePath() + "\n");
                            System.out.printf("Reference: " + stopLocation.declaringType().name() + "\n");
                            System.out.printf("Method: " + stopLocation.method().name() + "\n");
                            System.out.printf("Frame: " + thread.frameCount() + "\n");
                            System.out.printf("\n");
                            System.out.printf("Method Variables (only supports java.lang.Long type): \n");
                            for (LocalVariable variable : variables)
                            {
                                Type type = variable.type();
                                if (type instanceof LongType)
                                    System.out.printf("%s %s = %s\n", variable.typeName(), variable.name());
                            }
                            System.out.printf("\n");
                            System.out.printf("Frame Variables (only supports java.lang.Long type): \n");
                            for (int i = 1; i <= frames.size(); i++)
                            {
                                System.out.printf("\n============== FRAME %d ==============\n", i);
                                StackFrame frame = frames.get(i - 1);
                                try
                                {
                                    List<LocalVariable> visibleVariables = frame.visibleVariables();
                                    for (Map.Entry<LocalVariable, Value> entry : frame.getValues(visibleVariables).entrySet())
                                    {
                                        if (!(entry.getValue() instanceof LongValue))
                                            continue;
                                        LocalVariable variable = entry.getKey();
                                        LongValue value = (LongValue) entry.getValue();
                                        System.out.printf("%s %s = %s\n", variable.typeName(), variable.name(), value.longValue());
                                    }
                                } catch (AbsentInformationException e)
                                {
                                    System.err.printf("\nMethod variables information is not available!\n");
                                }
                                System.out.printf("\n============== FRAME %d ==============\n", i);
                            }
                            System.out.printf("\n");

                            // Enable step request
                            if (!stepEnabledThreads.containsKey(thread.name()))
                            {
                                System.out.printf("\n%s has not been enabled with STEP request, enabling it now...\n", thread.name());
                                StepRequest stepRequest = eventRequestManager.createStepRequest
                                (
                                    thread,
                                    StepRequest.STEP_LINE,
                                    StepRequest.STEP_OVER
                                );
                                stepRequest.enable();
                                stepEnabledThreads.put(thread.name(), stepRequest);
                                System.out.printf("\n%s has been enabled with STEP request!\n", thread.name());
                            }

                            System.out.printf("\nWhat would you like to do? (resume/step/exit) ");
                            String input = _SCANNER.next();
                            switch (input)
                            {
                                case "step":

                                    break;
                                case "exit":
                                    break _LABELLED_BLOCK_EVENT_POLLING;
                                case "resume":
                                default:
                                    System.out.printf("\nResuming target VM, breakpoints are still on...\n");
                                    virtualMachine.resume();
                                    break _LABELLED_BLOCK_USER_PROMPTING;
                            }
                        }
                    }
                }

                eventRequestManager.deleteAllBreakpoints();

                System.out.printf("\nAll breakpoints have been cleared...\n");

                System.out.printf("\nType 0 to exit: ");
                stop = _SCANNER.nextInt();
                if (stop != 0)
                    continue;
                break;
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        } finally
        {
            System.out.printf("\nResuming target VM...\n");
            virtualMachine.resume();
            System.out.printf("\nTarget VM resumed\n");
            System.out.printf("\nAttaching agent disconnecting...\n");
            virtualMachine.dispose();
            System.out.printf("\nAttaching agent disconnected\n");
        }
    }
}
