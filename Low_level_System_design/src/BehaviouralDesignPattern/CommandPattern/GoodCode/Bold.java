package BehaviouralDesignPattern.CommandPattern.GoodCode;

public class Bold implements Command{

    private TextEditorII editor;

    public Bold(TextEditorII editor)
    {
        this.editor = editor;
    }
    @Override
    public void execute() {
        editor.boldText();
    }
}
