package DesignPattern.StrategyPattern.GoodCode;

public class DebitCard implements Strategy{

    @Override
    public void processPayment() {
        System.out.println("making payment via debitcard");
    }
}
