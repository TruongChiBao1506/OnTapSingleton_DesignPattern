package iuh.fit.se.Bai1.services;

import iuh.fit.se.Bai1.logger.LoggerSingleton;

public class PaymentService {
    private LoggerSingleton logger = LoggerSingleton.getInstance();
    public void processPayment(String paymentId){
        logger.log("Payment processed" + paymentId);
        System.out.println("Payment created!"+ paymentId);
    }
}
