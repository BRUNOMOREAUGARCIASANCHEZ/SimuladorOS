/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sim1;

/**
 *
 * @author HP
 */
public class Nodo {
     Nodo sig;
    char dato;

    Nodo(char x, Nodo enlace) {
        sig = enlace;
        dato = x;
    }
}
