package com.aiss.f1api.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.aiss.f1api.models.ConstructorModel;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ConstructorRepository extends JpaRepository<ConstructorModel, Long>, JpaSpecificationExecutor<ConstructorModel> {
    List<ConstructorModel> findByYear(Integer year);
    
}