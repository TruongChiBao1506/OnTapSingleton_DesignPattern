package iuh.fit.se.Bai14;

public class MessageSubscriberThree implements Observer{

    @Override
    public void update(String message) {
        System.out.println("MessageSubscriberThree :: " + message);
    }
}
