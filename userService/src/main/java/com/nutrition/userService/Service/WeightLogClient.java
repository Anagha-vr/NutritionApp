package com.nutrition.userService.Service;


import com.nutrition.userService.Entity.WeightLogDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "weightLogService", url = "http://localhost:8084") // change port as needed
public interface WeightLogClient {

    @GetMapping("/api/weightlogs")
    List<WeightLogDTO> getAllWeightLogs();

    @PostMapping("/api/weightlogs")
    WeightLogDTO addWeightLog(@RequestBody WeightLogDTO weightLogDTO);

    @PutMapping("/api/weightlogs/{id}")
    WeightLogDTO updateWeightLog(@PathVariable Long id, @RequestBody WeightLogDTO weightLogDTO);

    @DeleteMapping("/api/weightlogs/{id}")
    void deleteWeightLog(@PathVariable Long id);
}

