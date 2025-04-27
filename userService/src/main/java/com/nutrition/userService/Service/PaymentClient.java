package com.nutrition.userService.Service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import com.nutrition.userService.Entity.PaymentDTO;

import java.util.List;

@FeignClient(name = "paymentService", url = "http://localhost:8085")
public interface PaymentClient {

    @PostMapping("/api/payments/pay")
    PaymentDTO createPayment(@RequestBody PaymentDTO paymentDTO);
    
    @GetMapping("/api/payments/user/{userId}")
    List<PaymentDTO> getPaymentsByUserId(@PathVariable("userId") Long userId);


    @DeleteMapping("/api/payments/{id}")
    void deletePayment(@PathVariable("id") Long id);

//    @PutMapping("/api/payments/update")
//    PaymentDTO updatePayment(@PathVariable("id") Long id, @RequestBody PaymentDTO paymentDTO);
}
