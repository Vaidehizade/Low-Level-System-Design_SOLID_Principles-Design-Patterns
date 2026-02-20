package CreationalDesignPattern.AbstractFactoryPattern.GoodCode;

public class WindowsButton implements Button{
    @Override
    public void render() {
        System.out.println("rendering the windows button");
    }
}
