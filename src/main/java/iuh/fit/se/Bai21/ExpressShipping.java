package iuh.fit.se.Bai21;

public class ExpressShipping implements ShippingStrategy{

    @Override
    public double calculateShippingCost(double weight, double distance) {
        return weight * 1 + distance * 2;
    }
}
