package CreationalDesignPattern.AbstractFactoryPattern.GoodCode;

public class Application {

    private Button button;
    private ScrollBar scrollBar;

    public Application(UIFactory factory){
        this.button = factory.createButton();
        this.scrollBar = factory.createScrollBar();
    }
    public void renderUI(){
        button.render();
        scrollBar.scroll();
    }

    public static void main(String[] args) {
        UIFactory windowsFactory = new WindowsFactory();
        Application app = new Application(windowsFactory);
        app.renderUI();
        UIFactory macosFactory = new MacOSFactory();
        Application app2 = new Application(macosFactory);
        app2.renderUI();

        //we can easily switch by suuplying the correct factory (mac/win)
    }


}
