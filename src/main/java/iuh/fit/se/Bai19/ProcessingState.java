package iuh.fit.se.Bai19;

public class ProcessingState implements OrderState{

    @Override
    public void handleOrder(Order order) {
        System.out.println("Order " + order.getOrderId() + " is processing");
        order.setState(new ShippedState());
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order " + order.getOrderId() + " is cancelled");
        order.setState(new Cancelled());
    }

    @Override
    public String getStateName() {
        return "Processing";
    }
}
