package com.aiss.f1api.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.aiss.f1api.models.ConstructorModel;
import com.aiss.f1api.repositories.ConstructorRepository;
import com.aiss.f1api.services.ConstructorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.PageRequest;
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


    @GetMapping()
    public ArrayList<ConstructorModel> getConstructors(){
        return constructorService.getConstructors();
    }

    @GetMapping("{id}")
    public Optional<ConstructorModel> getPorId(@PathVariable("id") Long Id){
        return constructorService.getById(Id);
    }

    @GetMapping("/getByYear")
    public ArrayList<ConstructorModel> getByAño(@RequestParam("year") Integer year){
        return constructorService.getByYear(year);
    }
    @GetMapping("/query")
    public List<ConstructorModel> listarConstructores
    (@RequestParam(value="pageNo", defaultValue = "0", required = false) int pages,
    @RequestParam(value = "pageSize", defaultValue = "20", required = false) int size,
    @RequestParam(value = "sortBy", defaultValue = "id", required = false) String ordenarPor,
    @RequestParam(value = "sortDir", defaultValue = "asc", required = false) String sortDir){
        return constructorService.getAllCosntructors(pages, size, ordenarPor, sortDir);
    }   
    @PostMapping()
    public ConstructorModel saveConstructor(@RequestBody ConstructorModel constructor){
        return this.constructorService.saveConstructor(constructor);
    }

    @DeleteMapping("{id}")
    public String deleteById(@PathVariable("id") Long Id){
        boolean ok = this.constructorService.deleteConstructor(Id);
        if (ok){
            return "Se elmino el constrructor con id "+Id;
        }else{
            return "No se pudo eliminar el constructor con Id"+Id;
        }
    }

    @PutMapping("{id}")
    public ConstructorModel updateConstructor(@PathVariable("id") Long id, @RequestBody ConstructorModel constructor){
        ConstructorModel constructor1 = constructorService.getById(id).get();
        constructor1.setId(constructor.getId());
        constructor1.setPos(constructor.getPos());
        constructor1.setTeam(constructor.getTeam());
        constructor1.setYear(constructor.getYear());
        return constructorService.saveConstructor(constructor1);
    }
    
}