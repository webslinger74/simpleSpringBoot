package com.example.stevens.first.boot.services;

import com.example.stevens.first.boot.dto.UserDetailsDto;
import com.example.stevens.first.boot.models.User;
import com.example.stevens.first.boot.repositories.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public void saveUser(UserDetailsDto userDetailsDto) {
        System.out.println("details have been saved");
        User user = new User();
        BeanUtils.copyProperties(userDetailsDto, user);
        userRepository.save(user);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}