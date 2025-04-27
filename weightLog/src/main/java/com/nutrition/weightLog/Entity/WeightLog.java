package com.nutrition.weightLog.Entity;



import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "weight_log")
@Data
public class WeightLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String createdAt;
    private String updatedAt;
    private Long userId;
    private double weight;
	
    public WeightLog(Long id, String createdAt, String updatedAt, Long userId, double weight) {
		super();
		this.id = id;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.userId = userId;
		this.weight = weight;
	}

	public WeightLog() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "WeightLog [id=" + id + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", userId=" + userId
				+ ", weight=" + weight + "]";
	}
    
	
	
    
}
