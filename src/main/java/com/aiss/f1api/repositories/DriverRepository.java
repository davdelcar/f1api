package com.aiss.f1api.repositories;

import com.aiss.f1api.models.DriverModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends CrudRepository<DriverModel, Long> {
    //Metodos por defecto que trae esta interfaz
    
}