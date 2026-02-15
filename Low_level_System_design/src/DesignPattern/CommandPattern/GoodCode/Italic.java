package DesignPattern.CommandPattern.GoodCode;

public class Italic implements Command{

    private TextEditorII editor;
    public Italic(TextEditorII editor){
        this.editor = editor;
    }
    @Override
    public void execute() {
       editor.italicizeText();
    }
}
