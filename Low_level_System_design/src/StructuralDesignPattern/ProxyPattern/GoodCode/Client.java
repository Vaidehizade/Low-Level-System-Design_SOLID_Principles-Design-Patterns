package StructuralDesignPattern.ProxyPattern.GoodCode;


public class Client {
    public static void main(String[] args) {
        //actual image is not created i mean not loaded
        Image img1 = new ProxyImage("dog.png");
        Image img2 = new ProxyImage("dog.png");

        img1.display(); //creating real img + load + display
        img1.display();
        //lazy loading + caching help this method a lot
        //save memory and time in code
        //objects are loaded but never displayed
    }
}
