package iuh.fit.se.Bai19;

public interface OrderState {
    public void handleOrder(Order order);
    public void cancelOrder(Order order);
    public String getStateName();
}
