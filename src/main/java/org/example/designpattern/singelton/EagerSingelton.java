package org.example.designpattern.singelton;

public class EagerSingelton {

    public static EagerSingelton INSTANCE = new EagerSingelton();

    public EagerSingelton() {
    }

    /**
     * Bu eager singelton instance hisoblanadi class yuklangan zahoti yaratiladi
     *
     * @return EagerSingelton instance
     */
    public static EagerSingelton getInstance() {
        return INSTANCE;
    }
}
