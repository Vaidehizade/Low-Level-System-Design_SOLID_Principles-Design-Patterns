package DesignPattern.StructuralDesignPattern.FlyWeightPattern.BadCode;

public class Bullet {

    private String color; //intrinsic property shared by all bullets

    private int x,y; //extrinsic properties unique to each
    private int velocity; //extrinsic

    public Bullet(String color, int x, int y, int velocity){
        this.color = color; //same for all bullets
        this.x = x;
        this.y = y;
        this.velocity = velocity;
        System.out.println("Creating bullet at (" + x + ", " + y + ") with velocity " + velocity);
    }
    public void display1(){
        System.out.println("Bullet at (" + x + ", " + y + ") moving velocity " + velocity);
    }
}
