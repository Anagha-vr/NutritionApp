package com.nutrition.dietPlan.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.nutrition.dietPlan.Entity.DietPlan;
import com.nutrition.dietPlan.Entity.UserDTO;
import com.nutrition.dietPlan.Repository.DietPlanRepository;

import java.util.List;

@Service
public class DietPlanServiceImpl implements DietPlanService {

    @Autowired
    private DietPlanRepository repository;
    
    @Autowired
    private RestTemplate restTemplate;
   
    public UserDTO getUserInfo(Long userId) {
        return restTemplate.getForObject("http://userService/users/" + userId, UserDTO.class);
    }

    public List<DietPlan> getPlansByUserId(Long userId) {
        return repository.findByUserId(userId);
    }



    @Override
    public DietPlan createDietPlan(DietPlan dietPlan) {
        return repository.save(dietPlan);
    }

    @Override
    public DietPlan changeDietPlan(DietPlan dietPlan) {
        return repository.save(dietPlan); // save updates if ID is present
    }

    @Override
    public void removeDietPlan(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<DietPlan> listAllPlans() {
        return repository.findAll();
    }
    
    @Override
    public DietPlan getById(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Diet Plan not found"));
    }

}
