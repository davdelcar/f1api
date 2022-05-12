package com.aiss.f1api.controllers;

import com.aiss.f1api.services.RaceService;

import java.util.ArrayList;
import java.util.Optional;

import com.aiss.f1api.models.RaceModel;
import com.aiss.f1api.repositories.RaceRepository;

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
@RequestMapping("/race")
public class RaceController {
    @Autowired
    RaceService raceService;

    @GetMapping("/getAll")
    public ArrayList<RaceModel> getRaces(){
        return raceService.getRaces();
    }

    @GetMapping("/get/{id}")
    public Optional<RaceModel> getPorId(@PathVariable("id") Long Id){
        return raceService.getPorId(Id);
    }

    @PostMapping("/crearRace")
    public RaceModel saveRace(@RequestBody RaceModel race){
        return raceService.saveRace(race);
    }

    @DeleteMapping("/borrar/{id}")
    public String deleteById(@PathVariable("id") Long Id){
        boolean ok = this.raceService.deleteRace(Id);
        if (ok){
            return "Se elimino el race con id "+Id;
        }else{
            return "No se pudo eliminar el race con Id"+Id;
        }
    }

    @PutMapping("/actualizarRace/{id}")
    public RaceModel updateRace(@PathVariable("id") Long id, @RequestBody RaceModel race){
        RaceModel race1 = raceService.getPorId(id).get();
        race1.setId(race.getId());
        race1.setGp(race.getGp());
        race1.setFirst(race.getFirst());
        race1.setSecond(race.getSecond());
        race1.setThird(race.getThird());
        race1.setFourth(race.getFourth());
        race1.setFifth(race.getFifth());
        race1.setSixth(race.getSixth());
        race1.setSeventh(race.getSeventh());
        race1.setEighth(race.getEighth());
        race1.setNineth(race.getNineth());
        race1.setTenth(race.getTenth());
        return raceService.saveRace(race1);
    }
    
}