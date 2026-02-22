package DesignPattern.StructuralDesignPattern.ProxyPattern.GoodCode;

import DesignPattern.StructuralDesignPattern.ProxyPattern.GoodCode.Image;

public class RealImage implements Image {

    private String filename;
    public RealImage(String filename){
        this.filename = filename;
        loadImageFromDisk(); //expensive operation

    }
    private void loadImageFromDisk(){
        System.out.println("Loading image from disk: "+filename);
    }
    @Override
    public void display() {
        System.out.println("Displaying: "+filename);
    }
}
