/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosDeHerenciaProfesor;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ITUOM
 */
public class ProfesorTitularTest {
    
    @Test
    public void deberiaDar11500() {
        
        ProfesorTitular profe=new ProfesorTitular();
        profe.setSueldo(10000);
        double sueldo=profe.calcularSueldo();
        assertEquals(11500, sueldo, 0.0001);
    }
    
}
