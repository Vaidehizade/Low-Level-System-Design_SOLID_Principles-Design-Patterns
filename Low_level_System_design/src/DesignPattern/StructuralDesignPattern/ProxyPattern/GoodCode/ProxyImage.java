package StructuralDesignPattern.ProxyPattern.GoodCode;

import StructuralDesignPattern.ProxyPattern.BadCode.RealImage;

public class ProxyImage implements Image{

    public String filename;  //Proxy image holds filename and refrence to the real image
    public RealImage realImage;
    public ProxyImage(String filename){
        this.filename = filename;
    }
    public void display(){
   if(realImage == null){
       //jevha first time image pahije asel tevha load hoil from disk
       //next time onwards nusta display hoil simply cached// coz image is already loaded
          realImage = new RealImage(filename); // image is loaded +cached
        }
        realImage.display();
    }
}
