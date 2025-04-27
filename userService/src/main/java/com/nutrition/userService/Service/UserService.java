package com.nutrition.userService.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.nutrition.userService.Entity.User;
import com.nutrition.userService.Entity.UserWithDietPlansDTO;

@Service
public interface UserService {
    User registerUser(User user);
    User authenticateUser(String loginId, String password);
    List<User> listUsers();
    User createUser(User user);
    Optional<User> getUserById(Long id);
    void activateOrBlockUser(Long id);
    User profileUpdate(User user);
    void changePassword(String loginName, String oldPassword, String newPassword);
	UserWithDietPlansDTO getUserWithDietPlans(Long id);
}
