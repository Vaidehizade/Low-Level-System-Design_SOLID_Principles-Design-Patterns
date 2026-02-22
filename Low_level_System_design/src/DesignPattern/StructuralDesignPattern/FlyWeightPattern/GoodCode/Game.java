package DesignPattern.StructuralDesignPattern.FlyWeightPattern.GoodCode;

import DesignPattern.StructuralDesignPattern.FlyWeightPattern.BadCode.Bullet;

public class Game {
    public static void main(String[] args) {
        //5 red bullets
        for(int i=0; i<5; i++){
            DesignPattern.StructuralDesignPattern.FlyWeightPattern.BadCode.Bullet bullet = new DesignPattern.StructuralDesignPattern.FlyWeightPattern.BadCode.Bullet("Red", i*10, i*12, 10);
        }
        //5 green bullets
        for(int i=0; i<5; i++){
            DesignPattern.StructuralDesignPattern.FlyWeightPattern.BadCode.Bullet bullet = new Bullet("Green", i*10, i*12, 10);
        }
        //memory overhead : every bullet redundant data color, eg...
    }
}
