package com.example.gymcollaboration.repository;

import com.example.gymcollaboration.model.Gym;
import com.example.gymcollaboration.model.User;
import com.example.gymcollaboration.model.Workout;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface WorkoutRepository extends JpaRepository<Workout, Long> {
    List<Workout> findByDateTimeBetween(LocalDateTime startDate, LocalDateTime endDate);
    List<Workout> findByUser(User user);
    List<Workout> findByGym(Gym gym);
    List<Workout> findByUserAndGym(User user, Gym gym);
}
