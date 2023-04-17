package com.example.gymcollaboration.service;

import com.example.gymcollaboration.model.WorkoutPartner;

public interface WorkoutPartnerService {
    WorkoutPartner getWorkoutPartnerById(Long id);
    WorkoutPartner createWorkoutPartner(WorkoutPartner workoutPartner);
    // add additional methods here, as needed
}
