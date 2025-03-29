package iuh.fit.se.Bai21;

public class ShippingCost {
    private double weight;
    private double distance;
    private ShippingStrategy strategy;

    public ShippingCost(double weight, double distance) {
        this.weight = weight;
        this.distance = distance;
    }
    public void setStrategy(ShippingStrategy strategy) {
        this.strategy = strategy;
    }
    public double calculate() {
        return strategy.calculateShippingCost(weight, distance);
    }
}
