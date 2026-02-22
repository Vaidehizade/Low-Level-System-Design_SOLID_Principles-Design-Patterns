package BehaviouralDesignPattern.StatePattern.GoodCode;

public class Car implements TransportationMode{
    @Override
    public int calcETA() {
        System.out.println("calc eta for car 3");
        return 3;
    }

    @Override
    public String getDirection() {
        return "Directions for driving: Use highway 50 towards downtown";
    }
}
