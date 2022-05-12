package com.aiss.f1api.services;

import com.aiss.f1api.models.RaceModel;
import com.aiss.f1api.repositories.RaceRepository;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RaceService {
    @Autowired
    RaceRepository raceRepository;
    //Crear metodos (get,put,post....)
    public ArrayList<RaceModel> getRaces(){
        return (ArrayList<RaceModel>) raceRepository.findAll();
    }
    public RaceModel saveRace(RaceModel race){
        return raceRepository.save(race);
    }
    public Optional<RaceModel> getPorId(Long id){
        return raceRepository.findById(id);
    }
    public boolean deleteRace(Long id){
        try{
            raceRepository.deleteById(id);
            return true;
        }catch (Exception err){
            return false;
        }
     }
    
}