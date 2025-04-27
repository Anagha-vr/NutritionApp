package com.nutrition.nutritionPlan.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nutrition.nutritionPlan.Entity.NutritionPlan;
import com.nutrition.nutritionPlan.Repository.NutritionPlanRepository;

import java.util.List;

@Service
public class NutritionPlanServiceImpl implements NutritionPlanService {

    @Autowired
    private NutritionPlanRepository repository;

    @Override
    public NutritionPlan createPlan(NutritionPlan nutritionPlan) {
        return repository.save(nutritionPlan);
    }
    
    @Override
    public NutritionPlan getPlanById(Long id) {
        return repository.findById(id).orElseThrow(() -> 
            new RuntimeException("Nutrition Plan not found with ID: " + id));
    }


    @Override
    public NutritionPlan updateNutritionPlan(NutritionPlan plan) {
        if (repository.existsById(plan.getId())) {
            return repository.save(plan);
        } else {
            throw new RuntimeException("Nutrition Plan not found with ID: " + plan.getId());
        }
    }

    @Override
    public void removePlan(NutritionPlan nutritionPlan) {
        if (repository.existsById(nutritionPlan.getId())) {
            repository.delete(nutritionPlan);
        } else {
            throw new RuntimeException("Nutrition Plan not found with ID: " + nutritionPlan.getId());
        }
    }

    @Override
    public List<NutritionPlan> listAllPlans() {
        return repository.findAll();
    }

	
}
