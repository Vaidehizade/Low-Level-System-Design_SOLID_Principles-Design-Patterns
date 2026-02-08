package SOLID_principles.GoodCode.DIP;

public class Main {

    public static void main(String[] args) {

        NotificationService emailNotification = new NotificationService(new EmailService());
        emailNotification.notify("Msged via email");
        NotificationService whatsappNotification = new NotificationService(new Whatsapp());
        whatsappNotification.notify("msged via whatsapp!");
    }
}
