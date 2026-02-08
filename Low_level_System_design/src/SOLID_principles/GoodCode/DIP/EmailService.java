package SOLID_principles.GoodCode.DIP;

public class EmailService implements NotificationChannel{
    @Override
    public void send(String msg) {
       System.out.println("msged viaa email");
    }
}
