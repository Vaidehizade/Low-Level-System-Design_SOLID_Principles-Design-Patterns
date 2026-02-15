package DesignPattern.CommandPattern.GoodCode;


class TextEditorII{

    public void boldText(){
        System.out.println("text has been bolded");
    }
    public void italicizeText(){
        System.out.println("text has been italicized");
    }
    public void underlineText(){
        System.out.println("text has been underlined");
    }
}
public class CommandPattern {
    public static void main(String[] args) {
      TextEditorII txt = new TextEditorII();
      //create a button
        //decoupling ---> one button can do many actions without changing the texteditor
        Button button = new Button();
        button.setCommand(new Bold(txt));
        button.click();
        button.setCommand(new Italic(txt));
        button.click();
    }
}
