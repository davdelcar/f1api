package com.aiss.f1api.controllers;

import com.aiss.f1api.services.DriverService;

import java.util.ArrayList;
import java.util.Optional;

import com.aiss.f1api.models.DriverModel;
import com.aiss.f1api.repositories.DriverRepository;

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
@RequestMapping("/driver")
public class DriverController {
    @Autowired
    DriverService driverService;

    @GetMapping("/getAll")
    public ArrayList<DriverModel> getDrivers(){
        return driverService.getDrivers();
    }

    @GetMapping("/get/{id}")
    public Optional<DriverModel> getPorId(@PathVariable("id") Long Id){
        return driverService.getPorId(Id);
    }

    @GetMapping("/filtradoPorAño")
    public ArrayList<DriverModel> getPorAño(@RequestParam("year") Integer year){
        return driverService.getPorAño(year);
    }

    @PostMapping("/crearDriver")
    public DriverModel saveDriver(@RequestBody DriverModel driver){
        return driverService.saveDriver(driver);
    }

    @DeleteMapping("/borrar/{id}")
    public String deleteById(@PathVariable("id") Long Id){
        boolean ok = this.driverService.deleteDriver(Id);
        if (ok){
            return "Se elimino el driver con id "+Id;
        }else{
            return "No se pudo eliminar el driver con Id"+Id;
        }
    }

    @PutMapping("/actualizarDriv/{id}")
    public DriverModel updateDriver(@PathVariable("id") Long id, @RequestBody DriverModel driver){
        DriverModel driver1 = driverService.getPorId(id).get();
        driver1.setId(driver.getId());
        driver1.setPos(driver.getPos());
        driver1.setName(driver.getName());
        driver1.setYear(driver.getYear());
        driver1.setNationality(driver.getNationality());
        driver1.setCar(driver.getCar());
        driver1.setPts(driver.getPts());
        return driverService.saveDriver(driver1);
    }
    
}