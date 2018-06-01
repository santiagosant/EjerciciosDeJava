/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santiago;

/**
 *
 * @author ITUOM
 */
public class Productpo {
    
    private double precio;
    private String nombre;
    
    public Productpo(double precio,String nombre){
        this.nombre=nombre;
        this.precio=precio;
    }

    public double getPrecio() {
        return precio;
    }
}
