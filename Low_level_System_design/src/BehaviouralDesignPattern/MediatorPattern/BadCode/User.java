package BehaviouralDesignPattern.MediatorPattern.BadCode;

//chat system
public class User{

    private String name;
    public User(String name){
        this.name = name;
    }
    public void sendMessage(String msg, User receipent){
        System.out.println(this.name + " sending msg "+ msg+ " " + receipent.getName());
    }
    public String getName(){
        return name;
    }

}
