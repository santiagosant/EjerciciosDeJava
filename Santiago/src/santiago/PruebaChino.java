/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package santiago;

import java.util.ArrayList;
import java.util.List;
import javax.swing.text.html.HTMLDocument;

/**
 *
 * @author ITUOM
 */
public class PruebaChino {
    public static void main(String[] args) {
    
        List<Productpo> misProductpos=new ArrayList<>();
        
        misProductpos.add(new Productpo(15, "Dove"));
        misProductpos.add(new Productpo(70, "lavandina"));
        misProductpos.add(new Productpo(45, "Axe"));
        int precioTotal=0;
        
//        Iterable<Productpo> iterador = Productpo.iterador
                
                
        
        //for(Productpo prod:misProductpos){
        //    precioTotal+=prod.getPrecio();
        //}
        System.out.println("Precio Total $"+precioTotal);
    }
}
