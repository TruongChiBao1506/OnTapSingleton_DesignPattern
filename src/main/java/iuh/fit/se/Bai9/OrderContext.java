package iuh.fit.se.Bai9;

public class OrderContext {
    private OrderState state;
    private String orderId;

    public OrderContext(String orderId) {
        state = new NewlyCreatedState();
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
    public String getStateName() {
        return state.getStateName();
    }
}
