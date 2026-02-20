package CreationalDesignPattern.AbstractFactoryPattern.GoodCode;

public class MacOSScrollBar implements ScrollBar{
    @Override
    public void scroll() {
        System.out.println("rendering macos scroll bar");
    }
}
