/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santiago;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author ITUOM
 */
public class PruebaPartido {
    //goles visitantes
    public static void main(String[] args) {
    
    List<Partido> partido=new ArrayList<>();
    partido.add(new Partido(2, 3));
    partido.add(new Partido(2, 8));
    partido.add(new Partido(1, 0));
    partido.add(new Partido(5, 2));
    partido.add(new Partido(8, 4));
    int goleada=0;
    int golesVisitanteTotales=0;
    int partidoLocal=0;
   
    for(Partido part:partido){
        golesVisitanteTotales+=part.getGolVisitante();
        if (part.getGolLocal()>part.getGolVisitante()){
            partidoLocal++;
        }
    }
    for(Partido part:partido){
        if(part.getGolLocal()+3<=part.getGolVisitante()||part.getGolVisitante()+3<=part.getGolLocal()){
            goleada++;
        }
    }
        System.out.println(golesVisitanteTotales);
        System.out.println(partidoLocal);
        System.out.println(goleada);
  }
       
}
