package DesignPattern.StrategyPattern.GoodCode;

//concrete strategy
public class CreditCard implements Strategy{

    @Override
    public void processPayment() {
        System.out.println("making payment via creditcard");
    }
}
