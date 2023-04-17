package com.example.gymcollaboration.service;

import com.example.gymcollaboration.model.Workout;
import com.example.gymcollaboration.repository.WorkoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkoutServiceImpl implements WorkoutService {
    @Autowired
    private WorkoutRepository workoutRepository;

    @Override
    public Workout getWorkoutById(Long id) {
        return workoutRepository.findById(id).orElse(null);
    }

    @Override
    public Workout createWorkout(Workout workout) {
        // perform validation and other logic before saving the workout
        return workoutRepository.save(workout);
    }

    // add additional methods here, as needed
}
