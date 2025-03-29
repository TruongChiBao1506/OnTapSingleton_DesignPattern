package iuh.fit.se.Bai11;

public class Main {
    public static void main(String[] args) {

        Order order = new Order(10, 100);
        order.setStrategy(new StandardShipping());
        System.out.println("Standard shipping cost: " + order.calculateShipping());

        order.setStrategy(new ExpressShipping());
        System.out.println("Express shipping cost: " + order.calculateShipping());

        order.setStrategy(new OvernightShipping());
        System.out.println("Overnight shipping cost: " + order.calculateShipping());
    }
}
