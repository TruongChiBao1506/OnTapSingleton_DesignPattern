package iuh.fit.se.Bai19;


public class Order {
    private OrderState state;
    private String orderId;
    public Order(String orderId) {
        state = new PendingState();
        this.orderId = orderId;
    }
    public void setState(OrderState state) {
        this.state = state;
        System.out.println("Order state changed to: " + state.getStateName());
    }
    public void processOrder(){
        System.out.println("Processing order " + orderId + " in state: " + state.getStateName());
        state.handleOrder(this);
    }
    public String getOrderId() {
        return orderId;
    }
    public String getStateName(){
        return state.getStateName();
    }
    public void cancelOrder(){
        state.cancelOrder(this);
    }
}
