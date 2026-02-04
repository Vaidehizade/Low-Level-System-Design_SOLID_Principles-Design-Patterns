package OOP_basics;

public class UPI implements PaymentMethod{
    String upiId;

    UPI(String id){
        this.upiId = id;
    }
    @Override
    public void pay() {
      System.out.println("Making payments via UPI id "+upiId);
    }
}
