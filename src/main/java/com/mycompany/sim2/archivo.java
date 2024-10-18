package com.mycompany.sim2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class archivo {
    String nombre;
    int tipoAsignacion,tam;
    bloque primerBloque;
    int r=0,g=0,b=0;
    

    public archivo(String nombre, int tipoAsignacion, int tam, bloque primerBloque) {
        this.nombre = nombre;
        this.tipoAsignacion = tipoAsignacion;
        this.tam = tam;
        this.primerBloque = primerBloque;
        
    }

    public String getNombre() {
        return nombre;
    }

    public int getTipoAsignacion() {
        return tipoAsignacion;
    }

    public int getTam() {
        return tam;
    }

    public bloque getPrimerBloque() {
        return primerBloque;
    }
    
    
    
    
}
