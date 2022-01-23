package com.example.stevens.first.boot.controllers;

import com.example.stevens.first.boot.dto.UserDetailsDto;
import com.example.stevens.first.boot.exceptions.ExceptionMessages;
import com.example.stevens.first.boot.exceptions.UserServiceException;
import com.example.stevens.first.boot.requests.UserDetails;
import com.example.stevens.first.boot.services.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/firstController")
public class firstController {

    // http://localhost:8080/firstController

    @Autowired
    private UserService userService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @GetMapping
    public MyResponseClass getTheData() {
        String uri3 = "https://v2.jokeapi.dev/info";
        RestTemplate restTemplate = new RestTemplate();

        MyResponseClass responseClass = restTemplate.getForObject(uri3, MyResponseClass.class);
        return responseClass;
    }

    @PostMapping
    public void createUser(@RequestBody UserDetails userDetails) throws UserServiceException {
        UserDetailsDto userDetailsDto = new UserDetailsDto();
        BeanUtils.copyProperties(userDetails, userDetailsDto);
        String encryptedPassword = bCryptPasswordEncoder.encode(userDetailsDto.getPassword());
        userDetailsDto.setPassword(encryptedPassword);
        if (userDetails.getAge() == 0) {
            throw new UserServiceException(ExceptionMessages.USER_NOT_FOUND.getMessage());
        }
        userService.saveUser(userDetailsDto);

    }
}
