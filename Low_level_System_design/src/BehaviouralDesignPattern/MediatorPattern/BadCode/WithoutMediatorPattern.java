package BehaviouralDesignPattern.MediatorPattern.BadCode;

public class WithoutMediatorPattern {
    public static void main(String[] args) {
       User vaidehi = new User("Vaidehi");
       User amit = new User("Amit");

       //each object has to send msg like this
       vaidehi.sendMessage("hello", amit);
       amit.sendMessage("hi",vaidehi);

    }
}
