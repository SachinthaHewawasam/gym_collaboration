package com.example.gymcollaboration.service;

import com.example.gymcollaboration.model.User;
import com.example.gymcollaboration.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User registerUser(User user) {
        // perform validation and other logic before saving the user
        return userRepository.save(user);
    }

    // add additional methods here, as needed
}
