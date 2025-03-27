package iuh.fit.se.Bai9;

public class NewlyCreatedState implements OrderState{

    @Override
    public void handleOrder(OrderContext context) {
        System.out.println("Checking order information...");

        System.out.println("Order information is valid. Moving to processing state.");

        context.setState(new ProcessingState());
    }

    @Override
    public String getStateName() {
        return "Newly Created";
    }
}
