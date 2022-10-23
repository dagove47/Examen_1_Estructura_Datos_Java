/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen_1_Estructura_Datos_Java;

/**
 *
 * @author David Gomez, Gabriel Brilla, Gerald Blanco, Alexander Torres
 */
public class Nodo {
    
    private String plato;
    private Nodo nodoAnterior;
    
    public Nodo() {
        this.nodoAnterior = null;
    }
    
    public Nodo getNodoAnterior() {
        return nodoAnterior;
    }
    
    public String getPlato() {
        return plato;
    }
    
    public void setNodoAnterior(Nodo nodoAnterior) {
        this.nodoAnterior = nodoAnterior;
    }
    
    public void setPlato(String plato) {
        this.plato = plato;
    }
}
