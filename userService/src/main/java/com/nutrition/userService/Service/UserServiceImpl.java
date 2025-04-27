package com.nutrition.userService.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.nutrition.userService.Entity.DietPlanDTO;
import com.nutrition.userService.Entity.User;
import com.nutrition.userService.Entity.UserWithDietPlansDTO;
import com.nutrition.userService.Repository.UserRepository;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private DietPlanClient dietPlanClient;
    
    
    public UserWithDietPlansDTO getUserWithDietPlans(Long userId) {
        // Step 1: Fetch user details from repository (or any service)
        Optional<User> optionalUser = userRepository.findById(userId);

        if (!optionalUser.isPresent()) {
            throw new RuntimeException("User not found with ID: " + userId);
        }

        User user = optionalUser.get();

        // Step 2: Use Feign client to fetch diet plans by user ID
        List<DietPlanDTO> plans = dietPlanClient.getDietPlansByUserId(userId);

        // Step 3: Map both into a custom response DTO
        UserWithDietPlansDTO response = new UserWithDietPlansDTO();
        response.setId(user.getId());
        response.setUsername(user.getName());
        response.setEmail(user.getEmail());
        response.setDietPlans(plans);

        return response;
    }


    @Override
    public User registerUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User authenticateUser(String loginId, String password) {
        Optional<User> userOpt = userRepository.findByLoginName(loginId);
        if (userOpt.isPresent() && userOpt.get().getPassword().equals(password)) {
            return userOpt.get();
        }
        return null;
    }

    @Override
    public List<User> listUsers() {
        return userRepository.findAll();
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void activateOrBlockUser(Long id) {
        Optional<User> userOpt = userRepository.findById(id);
        userOpt.ifPresent(user -> {
            user.setStatus(user.getStatus().equals("active") ? "blocked" : "active");
            userRepository.save(user);
        });
    }
    
    @Override
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }


    @Override
    public User profileUpdate(User user) {
        return userRepository.save(user);
    }

    @Override
    public void changePassword(String loginName, String oldPassword, String newPassword) {
        Optional<User> userOpt = userRepository.findByLoginName(loginName);
        if (userOpt.isPresent() && userOpt.get().getPassword().equals(oldPassword)) {
            User user = userOpt.get();
            user.setPassword(newPassword);
            userRepository.save(user);
        }
    }
    
    

	
}
