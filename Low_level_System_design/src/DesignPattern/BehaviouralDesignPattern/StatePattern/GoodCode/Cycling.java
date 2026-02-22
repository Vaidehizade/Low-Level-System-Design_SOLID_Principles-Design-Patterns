package BehaviouralDesignPattern.StatePattern.GoodCode;

public class Cycling implements TransportationMode{
    @Override
    public int calcETA() {
        System.out.println("calc eta for cycling 5");
        return 5;
    }

    @Override
    public String getDirection() {
        return "Directions for cycling: take the bike lane on elm street";
    }
}
