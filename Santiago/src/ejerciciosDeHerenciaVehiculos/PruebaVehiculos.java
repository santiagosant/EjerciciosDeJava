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
public class PruebaVehiculos {
    public static void main(String[] args) {
        
        Vehiculos vehiculo1=new Vehiculos();
        System.out.println(vehiculo1.calcularAlquiler(10));
        Autos auto1=new Autos();
        System.out.println(auto1.calcularAlquiler(10, 5));
        Combis combi1=new Combis();
        System.out.println(combi1.calcularAlquiler(10, 5));
        CamionetasCarga cc1=new CamionetasCarga();
        System.out.println(cc1.calcularAlquiler(10, 50));
        Camiones camion1=new Camiones();
        System.out.println(camion1.calcularAlquiler(10));
    }
}
