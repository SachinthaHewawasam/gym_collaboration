package com.example.gymcollaboration.controller;

import com.example.gymcollaboration.model.WorkoutPartner;
import com.example.gymcollaboration.service.WorkoutPartnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/workout-partners")
public class WorkoutPartnerController {
    @Autowired
    private WorkoutPartnerService workoutPartnerService;

    @GetMapping("/{id}")
    public ResponseEntity<WorkoutPartner> getWorkoutPartnerById(@PathVariable Long id) {
        WorkoutPartner workoutPartner = workoutPartnerService.getWorkoutPartnerById(id);
        if (workoutPartner != null) {
            return ResponseEntity.ok(workoutPartner);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<WorkoutPartner> createWorkoutPartner(@RequestBody WorkoutPartner workoutPartner) {
        WorkoutPartner savedWorkoutPartner = workoutPartnerService.createWorkoutPartner(workoutPartner);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedWorkoutPartner);
    }

    // add additional endpoints here, as needed
}
