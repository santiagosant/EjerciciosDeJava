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
public class Camiones extends Vehiculos{
    
    @Override
    public double calcularAlquiler(int dia){
        return super.calcularAlquiler(dia)+1000;
    }
    
}
