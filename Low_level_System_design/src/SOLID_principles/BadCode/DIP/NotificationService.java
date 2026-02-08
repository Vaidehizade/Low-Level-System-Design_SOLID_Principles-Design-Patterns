package SOLID_principles.BadCode.DIP;

public class NotificationService {

    private EmailService emailService;
    private SMSService smsService;

    public NotificationService(){
        this.emailService = new EmailService();
        this.smsService = new SMSService();
    }

    public void notifyByEmail(String msg){
        emailService.sendEmail(msg);
    }
    public void notifyBySMS(String msg){
        smsService.sendSMS(msg);
    }

    //this is tightly coupled if we want to add whatsapp service then we need to modify this class
}
