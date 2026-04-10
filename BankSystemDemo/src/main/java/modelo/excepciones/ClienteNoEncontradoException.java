/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.excepciones;

/**
 *
 * @author Admin
 */
public class ClienteNoEncontradoException extends SistemaBancarioException{

    private String idCliente;
    
    public ClienteNoEncontradoException(String message, String codigoError, String idCliente) {
        super(message, codigoError);
        this.idCliente = idCliente;
    }

    public String getIdCliente() {
        return idCliente;
    }
    
    @Override
    public String toString(){
       return "ClienteNoEncontradoException: El ID es " + this.idCliente;
    }
     
    
}
