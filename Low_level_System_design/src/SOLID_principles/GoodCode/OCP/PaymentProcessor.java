package SOLID_principles.GoodCode.OCP;


public class PaymentProcessor {
    public void processPayment(PaymentMethod paymentMethod, double amount){

        //this is runtime polymorphism and we can achieve abstraction
        paymentMethod.pay(amount);

    }
}
