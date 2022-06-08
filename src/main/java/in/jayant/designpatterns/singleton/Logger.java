package in.jayant.designpatterns.singleton;

import java.io.Serializable;

public class Logger implements Serializable {

    private static volatile Logger instance = null;

    private Logger() {}

    public static Logger getInstance() {
        if (instance == null) {
            // Avoid Multithreading issues
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    // To return the same instance when deserialized
    protected Object readResolve() {
        return instance;
    }

    // To avoid Cloning
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public void log(String message) {
        System.out.println(message);
    }
}
