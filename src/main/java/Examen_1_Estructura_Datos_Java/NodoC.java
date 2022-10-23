/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen_1_Estructura_Datos_Java;

/**
 *
 * @author David Gomez, Gabriel Brilla, Gerald Blanco, Alexander Torres
 */
public class NodoC {
    private String nombre;
    private String cedula;
    private String producto;
    private String total;
    private NodoC nodoAnterior;
    
    public String getNombre() {
        return nombre;
    }
    
    public String getCedula() {
        return cedula;
    }
    
    public String getProducto() {
        return producto;
    }
    
     public String getTotal() {
        return total;
    }
    
    public NodoC getNodoAnterior() {
        return nodoAnterior;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public void setTotal(String total) {
        this.total = total;
    }
    
    public void setNodoAnterior(NodoC nodoAnterior) {
        this.nodoAnterior = nodoAnterior;
    }

    public NodoC(String nombre, String cedula, String producto, String total) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.producto = producto;
        this.total = total;
    }
    
    public NodoC() {}
    
    @Override
    
    public String toString() {
        return nombre + " - " + cedula + " - " + producto  + " - " + total;
    }
}
