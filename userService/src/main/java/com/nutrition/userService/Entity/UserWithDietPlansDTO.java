package com.nutrition.userService.Entity;

import java.util.List;

public class UserWithDietPlansDTO {
    private Long id;
    private String username;
    private String email;
    private List<DietPlanDTO> dietPlans;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<DietPlanDTO> getDietPlans() {
		return dietPlans;
	}
	public void setDietPlans(List<DietPlanDTO> dietPlans) {
		this.dietPlans = dietPlans;
	}

    
}