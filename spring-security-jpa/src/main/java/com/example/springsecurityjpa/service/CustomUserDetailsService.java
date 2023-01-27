package com.example.springsecurityjpa.service;

import com.example.springsecurityjpa.model.User;
import com.example.springsecurityjpa.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service

public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository repository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user=repository.findByusername(username);
        CustomUserDetails userDetails=null;
        if(user!=null){
            userDetails= new CustomUserDetails();
            userDetails.setUser(user);

        }else {
            throw new UsernameNotFoundException("user not exist with name: "+username);
        }
        return userDetails;
    }
}
