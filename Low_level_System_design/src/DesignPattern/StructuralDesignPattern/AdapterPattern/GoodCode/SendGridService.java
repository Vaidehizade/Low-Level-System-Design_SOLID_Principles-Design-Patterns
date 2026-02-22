package StructuralDesignPattern.AdapterPattern.GoodCode;

public class SendGridService {

    public void sendEmail(String recepient, String title, String content){
        System.out.println("Sending email via sendgrid to "+ recepient);
        System.out.println("Title: "+title);
        System.out.println("Content: "+content);


    }
}
