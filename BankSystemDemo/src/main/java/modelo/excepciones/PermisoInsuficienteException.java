/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.excepciones;

/**
 *
 * @author Admin
 */
public class PermisoInsuficienteException extends BancoRuntimeException{
    
    public PermisoInsuficienteException(String message) {
        super(message);
    }
}
