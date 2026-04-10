/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelo.interfaces;

import java.time.LocalDateTime;

/**
 *
 * @author Admin
 */
public interface Auditable {
    public LocalDateTime obtenerFechaCreacion();//Retorna la fecha en que se creó la entidad
    public LocalDateTime obtenerUltimaModificacion();//Retorna la fecha del último cambio registrado
    public String obtenerUsuarioModificacion();//Retorna el legado del usuario que hizo el último cambio
    public void registrarModificacion(String usuario);//Actualiza la fecha y el usuario de modificación
}
