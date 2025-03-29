package iuh.fit.se.Bai22;

public class Investor implements StockObserver{
    private String symbol;
    public Investor(String symbol){
        this.symbol = symbol;
    }
    @Override
    public void update(String symbol, double price) {
        if(this.symbol.equalsIgnoreCase(symbol)){
            System.out.println("Investor " + this.symbol + " has been notified that the price has changed to " + price);
        }
    }
}
