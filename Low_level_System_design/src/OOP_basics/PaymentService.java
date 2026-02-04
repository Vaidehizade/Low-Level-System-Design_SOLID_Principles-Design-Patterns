package OOP_basics;

import java.util.HashMap;

public class PaymentService {
    //Storing and making payments
    //we want to use paymentmethod so one of the param in hashmap is Paymentmethod
    HashMap<String,PaymentMethod> paymentMethods;

    PaymentService(){
        paymentMethods = new HashMap<>();
    }
    public void addPaymentMethod(String name, PaymentMethod pm)
    {
        paymentMethods.put(name,pm);
    }

    public void makePayment(String name){
        PaymentMethod pm = paymentMethods.get(name);
        if (pm == null) {
            System.out.println("Payment method not found: " + name);
            return;
        }
        pm.pay(); //depending on what type of object is extracted corresponding pay method will get called
        //this is called runtime polymorphism
    }
}
