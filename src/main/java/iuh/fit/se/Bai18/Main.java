package iuh.fit.se.Bai18;

public class Main {
    public static void main(String[] args) {
        UIFactory desktopFactory = new DesktopUIFactory();
        UIFactory mobileFactory = new MobileUIFactory();

        Button desktopButton = desktopFactory.creatButton();
        Button mobileButton = mobileFactory.creatButton();
        mobileButton.createButton();
        desktopButton.createButton();

        Textfield desktopTextfield = desktopFactory.createTextField();
        Textfield mobileTextfield = mobileFactory.createTextField();
        desktopTextfield.createTextfield();
        mobileTextfield.createTextfield();
    }
}
