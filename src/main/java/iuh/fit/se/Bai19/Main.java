package iuh.fit.se.Bai19;

public class Main {
    public static void main(String[] args) {
        Order order = new Order("123");
        System.out.println("Order " + order.getOrderId() + " is in " + order.getStateName() + " state");
        order.processOrder();
        System.out.println("Order " + order.getOrderId() + " is in " + order.getStateName() + " state");
        order.processOrder();
        System.out.println("Order " + order.getOrderId() + " is in " + order.getStateName() + " state");
        order.processOrder();
        System.out.println("Order " + order.getOrderId() + " is in " + order.getStateName() + " state");
        order.processOrder();
        System.out.println("Order " + order.getOrderId() + " is in " + order.getStateName() + " state");
        order.processOrder();

        Order order2 = new Order("456");
        System.out.println("Order " + order2.getOrderId() + " is in " + order2.getStateName() + " state");
        order2.processOrder();
        System.out.println("Order " + order2.getOrderId() + " is in " + order2.getStateName() + " state");
        order2.cancelOrder();
        System.out.println("Order " + order2.getOrderId() + " is in " + order2.getStateName() + " state");
    }
}
