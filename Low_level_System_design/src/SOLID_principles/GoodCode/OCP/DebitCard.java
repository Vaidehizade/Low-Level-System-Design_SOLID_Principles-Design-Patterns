package SOLID_principles.GoodCode.OCP;

//SRP is also there
public class DebitCard implements PaymentMethod {

    public void pay(double amount){
        System.out.println("Making card via Debit Card");
    }
}
