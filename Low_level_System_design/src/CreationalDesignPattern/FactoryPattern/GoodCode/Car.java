package CreationalDesignPattern.FactoryPattern.GoodCode;

public class Car implements Transport {
    @Override
    public void deliver() {
        System.out.println("deliver by car");

    }
}
