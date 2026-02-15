package DesignPattern.MementoPattern.GoodCode;


public class TextEditorMain {
    public static void main(String[] args){
        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker(); //History / StateMgmt
        editor.write("Hello world!");
        caretaker.saveState(editor);
        editor.write("Hello everyone!");
        caretaker.saveState(editor);

        editor.write("Arena");
        caretaker.saveState(editor);
        editor.write("aries");

        caretaker.undo(editor);
        System.out.println(editor.getContent());
    }
}
