package com.nutrition.userService.Entity;

public class DietPlanDTO {
    private Long id;
    private Long userId;
    private Long slots;
    private String foodType;
    private double proteinRatio;
    private double fatRatio;
    private double carbsRatio;
    private double total;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getSlots() {
		return slots;
	}
	public void setSlots(Long slots) {
		this.slots = slots;
	}
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	public double getProteinRatio() {
		return proteinRatio;
	}
	public void setProteinRatio(double proteinRatio) {
		this.proteinRatio = proteinRatio;
	}
	public double getFatRatio() {
		return fatRatio;
	}
	public void setFatRatio(double fatRatio) {
		this.fatRatio = fatRatio;
	}
	public double getCarbsRatio() {
		return carbsRatio;
	}
	public void setCarbsRatio(double carbsRatio) {
		this.carbsRatio = carbsRatio;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}

}
