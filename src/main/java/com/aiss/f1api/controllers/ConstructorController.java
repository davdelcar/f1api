package com.aiss.f1api.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.aiss.f1api.models.ConstructorModel;
import com.aiss.f1api.services.ConstructorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/constructor")
public class ConstructorController {
    @Autowired
    ConstructorService constructorService;


    @GetMapping("/getAll")
    public ArrayList<ConstructorModel> getConstructors(){
        return constructorService.getConstructors();
    }

    @GetMapping("/get/{id}")
    public Optional<ConstructorModel> getPorId(@PathVariable("id") Long Id){
        return constructorService.getPorId(Id);
    }

    @GetMapping("/filtradoPorAño")
    public ArrayList<ConstructorModel> getPorAño(@RequestParam("year") Integer year){
        return constructorService.getPorAño(year);
    }

    @PostMapping("/crearConstructor")
    public ConstructorModel saveConstructor(@RequestBody ConstructorModel constructor){
        return this.constructorService.saveConstructor(constructor);
    }

    @DeleteMapping("/borrar/{id}")
    public String deleteById(@PathVariable("id") Long Id){
        boolean ok = this.constructorService.deleteConstructor(Id);
        if (ok){
            return "Se elmino el constrructor con id "+Id;
        }else{
            return "No se pudo eliminar el constructor con Id"+Id;
        }
    }

    @PutMapping("/actualizarConst/{id}")
    public ConstructorModel updateConstructor(@PathVariable("id") Long id, @RequestBody ConstructorModel constructor){
        ConstructorModel constructor1 = constructorService.getPorId(id).get();
        constructor1.setId(constructor.getId());
        constructor1.setPos(constructor.getPos());
        constructor1.setTeam(constructor.getTeam());
        constructor1.setYear(constructor.getYear());
        return constructorService.saveConstructor(constructor1);
    }
    
}