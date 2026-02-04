package OOP_basics;

abstract public class Card implements PaymentMethod{
    private String cardNo;
    private String userName;

    public Card(String cardNo,String userName){
        this.cardNo = cardNo;
        this.userName = userName;
    }

    public String getCardNo(String cardNo){
        return cardNo;
    }

    public String getUserName(String userName){
        return userName;
    }

    //abstract void pay();
    //we don't know how to implement a pay method mechanism we don't know so
    //we have to make it abstract
}
