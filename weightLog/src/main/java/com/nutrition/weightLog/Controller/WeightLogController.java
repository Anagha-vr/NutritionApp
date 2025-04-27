package com.nutrition.weightLog.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.nutrition.weightLog.Entity.WeightLog;
import com.nutrition.weightLog.Service.WeightLogService;

import java.util.List;

@RestController
@RequestMapping("/api/weightlogs")
public class WeightLogController {

    @Autowired
    private WeightLogService service;

    @PostMapping
    public WeightLog create(@RequestBody WeightLog log) {
        return service.addWeightLog(log);
    }

    @PutMapping("/{id}")
    public WeightLog update(@PathVariable Long id, @RequestBody WeightLog log) {
        log.setId(id);
        return service.updateWeightLog(log);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.removeWeightLog(id);
    }

    @GetMapping
    public List<WeightLog> getAll() {
        return service.showAllWeightLog();
    }
    
    @GetMapping("/user/{userId}")
    public List<WeightLog> getByUserId(@PathVariable Long userId) {
        return service.getWeightLogsByUserId(userId);
    }

}

