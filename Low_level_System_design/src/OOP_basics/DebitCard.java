package OOP_basics;

public class DebitCard extends Card{

    public DebitCard(String cardNo, String userName) {
        super(cardNo, userName);
    }

    public void pay()
    {
        System.out.println("Making payment via Debit card");
    }
}
