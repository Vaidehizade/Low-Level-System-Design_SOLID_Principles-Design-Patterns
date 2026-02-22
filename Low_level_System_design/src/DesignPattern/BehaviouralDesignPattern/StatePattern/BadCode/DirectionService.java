package BehaviouralDesignPattern.StatePattern.BadCode;

enum TransportationMode{
    WALKING,CYCLING,CAR,TRAIN
}
public class DirectionService {

    private TransportationMode mode;
    public DirectionService(TransportationMode mode){
        this.mode = mode;
    }
    public void setMode(TransportationMode mode){
        this.mode = mode;
    }

    //Method to calc ETA based upon transportation mode
    public int getETA(){
        return switch (mode) {
            case WALKING -> {
                System.out.println("calc eta for walking 10");
                yield 10;
            }
            case CYCLING -> {
                System.out.println("calc eta for cycling 5");
                yield 5;
            }
            case CAR -> {
                System.out.println("calc eta for car 3");
                yield 3;
            }
            case TRAIN -> {
                System.out.println("calc eta for train 2");
                yield 2;
            }
            default -> throw new IllegalArgumentException("Unknown mode");
        };
    }
    public String getDirection(){
        switch(mode){
            case WALKING :
                return "Directions for walking: Head north for 500 meters";
            case CYCLING:
                return "Directions for cycling: take the bike lane on elm street";
            case CAR:
                return "Directions for driving: Use highway 50 towards downtown";
            case TRAIN:
                return "Directions for train: Board the Red line at central station";
            default:
                return "No directions available for the selected mode.";
        }
    }
}
