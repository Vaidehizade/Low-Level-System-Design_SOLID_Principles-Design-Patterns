package BehaviouralDesignPattern.CommandPattern.GoodCode;

public class Button {
    //holding reference to any type of command
    private Command command;
    public void setCommand(Command command){
        this.command = command;
    }
    public void click(){
        command.execute();
    }
}
