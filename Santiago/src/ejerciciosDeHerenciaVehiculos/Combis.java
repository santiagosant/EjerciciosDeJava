/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosDeHerenciaVehiculos;

/**
 *
 * @author ITUOM
 */
public class Combis extends Vehiculos{
    
    public double calcularAlquiler(int dia,int asientos){
        return (dia*500)+(asientos*100);
    }
    
}
