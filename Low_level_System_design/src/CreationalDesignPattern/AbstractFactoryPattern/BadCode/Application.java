package CreationalDesignPattern.AbstractFactoryPattern.BadCode;


class WindowsButton{
    public void render(){
        System.out.println("rendering windows button");
    }
}
class WindowsScrollBar{
    public void render(){
        System.out.println("rendering windows scrollbar");
    }
}

//Mac UI Components
class MacOSButton{
    public void render(){
        System.out.println("rendering macos button");
    }
}
class MacOScrollBar{
    public void render(){
        System.out.println("rendering macos scrollbar");
    }
}
public class Application {
    public static void main(String[] args) {
        //Windows UI
        WindowsButton btn = new WindowsButton();
        WindowsScrollBar scrollbtn = new WindowsScrollBar();
        //will have to create same for macos but this is not logical for
        // same purpose will have to use
        //MAC UI
        //adn also tight coupling is there
        btn.render();
        scrollbtn.render();

    }
}
