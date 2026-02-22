package StructuralDesignPattern.AdapterPattern.BadCode;

public class Client {
    public static void main(String[] args) {
        NotificationService emailService = new EmailNotificationService();
        emailService.send("customer@codingminutes.com","order confirm", "your order has been received");

        //problem we can't call this here
        //NotificationService sendGridEmailService = new SendGridService();
    }
}
