// main.java
public class main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("First log message");
        logger2.log("Second log message");

        // Verify both references point to the same instance
        System.out.println("Are both loggers same? " + (logger1 == logger2));
    }
}
