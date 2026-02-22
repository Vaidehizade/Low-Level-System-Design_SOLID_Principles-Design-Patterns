package StructuralDesignPattern.AdapterPattern.GoodCode;

//legacy code: emailnotificationservice

import StructuralDesignPattern.AdapterPattern.GoodCode.NotificationService;

public class EmailNotificationService implements NotificationService {

    public void send(String to, String subject, String body){
        System.out.println("SEnding email to "+ to);
        System.out.println("Subject: "+ subject);
        System.out.println("Body: "+body);
    }

}
