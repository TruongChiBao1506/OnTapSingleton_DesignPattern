package iuh.fit.se.Bai21;

public class InternationalShipping implements ShippingStrategy{

    @Override
    public double calculateShippingCost(double weight, double distance) {
        return weight * 3 + distance * 2;
    }
}
