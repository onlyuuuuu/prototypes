import com.sun.jdi.Bootstrap;
import com.sun.jdi.VirtualMachineManager;
import com.sun.jdi.connect.Connector;

import java.util.Map;

public class DebuggerInfo
{
    public static void main(String[] args)
    {
        System.out.println("\n============================================================================== INFO ==============================================================================\n");
        VirtualMachineManager virtualMachineManager = Bootstrap.virtualMachineManager();
        System.out.println("JDI Major Version: " + virtualMachineManager.majorInterfaceVersion());
        System.out.println("JDI Minor Version: " + virtualMachineManager.minorInterfaceVersion());
        System.out.println("Connectors: " + virtualMachineManager.allConnectors().size());
        for (Connector connector : virtualMachineManager.allConnectors())
        {
            System.out.println(String.format("Concrete of %s. Implementation of %s (%s):", connector.getClass(), connector.name(), connector.description()));
            for (Map.Entry<String, Connector.Argument> argumentEntry : connector.defaultArguments().entrySet())
            {
                String _SPACE_1 = "    ";
                String _SPACE_2 = "        ";
                System.out.println(_SPACE_1 + argumentEntry.getKey());
                System.out.println(_SPACE_2 + String.format
                (
                    "[%s] <%s> (%s) = %s",
                    argumentEntry.getValue().name(),
                    argumentEntry.getValue().label(),
                    argumentEntry.getValue().description(),
                    argumentEntry.getValue().value()
                ));
            }
        }
        System.out.println("\n============================================================================== INFO ==============================================================================\n");
    }
}
