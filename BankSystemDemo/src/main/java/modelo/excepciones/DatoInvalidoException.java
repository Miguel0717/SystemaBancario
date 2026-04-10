/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.excepciones;

/**
 *
 * @author Admin
 */
public class DatoInvalidoException extends BancoRuntimeException{
    
    private String campo;
    private Object valorRecibido;
    
    public DatoInvalidoException(String message, String campo, Object valorRecibido) {
        super(message);
        this.campo = campo;
        this.valorRecibido = valorRecibido;
    }

    public String getCampo() {
        return campo;
    }

    public Object getValorRecibido() {
        return valorRecibido;
    } 
    
    @Override
    public String toString(){
        return "DatoInvalidoException: El campo: " + this.campo + " recibio este valor: " + this.valorRecibido.toString();
    }
}
