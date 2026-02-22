package DesignPattern.StructuralDesignPattern.FlyWeightPattern.GoodCode;

import java.util.HashMap;

public class BulletTypeFactory {

    private static final HashMap<String, BulletType> bulletTypes = new HashMap<>();

    public static BulletType getBulletType(String color){
        if(!bulletTypes.containsKey(color)){
            bulletTypes.put(color,new BulletType(color));
            //bullet creation
        }
        //but if bullet is already created just refer krel to bullet factory madhna
        return bulletTypes.get(color);

    }
}
