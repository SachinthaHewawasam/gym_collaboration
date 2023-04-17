package com.example.gymcollaboration.service;

import com.example.gymcollaboration.model.Workout;

public interface WorkoutService {
    Workout getWorkoutById(Long id);
    Workout createWorkout(Workout workout);
    // add additional methods here, as needed
}
