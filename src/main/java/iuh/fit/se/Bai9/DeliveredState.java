package iuh.fit.se.Bai9;

public class DeliveredState implements OrderState{

    @Override
    public void handleOrder(OrderContext context) {
        System.out.println("Updating order status to delivered.");
        // Giả lập cập nhật trạng thái
        System.out.println("Order is complete. No further actions allowed.");
    }

    @Override
    public String getStateName() {
        return "Delivered";
    }
}
