package iuh.fit.se.Bai11;

public class StandardShipping implements ShippingStrategy {
    @Override
    public double calculateShippingCost(double weight, double distance) {
        return weight*0.5 + distance*0.1;
    }
}
