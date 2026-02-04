package OOP_basics;

public class Client {
    //client will use this class to use this PAYMENT SERVICE
    public static void main(String[] args){
       PaymentService ps = new PaymentService();
       ps.addPaymentMethod("VaidehiDebitCard",new DebitCard("1234","Vaidehi Zade"));
       ps.addPaymentMethod("AvantikaCreditCard",new CreditCard("5678","Avantika Joshi"));
       ps.addPaymentMethod("VaidehiuPI", new UPI("vaidehi1234"));
       ps.addPaymentMethod("VaidehiWallet",new Wallet());
       ps.makePayment("VaidehiuPI");
       ps.makePayment("VaidehiDebitCard");
       ps.makePayment("VaidehiWallet");
    }
}
