package DesignPattern.StructuralDesignPattern.FlyWeightPattern.GoodCode;

public class Bullet {

    private BulletType bulletType;
    private int x,y; //extrinsic properties unique to each
    private int velocity; //extrinsic

    public Bullet(String color, int x, int y, int velocity){
        this.bulletType = BulletTypeFactory.getBulletType(color);
        this.x = x;
        this.y = y;
        this.velocity = velocity;
        System.out.println("Creating bullet at (" + x + ", " + y + ") with velocity " + velocity);
    }
    public void display1(){
        System.out.println("Bullet at (" + x + ", " + y + ") moving velocity " + velocity);
    }
}
