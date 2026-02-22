package BehaviouralDesignPattern.MediatorPattern.GoodCode;

import BehaviouralDesignPattern.MediatorPattern.BadCode.User;

public interface ChatMediator {
    void sendMessage(String msg,ChatUser user);
    void addUser(ChatUser user);
}
