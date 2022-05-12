package com.aiss.f1api.repositories;

import java.util.ArrayList;

import com.aiss.f1api.models.ConstructorModel;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConstructorRepository extends JpaRepository<ConstructorModel, Long>{

    public abstract ArrayList<ConstructorModel> findByYear(Integer year);
    public abstract ArrayList<ConstructorModel> findAll (Pageable pageable);
}