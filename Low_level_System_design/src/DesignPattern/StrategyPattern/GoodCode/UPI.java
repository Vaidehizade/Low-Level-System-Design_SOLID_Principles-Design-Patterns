package DesignPattern.StrategyPattern.GoodCode;

public class UPI implements Strategy{

    @Override
    public void processPayment() {
        System.out.println("making payment via UPI");
    }
}
