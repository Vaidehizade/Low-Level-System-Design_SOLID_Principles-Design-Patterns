package BehaviouralDesignPattern.StatePattern.GoodCode;

public class DirectionService {
    TransportationMode tm;
    DirectionService(TransportationMode tm){
        this.tm = tm;
    }
    public void setTransportationMode(TransportationMode mode){
        this.tm = mode;
    }
    //delegating the work current state's concrete class
    public int getETA(){
        return tm.calcETA();
    }
    public String getDirection(){
        return tm.getDirection();
    }
}
