/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen_1_Estructura_Datos_Java;

/**
 *
 * @author David Gomez, Gabriel Brilla, Gerald Blanco, Alexander Torres
 */
public class Pila {
    private Nodo topNodo;
    private int largo = 0;

    public boolean vacia() {
        return this.topNodo == null;
    }

    public void push() {
        this.largo++;
        Nodo newNodo = new Nodo();
        newNodo.setPlato("Plato " + this.largo);

        if(this.topNodo == null) {
            this.topNodo = newNodo;
        } else {
            newNodo.setNodoAnterior(this.topNodo);
            this.topNodo = newNodo;
        }
    }

    public String listarPila(){
        // Crea una copia de la pila.
        String listaFinal = "";

        // Recorre la pila hasta el ultimo node.
        if(!vacia()) {
            System.out.println(this.topNodo.getPlato());
            Nodo aux = this.topNodo;
            while(aux != null){
                listaFinal += aux.getPlato() + "\n";
                aux = aux.getNodoAnterior();
            }
        }
        return listaFinal;
    }
}
