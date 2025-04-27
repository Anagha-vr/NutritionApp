package com.nutrition.nutritionPlan.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.nutrition.nutritionPlan.Entity.NutritionPlan;
import com.nutrition.nutritionPlan.Service.NutritionPlanService;

import java.util.List;

@RestController
@RequestMapping("/nutritionplans")
public class NutritionPlanController {

    @Autowired
    private NutritionPlanService service;

    // Create a new nutrition plan
    @PostMapping
    public NutritionPlan create(@RequestBody NutritionPlan nutritionPlan) {
        return service.createPlan(nutritionPlan);
    }

    // Get all nutrition plans
    @GetMapping
    public List<NutritionPlan> list() {
        return service.listAllPlans();
    }

    // Get a nutrition plan by ID
    @GetMapping("/{id}")
    public NutritionPlan getById(@PathVariable Long id) {
        return service.getPlanById(id);
    }

    // Update an existing nutrition plan
    @PutMapping("/{id}")
    public NutritionPlan update(@PathVariable Long id, @RequestBody NutritionPlan nutritionPlan) {
        nutritionPlan.setId(id); // ensure the path ID matches the request body
        return service.updateNutritionPlan(nutritionPlan);
    }

    // Delete a nutrition plan by ID
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        NutritionPlan plan = service.getPlanById(id); // validate and fetch before deleting
        service.removePlan(plan);
    }
}
