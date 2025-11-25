package org.example.designpattern.proxy;

/***
 * Proxy class yani haqiqy tasvirni yuklashni kechiktiradigan class
 */
public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }


    /***
     * Agar realImage hali yaratilmagan bo'lsa, uni yaratadi va tasvirni ko'rsatadi
     *  faqat display chaqirilganda haqiqiy tasvirni yuklaydi
     */
    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();

    }
}
