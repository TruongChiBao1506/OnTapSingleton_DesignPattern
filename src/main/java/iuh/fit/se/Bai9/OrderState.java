package iuh.fit.se.Bai9;

public interface OrderState {
    void handleOrder(OrderContext context);
    String getStateName();
}
