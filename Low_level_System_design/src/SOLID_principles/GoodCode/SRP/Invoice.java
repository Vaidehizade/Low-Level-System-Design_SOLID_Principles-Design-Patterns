package SOLID_principles.GoodCode.SRP;

//follows single responsibility Principle (SRP)
public class Invoice {

    private double amount;
    public Invoice(double amount){
        this.amount = amount;
    }

    //additional functionality
    public void generateInvoice(){
        System.out.println("Invoice generated and printed for amount "+ amount);
    }

}
