package com.maria.harrypotterhibernate;
// Generated 27-ene-2020 16:20:30 by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;

/**
 * Personajes generated by hbm2java
 */
public class Personajes  implements java.io.Serializable {


     private int id;
     private Casas casas;
     private String nombre;
     private String varita;
     private Set<Rol> rols = new HashSet(0);
     private Set<Mascotas> mascotases = new HashSet(0);

    public Personajes() {
    }

    public Personajes(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    public Personajes(int id, Casas casas, String nombre, String varita) {
        this.id = id;
        this.nombre = nombre;
    }
    
    public Personajes(int id, Casas casas, String nombre, String varita, Set rols, Set mascotases) {
       this.id = id;
       this.casas = casas;
       this.nombre = nombre;
       this.varita = varita;
       this.rols = rols;
       this.mascotases = mascotases;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Casas getCasas() {
        return this.casas;
    }
    
    public void setCasas(Casas casas) {
        this.casas = casas;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getVarita() {
        return this.varita;
    }
    
    public void setVarita(String varita) {
        this.varita = varita;
    }
    public Set getRols() {
        return this.rols;
    }
    
    public void setRols(Set rols) {
        this.rols = rols;
    }
    public Set getMascotases() {
        return this.mascotases;
    }
    
    public void setMascotases(Set mascotases) {
        this.mascotases = mascotases;
    }
}


