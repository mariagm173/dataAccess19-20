package com.maria.sistemaincidencias;
// Generated 28-ene-2020 0:45:31 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Equipos generated by hbm2java
 */
public class Equipos  implements java.io.Serializable {


     private int codigo;
     private String nombre;
     private String ubicacion;
     private Set<Avisos> avisoses = new HashSet(0);

    public Equipos() {
    }

	
    public Equipos(int codigo, String nombre, String ubicacion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }
    public Equipos(int codigo, String nombre, String ubicacion, Set avisoses) {
       this.codigo = codigo;
       this.nombre = nombre;
       this.ubicacion = ubicacion;
       this.avisoses = avisoses;
    }
   
    public int getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getUbicacion() {
        return this.ubicacion;
    }
    
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public Set getAvisoses() {
        return this.avisoses;
    }
    
    public void setAvisoses(Set avisoses) {
        this.avisoses = avisoses;
    }




}


