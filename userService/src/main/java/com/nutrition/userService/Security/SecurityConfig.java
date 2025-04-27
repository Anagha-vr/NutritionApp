package com.nutrition.userService.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable()) // disable CSRF for API
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/auth/login").permitAll() // allow /auth/login
                .anyRequest().authenticated()              // all other endpoints require authentication
            );
        return http.build();
    }
}
