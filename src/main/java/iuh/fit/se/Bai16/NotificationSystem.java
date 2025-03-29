package iuh.fit.se.Bai16;

import java.util.ArrayList;
import java.util.List;

public class NotificationSystem implements NotificationSubject{

    private List<NotificationObserver> users = new ArrayList<>();
    private String message;

    @Override
    public void registerObserver(NotificationObserver observer) {
        users.add(observer);
    }

    @Override
    public void removeObserver(NotificationObserver observer) {
        users.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        this.message = message;
        for (NotificationObserver observer : users) {
            observer.update(message, "EMAIL");
            observer.update(message, "SMS");
            observer.update(message, "PUSH");
        }
    }
    public void eventOccurred(String message) {
        System.out.println("Event occurred: " + message);
        notifyObservers(message);
    }
}
