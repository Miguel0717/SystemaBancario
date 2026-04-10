/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.abstractas;

import java.time.LocalDate;

/**
 *
 * @author Admin
 */
public abstract class Persona {
    private String id;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private String email;

    public void setId(String id) {
        if (id != null && id.length() != 0) {
            this.id = id;
        } 
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        if (LocalDate.now().isAfter(fechaNacimiento)){
            this.fechaNacimiento = fechaNacimiento;
        }
    }

    public void setEmail(String email) {
        if (email.contains("@")){
            this.email = email;
        }
    }
        
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getEmail() {
        return email;
    }
    
    public String getNombreCompleto(){
        return this.nombre + " " + this.apellido;
    }
    
    public abstract int calcularEdad();
    
    public abstract String obtenerTipo();
    
    public abstract String obtenerDocumentoIdentidad();
    
}
