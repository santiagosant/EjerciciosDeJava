/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosDeHerenciaProfesor;

/**
 *
 * @author ITUOM
 */
public class ProfesorTitular extends Profesor{
        
    @Override
    public double calcularSueldo(){
        return super.calcularSueldo()*1.15;
    }
   
    
}
