/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.excepciones;

/**
 *
 * @author Admin
 */
public class SaldoInsuficienteException extends Exception{

    private double saldoActual;
    private double montoSolicitado;
    
    public SaldoInsuficienteException(String message, double saldoActual, double montoSolicitado) {
        super(message);
        this.saldoActual = saldoActual;
        this.montoSolicitado = montoSolicitado;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public double getMontoSolicitado() {
        return montoSolicitado;
    }
    
    @Override
    public String toString(){
        return "SaldoInsuficienteException: saldo insufuciente " + this.saldoActual + " monto solicitado " + this.montoSolicitado;
    }
    
}
