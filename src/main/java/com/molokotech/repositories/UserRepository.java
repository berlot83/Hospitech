package com.molokotech.repositories;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import com.molokotech.model.User;

@RestController
public interface UserRepository extends JpaRepository<User, Long>{
public User findByUsername(String username);
public List<User> findByIsActive(boolean isActive);
}
