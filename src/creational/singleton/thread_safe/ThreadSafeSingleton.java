package creational.singleton.thread_safe;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {}

    /**
     * Provides thread safety at the cost of performance.
     * There is an extra cost of performance associated with the sychronized method.
     */
    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }

        return instance;
    }

    /**
     * Uses DCL (Double Checked Locking) to minimize performance impact.
     */
    public static ThreadSafeSingleton getInstanceUsingDCL () {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }

        return instance;
    }
}
