package com.unab.reto.RetoUnab.models;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "partidos")
public class PartidoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String usuario;
    private Long local;
    private Long visitante;
    private Calendar fecha;
    private int golLocal;
    private int golVisitante;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Long getLocal() {
        return this.local;
    }

    public void setLocal(Long local) {
        this.local = local;
    }

    public Long getVisitante() {
        return this.visitante;
    }

    public void setVisitante(Long visitante) {
        this.visitante = visitante;
    }

    public Calendar getFecha() {
        return this.fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public int getGolLocal() {
        return this.golLocal;
    }

    public void setGolLocal(int golLocal) {
        this.golLocal = golLocal;
    }

    public int getGolVisitante() {
        return this.golVisitante;
    }

    public void setGolVisitante(int golVisitante) {
        this.golVisitante = golVisitante;
    }

    

    
    
}
