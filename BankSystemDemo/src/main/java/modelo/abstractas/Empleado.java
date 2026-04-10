/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.abstractas;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author Admin
 */
public abstract class Empleado extends Persona {
    private String legajo;
    private LocalDate fechaContratacion;
    private double salarioBase;
    private boolean activo;

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public void setFechaContratacion(LocalDate fechaContratacion) {
        if (LocalDate.now().isAfter(fechaContratacion)){
            this.fechaContratacion = fechaContratacion;
        }        
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase > 0){
            this.salarioBase = salarioBase;
        }
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
       
    public String getLegajo() {
        return legajo;
    }

    public LocalDate getFechaContratacion() {
        return fechaContratacion;        
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public boolean isActivo() {
        return activo;
    }
    
    public abstract double calcularSalario();        
    
    public abstract double calcularAbono();
    
    public int calcularAntiguedad(){
        return LocalDate.now().getYear() - this.fechaContratacion.getYear();
    }
}
