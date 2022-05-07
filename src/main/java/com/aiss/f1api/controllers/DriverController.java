package com.aiss.f1api.controllers;

import com.aiss.f1api.services.DriverService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/driver")
public class DriverController {
    @Autowired
    DriverService driverService;

    //@GetMapping()

    //@PostMapping()

    //@DeleteMapping()

    //@PutMapping()
    
}