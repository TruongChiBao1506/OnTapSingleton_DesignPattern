package iuh.fit.se.Bai19;

public class Delivered implements OrderState{

    @Override
    public void handleOrder(Order order) {
        System.out.println("Order " + order.getOrderId() + " is delivered");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order " + order.getOrderId() + " is already delivered");

    }

    @Override
    public String getStateName() {
        return "Delivered";
    }
}
