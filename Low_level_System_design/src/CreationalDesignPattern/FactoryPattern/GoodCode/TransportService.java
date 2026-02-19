package CreationalDesignPattern.FactoryPattern.GoodCode;


//client code
public class TransportService {
    public static void main(String[] args) {

        Transport vehicle = TransportFactory.createTransport("bus");
        vehicle.deliver();
        Transport vehicle1 = TransportFactory.createTransport("Bike");
        vehicle1.deliver();

    }
}
