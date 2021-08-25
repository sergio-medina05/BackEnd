package com.unab.reto.RetoUnab.controller;

import java.util.ArrayList;
import java.util.Optional;

import com.unab.reto.RetoUnab.models.PartidoModel;
import com.unab.reto.RetoUnab.service.PartidoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/partido")
public class PartidoController {
    @Autowired
    PartidoService PartidoService;
    
    @CrossOrigin(origins="*")
    @GetMapping()
    public ArrayList<PartidoModel> obtenerPartidos(){
        return PartidoService.obtenerPartidos();
    }
    
    @CrossOrigin(origins="*")
    @PostMapping()
    public PartidoModel guardarPartido(@RequestBody PartidoModel Partido){
        return this.PartidoService.guardarPartido(Partido);
    }

    @CrossOrigin(origins="*")
    @GetMapping( path = "/{id}")
    public Optional<PartidoModel> obtenerPorId(@PathVariable("id") Long id) {
        return this.PartidoService.obtenerPorId(id);
    }

    @CrossOrigin(origins="*")
    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.PartidoService.eliminarPartido(id);
        if (ok){
            return "Se eliminó el partido con id " + id;
        }else{
            return "No pudo eliminar el partido con id" + id;
        }
    }
}
