/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sim1;

/**
 *
 * @author HP
 */
public class Particiones {
        private int tam;
    private boolean ocupado;

    public Particiones(int x){
        tam=x;
        ocupado=false;
    }

    public int tamano(){
        return tam;
    }

    public boolean isOcupado(){
        return ocupado;
    }

    public void setOcupado(boolean x){
        ocupado=x;
    }
}
