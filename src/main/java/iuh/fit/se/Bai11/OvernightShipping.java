package iuh.fit.se.Bai11;

public class OvernightShipping implements ShippingStrategy{
    @Override
    public double calculateShippingCost(double weight, double distance) {
        return weight*2 + distance*0.5;
    }
}
