package DesignPattern.StructuralDesignPattern.FlyWeightPattern.GoodCode;


//fFLYWEIGHT CLASS
public class BulletType {
    private String color; //intrinsic property shared by all bullets

    public BulletType(String color){
        this.color = color;
        System.out.println("bullet colour "+ color);
    }

}
