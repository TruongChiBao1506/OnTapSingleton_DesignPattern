package iuh.fit.se.Bai22;

public interface StockSubject {
    public void registerObserver(StockObserver observer);
    public void removeObserver(StockObserver observer);
    public void notifyObserver();
}
