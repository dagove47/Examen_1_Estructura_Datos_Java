/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen_1_Estructura_Datos_Java;

/**
 *
 * @author David Gomez, Gabriel Brilla, Gerald Blanco, Alexander Torres
 */
public class Cola {
    private NodoC frente;
    private NodoC ultimo;



   public Cola() {
    }
    
    public void encola(NodoC newNodo){
        if(frente == null){
            frente = newNodo;
            ultimo = newNodo;
        } else{
            ultimo.setNodoAnterior(newNodo);
            ultimo=newNodo;
        }
    }
    
    public void preferencial(NodoC newNodo) {
        if(frente == null){
            frente = newNodo;
            ultimo = newNodo;
        } else{
            newNodo.setNodoAnterior(frente);
            frente = newNodo;
        }
    }



   public NodoC atiende(){
        NodoC aux = frente;
        if(frente!=null){
            frente=frente.getNodoAnterior();
            aux.setNodoAnterior(null);
        }
        return aux;
    }
    
    @Override
    public String toString(){
        String s="";
        NodoC aux=frente;
        while(aux!=null){
            s+=aux+"\n";
            aux=aux.getNodoAnterior();
        }
        return s;
    }
}
