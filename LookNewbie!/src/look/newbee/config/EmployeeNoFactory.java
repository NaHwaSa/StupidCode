package look.newbee.config;

public class EmployeeNoFactory {
    private static int noSequence = 1;
    public static int nextNo() {
        return noSequence++;
    }
}
