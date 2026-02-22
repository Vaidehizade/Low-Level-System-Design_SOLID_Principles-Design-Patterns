package BehaviouralDesignPattern.CommandPattern.BadCode;

class TextEditor{

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

//UI Button classes
class BoldButton{

    private final TextEditor editor;

    public BoldButton(TextEditor editor){
        this.editor = editor;
    }
    public void click(){
        editor.boldText();
    }
}

class ItalicButton{

    private TextEditor editor;

    public ItalicButton(TextEditor editor)
    {
        this.editor = editor;
    }
    public void click(){
        editor.italicizeText();
    }
}

class UnderlinedText{

    private final TextEditor editor;
    public UnderlinedText(TextEditor editor)
    {
        this.editor = editor;
    }
    public void click(){
        editor.underlineText();
    }

}
public class WithoutCommandPattern {
    public static void main(String[] args){
       TextEditor editor = new TextEditor();
        BoldButton boldButton = new BoldButton(editor);
        ItalicButton italicButton = new ItalicButton(editor);
        UnderlinedText underlinedButton = new UnderlinedText(editor);
        boldButton.click();
        italicButton.click();
        underlinedButton.click();
    }
}



