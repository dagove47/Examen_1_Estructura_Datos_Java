/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen_1_Estructura_Datos_Java;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author David Gomez, Gabriel Brilla, Gerald Blanco, Alexander Torres
 */
public class Pila {
    private Nodo topNodo;
    private int totalCubiertos = 0;
    private int newCubiertos = 0;
    private int largo = 0;
    
    Random random = new Random();

    public boolean vacia() {
        return this.topNodo == null;
    }

    public void push() {
        this.largo++;
        Nodo newNodo = new Nodo();
        newNodo.setPlato("Plato " + this.largo + "- id." 
                + random.nextInt(9999)+1);
        /* Esta variable newCubiertos se va a utilizar en caso de que pidan
         * quitar los ultimos cubiertos que se agregaron */
        this.newCubiertos = addCubiertos();
        newNodo.setCubierto(this.totalCubiertos += this.newCubiertos);
        if(this.topNodo == null) {
            this.topNodo = newNodo;
        } else {
            this.topNodo.setCubierto(0);
            newNodo.setNodoAnterior(this.topNodo);
            this.topNodo = newNodo;
        }
    }

    public String listarPila(){
        // Crea una copia de la pila.
        String listaFinal = "";

        // Recorre la pila hasta el ultimo node.
        if(!vacia()) {
            Nodo aux = this.topNodo;
            while(aux != null){
                listaFinal += aux.getPlato() + " con " + aux.getCubierto() +
                        " cubiertos\n";
                aux = aux.getNodoAnterior();
            }
        }
        return listaFinal;
    }
    
    public int addCubiertos() {
        int loop = 0;
        int numCubiertos = 0;
        while(loop == 0) {
            numCubiertos = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite la cantidad de cubiertos que vienen con el traste " +
                            "sucio\n\n"));
            if(numCubiertos >= 0) {
                loop = 1;
            } else {
                JOptionPane.showMessageDialog(null,
                        "Numero invalido\n" +
                                "Digite un numero mayor o igual a cero\n\n");
            }
        }
        return numCubiertos;
    }
}
