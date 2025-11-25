package org.example.designpattern.proxy;

/**
 * RealImage class
 */
public class RealImage implements Image {
    private String fileName;


    /**
     * Constructor ichida loadFromDisk metodi chaqiriladi chunki
     * haqiqy object yaratilganda rasm diskdan yuklanishi kerak
     *
     * @param fileName
     */
    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    /**
     * Haqiqy object yaratilganda diskdan rasmni yuklash uchun ishlatiladi
     */
    private void loadFromDisk() {
        System.out.println("Loading " + fileName + " from disk...");
    }

    /**
     * Rasmni ekranga chiqarish uchun ishlatiladi
     */
    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }
}
