package com.unab.reto.RetoUnab.repository;

import java.util.ArrayList;

import com.unab.reto.RetoUnab.models.UsuarioModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UsuarioRepository  extends CrudRepository<UsuarioModel, Long> {
    
    
}
