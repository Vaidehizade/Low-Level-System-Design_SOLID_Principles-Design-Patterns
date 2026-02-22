package CreationalDesignPattern.FactoryPattern.BadCode;

public class TransportService {
    public static void main(String[] args) {
        //Direct create objects
        Transport car = new Car();
        Transport bike = new Bike(); //tight coupling

    }
}
