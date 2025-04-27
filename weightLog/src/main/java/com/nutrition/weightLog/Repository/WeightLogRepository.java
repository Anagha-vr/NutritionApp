package com.nutrition.weightLog.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nutrition.weightLog.Entity.WeightLog;

@Repository
public interface WeightLogRepository extends JpaRepository<WeightLog, Long> {
	

	List<WeightLog> findByUserId(Long userId);
}
