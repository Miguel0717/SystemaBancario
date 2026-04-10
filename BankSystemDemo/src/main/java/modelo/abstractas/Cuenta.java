/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.abstractas;

import java.time.LocalDateTime;
import modelo.excepciones.CuentaBloqueadaException;

/**
 *
 * @author Admin
 */
public abstract class Cuenta {
    
    private static final int TAMANO_ARRAY = 20;
    
    private String numeroCuenta;
    private double saldo;
    private boolean bloqueada;
    private LocalDateTime fechaCreacion;
    private LocalDateTime ultimaModificacion;
    private String usuarioModificacion;

    //private Transaccion[] tx = new Transaccion[TAMANO_ARRAY];
    
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setBloqueada(boolean bloqueada) {
        this.bloqueada = bloqueada;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void setUltimaModificacion(LocalDateTime ultimaModificacion) {
        this.ultimaModificacion = ultimaModificacion;
    }

    public void setUsuarioModificacion(String usuarioModificacion) {
        this.usuarioModificacion = usuarioModificacion;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isBloqueada() {
        return bloqueada;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public LocalDateTime getUltimaModificacion() {
        return ultimaModificacion;
    }

    public String getUsuarioModificacion() {
        return usuarioModificacion;
    }
    
    public void verificarBloqueada() throws Exception{
        if (this.bloqueada){
            throw new CuentaBloqueadaException();
        }
    }
    
    public void agregarAlHistorial(Transaccion t) throws Exception {
        
    }
    
    public Transaccion[] getHistorial(){
        Transaction[]  = new Transaction[TAMANO_ARRAY];
        return System.arraycopy(origen, 0, destino, 0, 20);
    }
    
    public abstract double calcularIntereses();
    public abstract double getLimiteRetiro();
    public abstract double getTipoCuenta();
}
