package iuh.fit.se.Bai21;

public class Main {
    public static void main(String[] args) {
        ShippingCost shippingCost = new ShippingCost(10, 5);
        shippingCost.setStrategy(new StandardShipping());
        System.out.println("Standard shipping cost: " + shippingCost.calculate());
        shippingCost.setStrategy(new ExpressShipping());
        System.out.println("Express shipping cost: " + shippingCost.calculate());
        shippingCost.setStrategy(new InternationalShipping());
        System.out.println("International shipping cost: " + shippingCost.calculate());
    }
}
