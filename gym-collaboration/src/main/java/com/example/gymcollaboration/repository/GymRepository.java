package com.example.gymcollaboration.repository;

import com.example.gymcollaboration.model.Gym;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GymRepository extends JpaRepository<Gym, Long> {
    // add custom query methods here, if needed
}
