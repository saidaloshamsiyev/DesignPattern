package org.example.designpattern.proxy.singeltonplusproxy;

public class ProxyImageSP implements ImageSP {  
    private RealImageSP realImageSP;
    private String fileName;

    private ProxyImageSP instance;

    public ProxyImageSP(String fileName) {
        this.fileName = fileName;
    }

    public ProxyImageSP getInstance(String fileName) {
        if (instance == null) {
            instance = new ProxyImageSP(fileName);
        }
        return instance;
    }

    @Override
    public void display() {
        if (realImageSP == null) {
            realImageSP = new RealImageSP(fileName);
        }
        realImageSP.display();

    }
}
