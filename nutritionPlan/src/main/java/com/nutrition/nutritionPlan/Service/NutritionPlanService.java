package com.nutrition.nutritionPlan.Service;


import java.util.List;

import com.nutrition.nutritionPlan.Entity.NutritionPlan;

public interface NutritionPlanService {
    NutritionPlan createPlan(NutritionPlan nutritionPlan);
       void removePlan(NutritionPlan nutritionPlan);
    List<NutritionPlan> listAllPlans();
	NutritionPlan updateNutritionPlan(NutritionPlan plan);
	NutritionPlan getPlanById(Long id);
}

