package StructuralDesignPattern.ProxyPattern.BadCode;

public class Client {
    public static void main(String[] args) {

        //ya code mule direct image load houn jaychii disk madhna jsa object initialize kela tsa
        Image img1 = new RealImage("dog.png");
        Image img2 = new RealImage("dog.png");

        img1.display(); //img1 is getting used but not img2
        img1.display();
        //we are loading such a huge image twice
        //here we are not using caching
        //and if u want to get the filename only what's the point in loading the image
// we can achieve proxy pattern --> lazy loading (load if necessary)
    }
}
