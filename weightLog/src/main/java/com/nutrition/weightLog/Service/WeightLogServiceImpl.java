package com.nutrition.weightLog.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nutrition.weightLog.Entity.WeightLog;
import com.nutrition.weightLog.Repository.WeightLogRepository;

import java.util.List;

@Service
public class WeightLogServiceImpl implements WeightLogService {

    @Autowired
    private WeightLogRepository repository;

    @Override
    public WeightLog addWeightLog(WeightLog weightLog) {
        return repository.save(weightLog);
    }

    @Override
    public WeightLog updateWeightLog(WeightLog weightLog) {
        return repository.save(weightLog); // save also acts as update
    }

    @Override
    public void removeWeightLog(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<WeightLog> showAllWeightLog() {
        return repository.findAll();
    }
    
    @Override
    public List<WeightLog> getWeightLogsByUserId(Long userId) {
        return repository.findByUserId(userId);
    }

    
}

