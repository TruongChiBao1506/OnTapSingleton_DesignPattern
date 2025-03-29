package iuh.fit.se.Bai18;

public class MobileUIFactory implements UIFactory {
    public MobileUIFactory() {
        System.out.println("Mobile UI Factory created");
    }
    @Override
    public Button creatButton() {
        return new MobileButton();
    }

    @Override
    public Textfield createTextField() {
        return new MobileTextField();
    }
}
