package com.nutrition.nutritionPlan.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nutrition.nutritionPlan.Entity.NutritionPlan;

@Repository
public interface NutritionPlanRepository extends JpaRepository<NutritionPlan, Long> {

}

