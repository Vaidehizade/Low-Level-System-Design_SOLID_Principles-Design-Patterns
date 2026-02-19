package CreationalDesignPattern.FactoryPattern.GoodCode;

public class Bus implements Transport{
    @Override
    public void deliver() {
        System.out.println("deliver by Bus");
    }
}
