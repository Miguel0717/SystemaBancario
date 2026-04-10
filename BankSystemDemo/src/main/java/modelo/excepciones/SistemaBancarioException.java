/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.excepciones;

import java.time.LocalDateTime;

/**
 *
 * @author Admin
 */
public class SistemaBancarioException extends Exception{

    private String codigoError;
    private LocalDateTime timestamp;
    
    public SistemaBancarioException(String message, String codigoError) {
        super(message);
        this.codigoError = codigoError;
        this.timestamp = LocalDateTime.now();
    }

    public String getCodigoError() {
        return codigoError;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
    
    @Override
    public String toString() {        
        return "SistemaBancarioException Codigo Error: " + this.codigoError + " Timestamp: " + this.timestamp.toString(); 
    }
}
