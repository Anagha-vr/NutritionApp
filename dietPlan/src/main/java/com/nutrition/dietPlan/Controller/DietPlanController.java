package com.nutrition.dietPlan.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.nutrition.dietPlan.Entity.DietPlan;
import com.nutrition.dietPlan.Entity.DietPlanWithUser;
import com.nutrition.dietPlan.Entity.UserDTO;
import com.nutrition.dietPlan.Service.DietPlanService;
import com.nutrition.dietPlan.Service.DietPlanServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/dietplans")
public class DietPlanController {

    @Autowired
    private DietPlanServiceImpl service;

    @PostMapping
    public DietPlan create(@RequestBody DietPlan dietPlan) {
        return service.createDietPlan(dietPlan);
    }

    @PutMapping
    public DietPlan update(@RequestBody DietPlan dietPlan) {
        return service.changeDietPlan(dietPlan);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.removeDietPlan(id);
    }

    @GetMapping
    public List<DietPlan> list() {
        return service.listAllPlans();
    }
    
    @GetMapping("/{id}/with-user")
    public DietPlanWithUser getDietPlanWithUser(@PathVariable Long id) {
        DietPlan plan = service.getById(id);
        UserDTO user = service.getUserInfo(plan.getUserId());
        return new DietPlanWithUser(plan, user);
    }
    
    @GetMapping("/user/{userId}")
    public List<DietPlan> getPlansByUser(@PathVariable Long userId) {
        return service.getPlansByUserId(userId);
    }
    
 
    

}

