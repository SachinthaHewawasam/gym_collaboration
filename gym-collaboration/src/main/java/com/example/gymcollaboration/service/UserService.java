package com.example.gymcollaboration.service;

import com.example.gymcollaboration.model.User;

public interface UserService {
    User getUserById(Long id);
    User registerUser(User user);
    // add additional methods here, as needed
}
