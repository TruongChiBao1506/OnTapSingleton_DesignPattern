package iuh.fit.se.Bai19;

public class ShippedState implements OrderState{

    @Override
    public void handleOrder(Order order) {
        System.out.println("Order " + order.getOrderId() + " is shipped");
        order.setState(new Delivered());
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order " + order.getOrderId() + " is already shipped");
    }

    @Override
    public String getStateName() {
        return "Shipped";
    }
}
