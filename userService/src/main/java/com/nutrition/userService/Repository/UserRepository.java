package com.nutrition.userService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nutrition.userService.Entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUserIdentification(String userIdentification);
    Optional<User> findByLoginName(String loginName);
}

