package com.example.gymcollaboration.service;

import com.example.gymcollaboration.model.Gym;
import com.example.gymcollaboration.repository.GymRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GymServiceImpl implements GymService {
    @Autowired
    private GymRepository gymRepository;

    @Override
    public Gym getGymById(Long id) {
        return gymRepository.findById(id).orElse(null);
    }

    @Override
    public List<Gym> getAllGyms() {
        return gymRepository.findAll();
    }

    // add additional methods here, as needed
}
