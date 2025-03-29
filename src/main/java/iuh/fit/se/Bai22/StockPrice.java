package iuh.fit.se.Bai22;

import java.util.ArrayList;
import java.util.List;

public class StockPrice implements StockSubject{
    private List<StockObserver> investors = new ArrayList<>();
    private double price;
    @Override
    public void registerObserver(StockObserver observer) {
        investors.add(observer);
    }

    @Override
    public void removeObserver(StockObserver observer) {
        investors.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (StockObserver observer : investors) {
            observer.update("A", price);
            observer.update("B", price);
            observer.update("C", price);
        }
    }
    public void eventOccurred(double price){
        this.price = price;
        System.out.println("Price changed to: " + price);
        notifyObserver();
    }
}
