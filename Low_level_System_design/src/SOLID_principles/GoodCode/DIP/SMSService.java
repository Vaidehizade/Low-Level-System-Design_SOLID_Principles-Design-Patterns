package SOLID_principles.GoodCode.DIP;

public class SMSService implements NotificationChannel{
    @Override
    public void send(String msg) {
        System.out.println("msged viaa SMS");
    }
}
