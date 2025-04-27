package com.nutrition.userService.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.nutrition.userService.Entity.DietPlanDTO;
import com.nutrition.userService.Entity.PaymentDTO;
import com.nutrition.userService.Entity.User;
import com.nutrition.userService.Entity.UserWithDietPlansDTO;
import com.nutrition.userService.Entity.WeightLogDTO;
import com.nutrition.userService.Service.DietPlanClient;
import com.nutrition.userService.Service.PaymentClient;
import com.nutrition.userService.Service.UserService;
import com.nutrition.userService.Service.WeightLogClient;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;
    
    @Autowired
    private DietPlanClient dietPlanClient;
    
    @Autowired
    private WeightLogClient weightLogClient;
    
    @Autowired
    private PaymentClient paymentClient;

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.registerUser(user);
    }

    @PostMapping("/authenticate")
    public User authenticate(@RequestParam String loginId, @RequestParam String password) {
        return userService.authenticateUser(loginId, password);
    }

    @GetMapping
    public List<User> listUsers() {
        return userService.listUsers();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        Optional<User> userOpt = userService.getUserById(id);
        return userOpt.map(ResponseEntity::ok)
                      .orElseGet(() -> ResponseEntity.notFound().build());
    }
    
    @GetMapping("/{userId}/dietplan")
    public ResponseEntity<UserWithDietPlansDTO> getUserWithDietPlans(@PathVariable Long userId) {
        UserWithDietPlansDTO userWithPlans = userService.getUserWithDietPlans(userId);
        return ResponseEntity.ok(userWithPlans);
    }



    @PutMapping("/{id}/toggle-status")
    public void toggleStatus(@PathVariable Long id) {
        userService.activateOrBlockUser(id);
    }

    @PutMapping("/update")
    public User updateProfile(@RequestBody User user) {
        return userService.profileUpdate(user);
    }

    @PutMapping("/change-password")
    public void changePassword(@RequestParam String loginName,
                               @RequestParam String oldPassword,
                               @RequestParam String newPassword) {
        userService.changePassword(loginName, oldPassword, newPassword);
    }
    
    @PostMapping("/{userId}/dietplan")
    public ResponseEntity<DietPlanDTO> createDietPlan(@PathVariable Long userId, @RequestBody DietPlanDTO dto) {
        dto.setUserId(userId); // ensure it links correctly
        return ResponseEntity.ok(dietPlanClient.createDietPlan(dto));
    }

    @PutMapping("/{userId}/dietplan")
    public ResponseEntity<DietPlanDTO> updateDietPlan(@PathVariable Long userId, @RequestBody DietPlanDTO dto) {
        dto.setUserId(userId);
        return ResponseEntity.ok(dietPlanClient.updateDietPlan(dto));
    }

    @DeleteMapping("/dietplan/{planId}")
    public ResponseEntity<Void> deleteDietPlan(@PathVariable Long planId) {
        dietPlanClient.deleteDietPlan(planId);
        return ResponseEntity.noContent().build();
    }
    
    

    @GetMapping("/weightlogs")
    public List<WeightLogDTO> getAllWeightLogs() {
        return weightLogClient.getAllWeightLogs();
    }

    @PostMapping("/{userId}/weightlog")
    public WeightLogDTO createWeightLog(@PathVariable Long userId, @RequestBody WeightLogDTO dto) {
        dto.setUserId(userId);
        return weightLogClient.addWeightLog(dto);
    }

    @PutMapping("/weightlog/{logId}")
    public WeightLogDTO updateWeightLog(@PathVariable Long logId, @RequestBody WeightLogDTO dto) {
        dto.setUserId(logId);
        return weightLogClient.updateWeightLog(logId, dto);
    }

    @DeleteMapping("/weightlog/{logId}")
    public void deleteWeightLog(@PathVariable Long logId) {
        weightLogClient.deleteWeightLog(logId);
    }
    
    @PostMapping("/payments")
    public PaymentDTO createPayment(@RequestBody PaymentDTO paymentDTO) {
        return paymentClient.createPayment(paymentDTO);
    }

    @GetMapping("/{userId}/payments")
    public List<PaymentDTO> getPaymentsByUserId(@PathVariable Long userId) {
        return paymentClient.getPaymentsByUserId(userId);
    }

    @DeleteMapping("/payments/{id}")
    public void deletePayment(@PathVariable Long id) {
        paymentClient.deletePayment(id);
    }

//    @PutMapping("/payments/{id}")
//    public PaymentDTO updatePayment(@PathVariable Long id, @RequestBody PaymentDTO paymentDTO) {
//        return paymentClient.updatePayment(id, paymentDTO);
//    }

}

