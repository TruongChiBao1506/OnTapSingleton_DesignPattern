package iuh.fit.se.Bai19;

public class Cancelled implements OrderState{

    @Override
    public void handleOrder(Order order) {
        System.out.println("Order " + order.getOrderId() + " is cancelled");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order " + order.getOrderId() + " is already cancelled");
    }

    @Override
    public String getStateName() {
        return "Cancelled";
    }
}
