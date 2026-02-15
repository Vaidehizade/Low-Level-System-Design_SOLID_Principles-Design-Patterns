package DesignPattern.CommandPattern.GoodCode;

public class UnderlinedText implements Command{

    private TextEditorII editor;
    public UnderlinedText(TextEditorII editor){
        this.editor = editor;
    }
    @Override
    public void execute() {
      editor.underlineText();
    }
}
