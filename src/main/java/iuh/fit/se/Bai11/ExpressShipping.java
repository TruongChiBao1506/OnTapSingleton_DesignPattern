package iuh.fit.se.Bai11;

public class ExpressShipping implements ShippingStrategy{
    @Override
    public double calculateShippingCost(double weight, double distance) {
        return weight * 1 + distance*0.2;
    }
}
