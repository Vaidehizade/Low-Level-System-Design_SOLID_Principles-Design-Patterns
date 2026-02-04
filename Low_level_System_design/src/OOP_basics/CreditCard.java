package OOP_basics;

public class CreditCard extends Card {

    public CreditCard(String cardNo, String userName) {
        super(cardNo, userName);
        //using super you can invoke the parent class constructor
    }

    public void pay() {
        System.out.println("Making payment via credit card");
    }
}
