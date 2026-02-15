package DesignPattern.BadCode;

public class TextEditoMain {

    public static void main(String[] args){
        TextEditor editor = new TextEditor();
        editor.write("Hello world!");
        editor.write("Hello everyone");
        System.out.println(editor.getContent());
        //Problem ---> undo the last write!
    }
}
