package iuh.fit.se.Bai1.services;

import iuh.fit.se.Bai1.logger.LoggerSingleton;

public class OrderService {

    private LoggerSingleton logger = LoggerSingleton.getInstance();
    public void createOrder(String orderId) {
        logger.log("Order created"+ orderId);
        System.out.println("Order created!" + orderId);
    }
}
