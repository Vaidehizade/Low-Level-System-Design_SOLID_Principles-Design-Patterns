package DesignPattern.StrategyPattern.BadCode;


// this is violating the OCP
class PaymentService {

    public void processPayment(String paymentMethod) {
        if (paymentMethod.equals("CreditCard")) {
            System.out.println("Making payment via credit card");
        } else if (paymentMethod.equals("DebitCard")) {
            System.out.println("Making payment via credit card");
        } else {
            System.out.println("Unsupported Payment method");
        }

    }
}
public class WithoutStrategyPattern {
    public static void main(String[] args) {
        PaymentService ps = new PaymentService();
        ps.processPayment("DebitCard");
        ps.processPayment("UPI");
    }
}

