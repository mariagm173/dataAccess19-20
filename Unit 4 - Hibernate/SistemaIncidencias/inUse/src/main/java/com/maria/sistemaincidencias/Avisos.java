package com.maria.sistemaincidencias;
// Generated 28-ene-2020 0:45:31 by Hibernate Tools 4.3.1


/**
 * Avisos generated by hbm2java
 */
public class Avisos  implements java.io.Serializable {

     private AvisosId id;
     private Equipos equipos;
     private Personas personas;
     private String descripcion;
     private String fechayhoraResolucion;
     private String detallesResolucion;

    public Avisos() {
    }
	
    public Avisos(AvisosId id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }
    
    public Avisos(AvisosId id, Equipos equipos, Personas personas, String descripcion, 
            String fechayhoraResolucion, String detallesResolucion) {
       this.id = id;
       this.equipos = equipos;
       this.personas = personas;
       this.descripcion = descripcion;
       this.fechayhoraResolucion = fechayhoraResolucion;
       this.detallesResolucion = detallesResolucion;
    }
   
    public AvisosId getId() {
        return this.id;
    }
    
    public void setId(AvisosId id) {
        this.id = id;
    }
    public Equipos getEquipos() {
        return this.equipos;
    }
    
    public void setEquipos(Equipos equipos) {
        this.equipos = equipos;
    }
    public Personas getPersonas() {
        return this.personas;
    }
    
    public void setPersonas(Personas personas) {
        this.personas = personas;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getFechayhoraResolucion() {
        return this.fechayhoraResolucion;
    }
    
    public void setFechayhoraResolucion(String fechayhoraResolucion) {
        this.fechayhoraResolucion = fechayhoraResolucion;
    }
    public String getDetallesResolucion() {
        return this.detallesResolucion;
    }
    
    public void setDetallesResolucion(String detallesResolucion) {
        this.detallesResolucion = detallesResolucion;
    }




}


