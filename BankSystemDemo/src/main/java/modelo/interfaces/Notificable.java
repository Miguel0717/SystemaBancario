/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelo.interfaces;

/**
 *
 * @author Admin
 */
public interface Notificable {
    public void notificar(String mensaje); //Envía (imprime) un mensaje al cliente
    public String obtenerContrato(); //Retorna el correo electrónico o teléfono de contacto
    public boolean aceptaNotificaciones(); //Indica si el cliente tiene activadas las notificaciones
}
