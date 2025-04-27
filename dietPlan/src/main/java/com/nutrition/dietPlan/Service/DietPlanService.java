package com.nutrition.dietPlan.Service;

import java.util.List;

import com.nutrition.dietPlan.Entity.DietPlan;
import com.nutrition.dietPlan.Entity.UserDTO;

public interface DietPlanService {
    DietPlan createDietPlan(DietPlan dietPlan);
    DietPlan changeDietPlan(DietPlan dietPlan);
    void removeDietPlan(Long id);
    List<DietPlan> listAllPlans();
    DietPlan getById(Long id);
    UserDTO getUserInfo(Long userId);
    List<DietPlan> getPlansByUserId(Long userId);

    
}

