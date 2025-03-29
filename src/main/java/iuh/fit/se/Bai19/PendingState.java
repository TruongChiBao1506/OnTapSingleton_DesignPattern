package iuh.fit.se.Bai19;

public class PendingState implements OrderState{

    @Override
    public void handleOrder(Order order) {
        System.out.println("Order " + order.getOrderId() + " is pending");
        order.setState(new ProcessingState());
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order " + order.getOrderId() + " is cancelled");
        order.setState(new Cancelled());
    }

    @Override
    public String getStateName() {
        return "Pending";
    }
}
