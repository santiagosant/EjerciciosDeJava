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
public class PublicacionDeFoto extends PublicacionDeTexto{
    
    private String nombreDeFoto;
    private String personasEtiquetadas;

    public String getNombreDeFoto() {
        return nombreDeFoto;
    }

    public void setNombreDeFoto(String nombreDeFoto) {
        this.nombreDeFoto = nombreDeFoto;
    }

    public String getPersonasEtiquetadas() {
        return personasEtiquetadas;
    }

    public void setPersonasEtiquetadas(String personasEtiquetadas) {
        this.personasEtiquetadas = personasEtiquetadas;
    }
    
    
    
}
