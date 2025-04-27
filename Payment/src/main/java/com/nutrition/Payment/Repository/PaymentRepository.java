package com.nutrition.Payment.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nutrition.Payment.Entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

	List<Payment> findByUserId(Long userId);
}
