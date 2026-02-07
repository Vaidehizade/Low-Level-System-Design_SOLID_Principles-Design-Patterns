package SOLID_principles.GoodCode.OCP;


public class UPI implements PaymentMethod {

    public void pay(double amount){
        System.out.println("Making payments via UPI");
    }

}
