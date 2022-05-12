package com.aiss.f1api.services;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Optional;

import com.aiss.f1api.models.ConstructorModel;
import com.aiss.f1api.repositories.ConstructorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConstructorService {
    @Autowired
    ConstructorRepository constructorRepository;
    //Crear metodos (get,put,post....)
    public ArrayList<ConstructorModel> getConstructors(){
       return (ArrayList<ConstructorModel>) constructorRepository.findAll();
    }
    public ConstructorModel saveConstructor(ConstructorModel constructor){
        return constructorRepository.save(constructor);
    }
    public Optional<ConstructorModel> getPorId(Long id){
        return constructorRepository.findById(id);
    }
    public ArrayList<ConstructorModel> getPorAño(Integer year){
        return constructorRepository.findByYear(year);
    }
    public boolean deleteConstructor(Long id){
        try{
            constructorRepository.deleteById(id);
            return true;
        }catch (Exception err){
            return false;
        }
    }
}