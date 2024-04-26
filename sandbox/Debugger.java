import com.sun.jdi.Bootstrap;
import com.sun.jdi.VirtualMachineManager;
import com.sun.jdi.connect.Connector;

import java.util.Map;

public class Debugger
{
    public static void main(String[] args)
    {
        VirtualMachineManager virtualMachineManager = Bootstrap.virtualMachineManager();
        System.out.println("JDI Major Version: " + virtualMachineManager.majorInterfaceVersion());
        System.out.println("JDI Minor Version: " + virtualMachineManager.minorInterfaceVersion());
        System.out.println("Connectors: " + virtualMachineManager.allConnectors().size());
        for (Connector connector : virtualMachineManager.allConnectors())
        {
            System.out.println(String.format("%s (%s):", connector.name(), connector.description()));
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
    }
}
