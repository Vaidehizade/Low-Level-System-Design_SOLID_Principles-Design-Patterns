package CreationalDesignPattern.AbstractFactoryPattern.GoodCode;

public class MacOSButton implements Button{
    @Override
    public void render() {
        System.out.println("rendering macos button");
    }
}
