package com.nutrition.dietPlan.Entity;

import com.nutrition.dietPlan.Entity.DietPlan;

public class DietPlanWithUser {
    private DietPlan dietPlan;
    private UserDTO user;

    public DietPlanWithUser(DietPlan dietPlan, UserDTO user) {
        this.dietPlan = dietPlan;
        this.user = user;
    }

    public DietPlan getDietPlan() {
        return dietPlan;
    }

    public void setDietPlan(DietPlan dietPlan) {
        this.dietPlan = dietPlan;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }
}
