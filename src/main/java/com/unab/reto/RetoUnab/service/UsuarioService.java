package com.unab.reto.RetoUnab.service;

import java.util.ArrayList;
import java.util.Optional;

import com.unab.reto.RetoUnab.models.UsuarioModel;
import com.unab.reto.RetoUnab.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository UsuarioRepository;

    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return (ArrayList<UsuarioModel>) UsuarioRepository.findAll();
    }

    public UsuarioModel guardarUsuario(UsuarioModel Usuario){
        return UsuarioRepository.save(Usuario);
    }
    public Optional<UsuarioModel> obtenerPorId(Long id){
        return UsuarioRepository.findById(id);
    }
    public boolean eliminarUsuario(Long id) {
        try{
            UsuarioRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }
    
}
