package com.nutrition.Payment.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double payment;
    private double discount;
    private String createdAt;
    private String updatedAt;
    private Long userId;
    private Long planId;
    
	public Payment(Long id, double payment, double discount, String createdAt, String updatedAt, Long userId,
			Long planId) {
		super();
		this.id = id;
		this.payment = payment;
		this.discount = discount;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.userId = userId;
		this.planId = planId;
	}

	public Payment() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getPayment() {
		return payment;
	}

	public void setPayment(double payment) {
		this.payment = payment;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getPlanId() {
		return planId;
	}

	public void setPlanId(Long planId) {
		this.planId = planId;
	}

	@Override
	public String toString() {
		return "Payment [id=" + id + ", payment=" + payment + ", discount=" + discount + ", createdAt=" + createdAt
				+ ", updatedAt=" + updatedAt + ", userId=" + userId + ", planId=" + planId + "]";
	}
	
	
    
    
}
