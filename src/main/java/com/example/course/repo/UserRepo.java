package com.example.course.repo;

import com.example.course.entities.PaymentHistory;
import com.example.course.entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepo extends CrudRepository<User, Integer> {
    boolean existsByUsername(String username);
    User findByUsername(String username);
}