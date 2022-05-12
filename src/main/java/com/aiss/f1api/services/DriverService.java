package com.aiss.f1api.services;

import com.aiss.f1api.repositories.DriverRepository;

import java.util.ArrayList;
import java.util.Optional;

import com.aiss.f1api.models.DriverModel;
import com.aiss.f1api.repositories.DriverRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverService {
    @Autowired
    DriverRepository driverRepository;

    //Crear metodos (get,put,post....)
    public ArrayList<DriverModel> getDrivers(){
        return (ArrayList<DriverModel>) driverRepository.findAll();
    }
    public DriverModel saveDriver(DriverModel driver){
        return driverRepository.save(driver);
    }
    public Optional<DriverModel> getPorId(Long id){
        return driverRepository.findById(id);
    }
    public ArrayList<DriverModel> getPorAño(Integer year){
        return driverRepository.findByYear(year);
    }
    public boolean deleteDriver(Long id){
        try{
            driverRepository.deleteById(id);
            return true;
        }catch (Exception err){
            return false;
        }
     }
}