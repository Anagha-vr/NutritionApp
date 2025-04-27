package com.nutrition.Payment.Service;



import java.util.List;
import java.util.Optional;

import com.nutrition.Payment.Entity.Payment;

public interface PaymentService {
    Payment pay(Payment payment);
    Payment updatePayment(Payment payment);
    void addOffer(double offer); // Can apply logic in service
	List<Payment> getPaymentsByUserId(Long userId);
	
}

