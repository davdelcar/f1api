package com.aiss.f1api.controllers;

import com.aiss.f1api.services.RaceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/race")
public class RaceController {
    @Autowired
    RaceService raceService;

    //@GetMapping()

    //@PostMapping()

    //@DeleteMapping()

    //@PutMapping()
    
}