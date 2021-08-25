package com.unab.reto.RetoUnab.repository;

import java.util.ArrayList;

import com.unab.reto.RetoUnab.models.EquipoModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EquipoRepository  extends CrudRepository<EquipoModel, Long> {
    
    
}
