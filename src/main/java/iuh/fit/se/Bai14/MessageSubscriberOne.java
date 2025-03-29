package iuh.fit.se.Bai14;

public class MessageSubscriberOne implements Observer{

    @Override
    public void update(String message) {
        System.out.println("MessageSubscriberOne :: " + message);
    }
}
