package creational.singleton.staticblock;

public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;

    private StaticBlockSingleton() {}

    /**
     * This is a static initializer.
     * Executed when the class is loaded.
     */
    static {
        try {
            instance = new StaticBlockSingleton();
        }catch (Exception e) {
            throw new RuntimeException("Exception occurred when creating singleton instance");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}
