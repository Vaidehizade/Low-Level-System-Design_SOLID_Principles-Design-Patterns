package BehaviouralDesignPattern.StatePattern.BadCode;

public class WithoutStatePattern {
    public static void main(String[] args) {
        DirectionService ds = new DirectionService(TransportationMode.TRAIN);
        ds.setMode(TransportationMode.CYCLING);
        System.out.println(ds.getDirection());
        ds.getETA();
    }
}
