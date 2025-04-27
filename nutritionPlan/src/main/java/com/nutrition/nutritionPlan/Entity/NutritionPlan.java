package com.nutrition.nutritionPlan.Entity;



import jakarta.persistence.*;

@Entity
@Table(name = "nutrition_plans")
public class NutritionPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String planDescription;
    private String createdAt;
    private String updatedAt;
    private double price;
    private double weight;
    
	public NutritionPlan(Long id, String name, String planDescription, String createdAt, String updatedAt, double price,
			double weight) {
		super();
		this.id = id;
		this.name = name;
		this.planDescription = planDescription;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.price = price;
		this.weight = weight;
	}

	public NutritionPlan() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlanDescription() {
		return planDescription;
	}

	public void setPlanDescription(String planDescription) {
		this.planDescription = planDescription;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "NutritionPlan [id=" + id + ", name=" + name + ", planDescription=" + planDescription + ", createdAt="
				+ createdAt + ", updatedAt=" + updatedAt + ", price=" + price + ", weight=" + weight + "]";
	}

	
    
}


