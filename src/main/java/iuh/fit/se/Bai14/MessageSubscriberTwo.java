package iuh.fit.se.Bai14;

public class MessageSubscriberTwo implements Observer{

    @Override
    public void update(String message) {
        System.out.println("MessageSubscriberTwo :: " + message);
    }
}
