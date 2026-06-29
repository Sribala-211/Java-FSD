// Logger.java
public class Logger {
    // Private static instance
    private static Logger instance;

    // Private constructor prevents instantiation
    private Logger() {}

    // Public method to provide access
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Example logging method
    public void log(String message) {
        System.out.println("[LOG]: " + message);
    }
}
