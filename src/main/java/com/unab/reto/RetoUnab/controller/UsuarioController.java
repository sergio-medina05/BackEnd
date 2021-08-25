package com.unab.reto.RetoUnab.controller;

import java.util.ArrayList;
import java.util.Optional;

import com.unab.reto.RetoUnab.models.UsuarioModel;
import com.unab.reto.RetoUnab.service.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioService UsuarioService;
    
    @CrossOrigin(origins="*")
    @GetMapping()
    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return UsuarioService.obtenerUsuarios();
    }
    
    @CrossOrigin(origins="*")
    @PostMapping()
    public UsuarioModel guardarUsuario(@RequestBody UsuarioModel Usuario){
        return this.UsuarioService.guardarUsuario(Usuario);
    }

    @CrossOrigin(origins="*")
    @GetMapping( path = "/{id}")
    public Optional<UsuarioModel> obtenerPorId(@PathVariable("id") Long id) {
        return this.UsuarioService.obtenerPorId(id);
    }

    @CrossOrigin(origins="*")
    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.UsuarioService.eliminarUsuario(id);
        if (ok){
            return "Se eliminó el usuario con id " + id;
        }else{
            return "No pudo eliminar el usuario con id" + id;
        }
    }
}
