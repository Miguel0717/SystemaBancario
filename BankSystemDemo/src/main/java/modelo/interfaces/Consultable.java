/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelo.interfaces;

/**
 *
 * @author Admin
 */
public interface Consultable {
    public String obtenerResumen(); //Retorna un texto con los datos principales de la entidad
    public boolean estaActivo(); //Indica si la entidad está operativa
    public String obtenerTipo(); //Retorna una cadena que identifica el tipo concreto
}
