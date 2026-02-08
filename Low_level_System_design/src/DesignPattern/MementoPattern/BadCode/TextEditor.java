package DesignPattern.MementoPattern.BadCode;

public class TextEditor {

    private String content;
    // we can store the list of content in a stack but if we write this code here then will violate SRP
    public void write(String text){
        this.content = text;
    }

    public String getContent(){
        return content;
    }
}
