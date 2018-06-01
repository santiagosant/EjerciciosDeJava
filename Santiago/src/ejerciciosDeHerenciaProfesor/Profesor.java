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
public abstract class Profesor {
    
    private String nombre;
    private double sueldo; 

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
   
    
    
    public double calcularSueldo(){
        return this.sueldo;
    }
}
