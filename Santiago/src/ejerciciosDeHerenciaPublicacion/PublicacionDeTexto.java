/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosDeHerenciaPublicacion;

/**
 *
 * @author ITUOM
 */
public class PublicacionDeTexto {
    
    private String texto;
    private int meGusta;
    private int comentario;

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
            
    public int darMeGusta(){
        this.meGusta++;
        return this.meGusta;
    }
    
    public int dejarComentario(){
        this.comentario++;
        return this.comentario;
    }
    
    public int yaNoMeGusta(){
        this.meGusta--;
        return this.meGusta;
    }    
    
    
    
}
