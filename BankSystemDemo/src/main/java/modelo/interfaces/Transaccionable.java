/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelo.interfaces;

/**
 *
 * @author Admin
 */
public interface Transaccionable {
    public void depositar(double monto)throws Exception;//Aumenta el saldo de la cuenta
    public void retirar(double monto)throws Exception;//Disminuye el saldo validando disponibilidad
    public void calcularComision(double monto);//Retorna el valor de la comisión según el tipo de cuenta
    public double consultarSaldo();//Retorna el saldo disponible actual
}