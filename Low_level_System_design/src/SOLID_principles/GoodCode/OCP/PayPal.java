package SOLID_principles.GoodCode.OCP;

public class PayPal implements PaymentMethod {

    public void pay(double amount){
        System.out.println("Making payment via Paypal");
    }
}
