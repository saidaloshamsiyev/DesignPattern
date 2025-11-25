package org.example.designpattern.proxy.singeltonplusproxy;


public class RealImageSP implements ImageSP {

    private String fileName;

    public RealImageSP(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }
}
