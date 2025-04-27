package com.nutrition.Payment.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nutrition.Payment.Entity.Payment;
import com.nutrition.Payment.Repository.PaymentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepository repository;

    private double offerPrice = 0;

    @Override
    public Payment pay(Payment payment) {
        payment.setDiscount(offerPrice);
        payment.setPayment(payment.getPayment() - offerPrice);
        return repository.save(payment);
    }

    @Override
    public void addOffer(double offer) {
        this.offerPrice = offer;
    }

    @Override
    public List<Payment> getPaymentsByUserId(Long userId) {
        return repository.findByUserId(userId);
    }


    @Override
    public Payment updatePayment(Payment payment) {
        return repository.save(payment);
    }

	
}

