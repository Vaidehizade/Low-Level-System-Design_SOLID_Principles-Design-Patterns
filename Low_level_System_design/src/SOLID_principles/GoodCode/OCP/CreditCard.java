package SOLID_principles.GoodCode.OCP;


public class CreditCard implements PaymentMethod {

    public void pay(double amount){
        System.out.println("Making payment via Credit Card");
    }
}
