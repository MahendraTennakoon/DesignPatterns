package creational.singleton.lazy_initialized;

public class LazyInitializedSingleton {
    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton() {}

    public static LazyInitializedSingleton getInstance() {
        /**
         * Not thread safe.
         * If multiple threads access the following if block simultaneously, two instances will be created.
         */
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }

        return instance;
    }
}
