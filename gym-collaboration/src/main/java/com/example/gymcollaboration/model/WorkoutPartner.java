package com.example.gymcollaboration.model;
import jakarta.persistence.*;
// WorkoutPartner model class
@Entity
@Table(name = "workout_partners")
public class WorkoutPartner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "workout_id", nullable = false)
    private Workout workout;

    // constructors, getters, and setters
}
