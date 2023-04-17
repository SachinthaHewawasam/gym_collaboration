package com.example.gymcollaboration.controller;

import com.example.gymcollaboration.model.Gym;
import com.example.gymcollaboration.service.GymService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/gyms")
public class GymController {
    @Autowired
    private GymService gymService;

    @GetMapping("/{id}")
    public ResponseEntity<Gym> getGymById(@PathVariable Long id) {
        Gym gym = gymService.getGymById(id);
        if (gym != null) {
            return ResponseEntity.ok(gym);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public List<Gym> getAllGyms() {
        return gymService.getAllGyms();
    }

    // add additional endpoints here, as needed
}
