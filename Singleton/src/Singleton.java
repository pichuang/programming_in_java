/**
 * Created by Phil Huang (pichuang@cs.nctu.edu.tw) on 2016/1/6.
 */
// A system only needs to create one instance of a class
public class Singleton {

    private static Singleton instance = null;

    public static Singleton getInstance() {
        // Lazy initialization
        if (instance == null) {
            // Handle Synchronized issue
            synchronized (Singleton.class) {
                // Double-check locking
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
