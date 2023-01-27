package com.example.springsecurityjpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.springsecurityjpa.model.User;
import org.springframework.stereotype.Repository;

//@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByusername(String username);
}
