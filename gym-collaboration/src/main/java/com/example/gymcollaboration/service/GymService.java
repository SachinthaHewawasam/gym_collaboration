package com.example.gymcollaboration.service;

import com.example.gymcollaboration.model.Gym;

import java.util.List;

public interface GymService {
    Gym getGymById(Long id);
    List<Gym> getAllGyms();
    // add additional methods here, as needed
}
