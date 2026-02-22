package CreationalDesignPattern.AbstractFactoryPattern.GoodCode;

public class WindowsScrollBar implements ScrollBar{
    @Override
    public void scroll() {
        System.out.println("scrolling the windows scroll bar");
    }
}
