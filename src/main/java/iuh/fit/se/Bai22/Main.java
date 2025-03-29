package iuh.fit.se.Bai22;

public class Main {
    public static void main(String[] args) {
        StockObserver o1 = new Investor("A");
        StockObserver o2 = new Investor("B");
        StockObserver o3 = new Investor("C");

        StockPrice system = new StockPrice();
        system.registerObserver(o1);
        system.registerObserver(o2);
        system.registerObserver(o3);

        system.eventOccurred(100);

        system.removeObserver(o2);
        system.eventOccurred(200);
    }
}
