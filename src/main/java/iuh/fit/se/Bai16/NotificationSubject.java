package iuh.fit.se.Bai16;

public interface NotificationSubject {
    public void registerObserver(NotificationObserver observer);
    public void removeObserver(NotificationObserver observer);
    public void notifyObservers(String message);
}
