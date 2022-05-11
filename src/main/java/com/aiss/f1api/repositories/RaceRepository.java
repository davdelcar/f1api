package com.aiss.f1api.repositories;

import com.aiss.f1api.models.RaceModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RaceRepository extends CrudRepository<RaceModel, Long>{
    
}