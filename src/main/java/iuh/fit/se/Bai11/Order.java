package iuh.fit.se.Bai11;

public class Order {
    private double weight;
    private double distance;
    private ShippingStrategy strategy;

    public Order(double weight, double distance) {
        this.weight = weight;
        this.distance = distance;
    }
    public void setStrategy(ShippingStrategy strategy) {
        this.strategy = strategy;
    }
    public double calculateShipping() {
        if(strategy == null) {
            throw new IllegalStateException("Strategy must be set before calculating shipping cost.");
        }
        return strategy.calculateShippingCost(weight, distance);
    }
}
