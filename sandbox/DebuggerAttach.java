import com.sun.jdi.*;
import com.sun.jdi.connect.AttachingConnector;
import com.sun.jdi.connect.Connector;
import com.sun.jdi.request.BreakpointRequest;
import com.sun.jdi.request.EventRequestManager;

import java.util.Map;
import java.util.Scanner;

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
            System.out.println("\n============ INFO ============\n");
            System.out.println("\nName: \n" + virtualMachine.name());
            System.out.println("\nDescription: \n" + virtualMachine.description());
            // TODO: Test this against different JVM languages such as Kotlin, Groovy, Scala, Clojure, Jython, JRuby
            System.out.println("\nDefault Stratum: \n" + virtualMachine.getDefaultStratum());
            System.out.println();
            System.out.println("\n============ INFO ============\n");
            int stop = 1;
            while (stop != 0)
            {
                System.out.print("Which line would you like to set a breakpoint: ");
                int line = _SCANNER.nextInt();

                ReferenceType referenceType = virtualMachine.classesByName("Factorial").getFirst();
                Location location = referenceType.locationsOfLine(line).getFirst();

                EventRequestManager eventRequestManager = virtualMachine.eventRequestManager();
                BreakpointRequest breakpointRequest = eventRequestManager.createBreakpointRequest(location);
                breakpointRequest.enable();

                // Try sleeping for 10 seconds
                Thread.sleep(10l * 1000l);

                // Continue executions
                virtualMachine.resume();

                // Remove the breakpoint
                breakpointRequest.disable();
                eventRequestManager.deleteAllBreakpoints();

                System.out.print("Type 0 to exit: ");
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
            virtualMachine.resume();
            virtualMachine.dispose();
        }
    }
}
