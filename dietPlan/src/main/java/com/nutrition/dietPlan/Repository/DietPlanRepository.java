package com.nutrition.dietPlan.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nutrition.dietPlan.Entity.DietPlan;

@Repository
public interface DietPlanRepository extends JpaRepository<DietPlan, Long> {
	List<DietPlan> findByUserId(Long userId);



}


