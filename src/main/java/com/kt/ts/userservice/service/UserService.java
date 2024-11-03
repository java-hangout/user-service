// UserService.java
package com.kt.ts.userservice.service;

import com.kt.ts.userservice.model.User;
import com.kt.ts.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user) {
        return userRepository.save(user);
    }

    public User getUser(String username) {
        return userRepository.findByUsername(username);
    }
    public User updateUser(User user) {
        return userRepository.save(user);
    }
}
