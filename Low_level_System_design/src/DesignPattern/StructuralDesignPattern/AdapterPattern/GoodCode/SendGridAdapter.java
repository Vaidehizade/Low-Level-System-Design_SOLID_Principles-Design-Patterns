package StructuralDesignPattern.AdapterPattern.GoodCode;

import StructuralDesignPattern.AdapterPattern.GoodCode.SendGridService;

//our code is now easily extensible
public class SendGridAdapter implements NotificationService{


    //will wrap sendEmail method inside send (_)

    private final SendGridService sendGridService;
    public SendGridAdapter(SendGridService sendGridService){
          this.sendGridService = sendGridService;
    }
    @Override
    public void send(String to, String subject, String body) {
        //Adapter method --> convey parameters and calls to sendgrid method
        sendGridService.sendEmail(to, subject, body);
    }
}
