package com.nutrition.userService.Controller;


import com.nutrition.userService.Security.JwtUtil;
import com.nutrition.userService.Entity.LoginRequest;
import com.nutrition.userService.Entity.User;
import com.nutrition.userService.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest loginRequest) {
        User user = userRepository.findByLoginName(loginRequest.getLoginName())
                    .filter(u -> u.getPassword().equals(loginRequest.getPassword()))
                    .orElseThrow(() -> new RuntimeException("Invalid Credentials"));

        return jwtUtil.generateToken(user.getLoginName());
    }

}

