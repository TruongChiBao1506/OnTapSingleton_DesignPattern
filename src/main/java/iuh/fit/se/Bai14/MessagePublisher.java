package iuh.fit.se.Bai14;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Subject{
    private List<Observer> observers = new ArrayList<>();
    private String message;
    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer o : observers)
            o.update(message);
    }

    public void setMessage(String message) {
        this.message = message;
        notifyObserver();
    }
}
