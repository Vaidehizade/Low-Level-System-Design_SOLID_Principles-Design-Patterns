package DesignPattern.StructuralDesignPattern.FlyWeightPattern.BadCode;

public class Game {
    public static void main(String[] args) {
        //5 red bullets
        for(int i=0; i<5; i++){
            Bullet bullet = new Bullet("Red", i*10, i*12, 10);
        }
        //5 green bullets
        for(int i=0; i<5; i++){
            Bullet bullet = new Bullet("Green", i*10, i*12, 10);
        }
        //memory overhead : every bullet redundant data color, eg...
    }
}
