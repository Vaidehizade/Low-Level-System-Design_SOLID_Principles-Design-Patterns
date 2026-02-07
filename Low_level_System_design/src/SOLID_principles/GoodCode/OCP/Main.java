package SOLID_principles.GoodCode.OCP;

public class Main {

    public static void main(String[] args){
        PaymentProcessor processor = new PaymentProcessor();
        PaymentMethod creditCard = new CreditCard();
        processor.processPayment(creditCard,100);
    }
}
