package BehaviouralDesignPattern.MediatorPattern.GoodCode;

import BehaviouralDesignPattern.MediatorPattern.BadCode.User;

public class ChatUser {

    private String name;
    private ChatMediator chatMediator;

    public ChatUser(String name, ChatMediator chatMediator){
        this.name = name;
        this.chatMediator = chatMediator;
    }
    public void sendMessage(String msg){
        System.out.println(this.name + " sending msg "+ msg);
        chatMediator.sendMessage(msg,this);
//        for(ChatUser user: receipent){
//           user.receiveMessage(msg,receipent);
//        }
    }
    public String getName(){
        return name;
    }
    public void receiveMessage(String msg, ChatUser sender){
        System.out.println(this.name + " received message: '" + msg + " ' from " + sender.getName());
    }
}

