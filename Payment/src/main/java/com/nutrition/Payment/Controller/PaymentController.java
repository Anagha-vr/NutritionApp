package com.nutrition.Payment.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.nutrition.Payment.Entity.Payment;
import com.nutrition.Payment.Service.PaymentService;

import java.util.List;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    @Autowired
    private PaymentService service;

    @PostMapping("/pay")
    public Payment makePayment(@RequestBody Payment payment) {
        return service.pay(payment);
    }

    @PutMapping("/update")
    public Payment update(@RequestBody Payment payment) {
        return service.updatePayment(payment);
    }

    @PostMapping("/offer/{price}")
    public String setOffer(@PathVariable double price) {
        service.addOffer(price);
        return "Offer set to " + price;
    }

    @GetMapping("/user/{userId}")
    public List<Payment> getPaymentsByUserId(@PathVariable Long userId) {
        return service.getPaymentsByUserId(userId);
    }


}

