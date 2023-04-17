package com.example.gymcollaboration.repository;

import com.example.gymcollaboration.model.User;
import com.example.gymcollaboration.model.Workout;
import com.example.gymcollaboration.model.WorkoutPartner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

// WorkoutPartnerRepository interface
@Repository
public interface WorkoutPartnerRepository extends JpaRepository<WorkoutPartner, Long> {
    List<WorkoutPartner> findByUser(User user);
    List<WorkoutPartner> findByWorkout(Workout workout);
}
