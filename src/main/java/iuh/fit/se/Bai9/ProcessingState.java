package iuh.fit.se.Bai9;

public class ProcessingState implements OrderState{
    @Override
    public void handleOrder(OrderContext context) {
        System.out.println("Packing and shipping the order...");
        context.setState(new DeliveredState());
    }

    @Override
    public String getStateName() {
        return "Processing";
    }
}
