package iuh.fit.se.Bai18;

public class DesktopUIFactory implements UIFactory{

    public DesktopUIFactory() {
        System.out.println("DesktopUIFactory created");
    }
    @Override
    public Button creatButton() {
        return new DesktopButton();
    }

    @Override
    public Textfield createTextField() {
        return new DesktopTextField();
    }
}
