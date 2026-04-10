/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.excepciones;

/**
 *
 * @author Admin
 */
public class CapacidadExcedidaException extends Exception{
   
    private int capacidadMaxima;

    public CapacidadExcedidaException( int capacidadMaxima,String message) {
        super(message);
        this.capacidadMaxima= capacidadMaxima;
    }    

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }
    
    @Override
    public String toString(){
        return "CapacidadExcedidaException: capacidad maxima " + this.capacidadMaxima;
    }
} 
