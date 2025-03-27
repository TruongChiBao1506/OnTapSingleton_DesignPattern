package iuh.fit.se.Bai9;

public class CancelledState implements OrderState{

    @Override
    public void handleOrder(OrderContext context) {
        System.out.println("Cancelling order and processing refund...");
        // Giả lập hủy đơn và hoàn tiền
        System.out.println("Order has been cancelled and refunded. No further actions allowed.");
    }

    @Override
    public String getStateName() {
        return "Cancelled";
    }
}
