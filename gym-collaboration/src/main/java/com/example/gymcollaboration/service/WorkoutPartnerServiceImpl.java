package com.example.gymcollaboration.service;

import com.example.gymcollaboration.model.WorkoutPartner;
import com.example.gymcollaboration.repository.WorkoutPartnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkoutPartnerServiceImpl implements WorkoutPartnerService {
    @Autowired
    private WorkoutPartnerRepository workoutPartnerRepository;

    @Override
    public WorkoutPartner getWorkoutPartnerById(Long id) {
        return workoutPartnerRepository.findById(id).orElse(null);
    }

    @Override
    public WorkoutPartner createWorkoutPartner(WorkoutPartner workoutPartner) {
        // perform validation and other logic before saving the workout partner
        return workoutPartnerRepository.save(workoutPartner);
    }

    // add additional methods here, as needed
}
