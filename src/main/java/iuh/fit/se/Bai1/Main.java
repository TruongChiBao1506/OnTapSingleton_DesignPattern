package iuh.fit.se.Bai1;

import iuh.fit.se.Bai1.services.OrderService;
import iuh.fit.se.Bai1.services.PaymentService;
import iuh.fit.se.Bai1.services.UserService;

public class Main {
    public static void main(String[] args) {

        OrderService orderService = new OrderService();
        UserService userService = new UserService();
        PaymentService paymentService = new PaymentService();

        orderService.createOrder("ORD12345");
        userService.loginUser("john_doe");
        paymentService.processPayment("PAY67890");
    }
}