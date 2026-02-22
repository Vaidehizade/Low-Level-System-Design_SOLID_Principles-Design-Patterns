package StructuralDesignPattern.AdapterPattern.GoodCode;

import StructuralDesignPattern.AdapterPattern.GoodCode.EmailNotificationService;
import StructuralDesignPattern.AdapterPattern.GoodCode.NotificationService;
import StructuralDesignPattern.AdapterPattern.GoodCode.SendGridService;

public class Client {
    public static void main(String[] args) {
        NotificationService emailService = new EmailNotificationService();
        emailService.send("customer@codingminutes.com","order confirm", "your order has been received");

        NotificationService emailServiceUsingGrid = new SendGridAdapter(new SendGridService());
        emailServiceUsingGrid.send("customer@codingminutes.com","order confirm", "your order has been received");

    }
}
