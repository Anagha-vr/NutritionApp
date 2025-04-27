package com.nutrition.weightLog.Service;

import java.util.List;

import com.nutrition.weightLog.Entity.WeightLog;

public interface WeightLogService {
    WeightLog addWeightLog(WeightLog weightLog);
    WeightLog updateWeightLog(WeightLog weightLog);
    void removeWeightLog(Long id);
    List<WeightLog> showAllWeightLog();
    List<WeightLog> getWeightLogsByUserId(Long userId);

}

