package SOLID_principles.BadCode.SRP;

public class Invoice {

    private double amount;

    public Invoice(double amount){
        this.amount = amount;
    }

    //additional functionality
    public void generateInvoice(){
        System.out.println("Invoice generated and printed for amount "+ amount);
    }

    //so we have written multiple responsibilities in same class
    //so if anyone of the functionality will fail then unit tests will break
    public void saveToDatabase(){
        System.out.println("Saving invoice to database");
    }

    //totally unrelated with how emails are being sent
    public void sendEmailNotification(){
        System.out.println("Sending email notifications to Invoice");
    }
}
