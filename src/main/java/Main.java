import java.lang.management.ManagementFactory;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        assertArgs();
    }

    public static void assertArgs() {
        List<String> arguments = ManagementFactory.getRuntimeMXBean().getInputArguments();
        System.out.println(arguments);
        if (!arguments.isEmpty()) {
            throw new IllegalStateException();
        }
    }
}
