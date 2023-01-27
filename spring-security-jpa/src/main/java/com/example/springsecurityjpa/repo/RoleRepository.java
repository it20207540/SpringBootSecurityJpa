package com.example.springsecurityjpa.repo;

import com.example.springsecurityjpa.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface RoleRepository extends JpaRepository<Role,Integer> {

}
