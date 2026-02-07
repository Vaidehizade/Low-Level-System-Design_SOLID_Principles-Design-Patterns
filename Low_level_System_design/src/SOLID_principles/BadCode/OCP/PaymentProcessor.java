package SOLID_principles.BadCode.OCP;

//Open close Principle (OCP)
//we are building a payment system where we want to process payment using different payment methods

public class PaymentProcessor {

    public void processPayment(String paymentMethod, double amount){
       if(paymentMethod.equals("Credit Card")){
           //business logic
           System.out.println("Paid using Credit Card"+ amount);
       }
       else if(paymentMethod.equals("Debit Card")){
           //business logic
           System.out.println("Paid using Debit Card" + amount);
       }
       //upi will have different pay method than credit debit card
       //so for this u will have to modify this class always so this violates open close principle
       else if(paymentMethod.equals("UPI")){
           System.out.println("Paid using UPI" + amount);
       }
       else{
           throw new IllegalArgumentException("Unsupported payment method" + paymentMethod);
       }
    }
}
