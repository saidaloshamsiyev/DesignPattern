package org.example.designpattern.singelton;

public class ThreadSafeSingleton {

    public static ThreadSafeSingleton INSTANCE;


    private ThreadSafeSingleton() {
    }


    /**
     *
     * Thread-safe method bu double-checked locking qilingan har safar getInstance chaqirilganda
     * sinxronizatsiya qilinmaydi, faqat birinchi martagina sinxronizatsiya qilinadi.
     * Bu usul samaraliroq va samarali hisoblanadi.
     * @return ThreadSafeSingleton instance
     */
    public static ThreadSafeSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new ThreadSafeSingleton();
                }
            }
        }
        return INSTANCE;
    }


}
