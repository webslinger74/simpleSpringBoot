package com.example.stevens.first.boot.repositories;

import com.example.stevens.first.boot.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserRepository extends MongoRepository<User, String> {
    User findByName(String name);
}
