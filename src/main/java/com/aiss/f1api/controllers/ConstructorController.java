package com.aiss.f1api.controllers;

import com.aiss.f1api.services.ConstructorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/constructor")
public class ConstructorController {
    @Autowired
    ConstructorService constructorService;


    //@GetMapping()

    //@PostMapping()

    //@DeleteMapping()

    //@PutMapping()
    
}