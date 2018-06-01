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
public class Partido {
    private int golLocal;
    private int golVisitante;

    public Partido (int golLocal,int golVisitante){
        this.golLocal=golLocal;
        this.golVisitante=golVisitante;
    }
    
    public int getGolLocal() {
        return golLocal;
    }

    public int getGolVisitante() {
        return golVisitante;
    }
    
    
}
