package BehaviouralDesignPattern.StatePattern.GoodCode;

public class Train implements TransportationMode{
    @Override
    public int calcETA() {
        return 0;
    }

    @Override
    public String getDirection() {
        return "";
    }
}
