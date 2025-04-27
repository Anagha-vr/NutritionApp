package com.nutrition.userService.Service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.nutrition.userService.Entity.DietPlanDTO;

import java.util.List;

@FeignClient(name = "dietPlanService", url = "http://localhost:8082")
public interface DietPlanClient {

    @GetMapping("/dietplans/user/{userId}")
    List<DietPlanDTO> getDietPlansByUserId(@PathVariable("userId") Long userId);
    
    @PostMapping("/dietplans")
    DietPlanDTO createDietPlan(@RequestBody DietPlanDTO dietPlanDTO);

    @PutMapping("/dietplans")
    DietPlanDTO updateDietPlan(@RequestBody DietPlanDTO dietPlanDTO);

    @DeleteMapping("/dietplans/{id}")
    void deleteDietPlan(@PathVariable("id") Long id);
}
