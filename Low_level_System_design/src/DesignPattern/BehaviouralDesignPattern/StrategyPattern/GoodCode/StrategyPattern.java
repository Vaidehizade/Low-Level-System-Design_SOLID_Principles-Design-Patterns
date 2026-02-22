package BehaviouralDesignPattern.StrategyPattern.GoodCode;


//so this follows single responsibility principle
public class StrategyPattern {
    public static void main(String[] args) {
        PaymentService ps = new PaymentService();
        ps.setPaymentService(new CreditCard());
        ps.pay();
        ps.setPaymentService(new DebitCard());
        ps.pay();
        ps.setPaymentService(new UPI());
        ps.pay();
    }
}
