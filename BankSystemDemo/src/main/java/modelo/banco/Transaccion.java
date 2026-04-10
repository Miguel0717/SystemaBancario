/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.banco;

import java.time.LocalDateTime;
import modelo.enums.EstadoTransaccion;

/**
 *
 * @author Admin
 */
public class Transaccion {
    private String id;
    private Cuenta cuentaOrigen;
    private Cuenta cuentaDestino;
    private double monto;
    private EstadoTransaccion estado;
    private LocalDateTime fecha;
    private String descripcion;
    
    public void cambiarEstado(EstadoTransaccion nuevo) throws {
    
    }
    
    public String generarComprobante(){
        
    }
}
