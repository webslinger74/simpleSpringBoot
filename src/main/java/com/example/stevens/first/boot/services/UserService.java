package com.example.stevens.first.boot.services;

import com.example.stevens.first.boot.dto.UserDetailsDto;
import org.springframework.security.core.userdetails.UserDetailsService;


public interface UserService extends UserDetailsService {
    void saveUser(UserDetailsDto userDetailsDto);

}
