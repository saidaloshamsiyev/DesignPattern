package org.example.designpattern.singelton;

public class ThreadSafeSingletonReststrickted {
    private static ThreadSafeSingletonReststrickted INSTANCE;


    private ThreadSafeSingletonReststrickted() {
    }

    /**
     * Thread safe Bu lekin Performans tarafdan olsak har
     * safar getInstance method chaqirilganda synchronized
     * bolgani uchun sekin ishlaydi lock ochiladi va yopiladi
     * @return ThreadSafeSingletonReststrickted instance
     */
    public static synchronized ThreadSafeSingletonReststrickted getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ThreadSafeSingletonReststrickted();
        }
        return INSTANCE;
    }
}
