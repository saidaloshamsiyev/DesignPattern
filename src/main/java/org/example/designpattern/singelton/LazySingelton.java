package org.example.designpattern.singelton;

public class LazySingelton {

    public static LazySingelton INSTANCE;


    private LazySingelton() {
    }

    /**
     * Bu method orqali biz Lazy Singelton ni olishimiz mumkin
     * getInstance methodi chaqirilganda birinchi marta INSTANCE null boladi va yangi obyekt yaratiladi
     * keyingi safar chaqirilganda esa mavjud obyekt qaytariladi
     *
     * @return LazySingelton instance
     */
    public static LazySingelton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazySingelton();
        }
        return INSTANCE;
    }


}

