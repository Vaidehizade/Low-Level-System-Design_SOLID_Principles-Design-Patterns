package BehaviouralDesignPattern.MediatorPattern.GoodCode;

import BehaviouralDesignPattern.MediatorPattern.BadCode.User;

public class WithMediatorPattern {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();
        ChatUser vaidehi = new ChatUser("Vaidehi", chatRoom);
        ChatUser amit = new ChatUser("Amit", chatRoom);
        ChatUser neha = new ChatUser("Neha", chatRoom);

        chatRoom.addUser(vaidehi);
        chatRoom.addUser(amit);
        chatRoom.addUser(neha);

        vaidehi.sendMessage("hi everyone");
        amit.sendMessage("hello");
    }
}
