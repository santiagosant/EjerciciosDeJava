/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicosDeExepciones;

/**
 *
 * @author ITUOM
 */
public class IngresoASistema {

    private String nombreDeUsuario;
    private String contrasenia;

    public IngresoASistema(String nombreDeUsuario, String contrasenia) throws Exception {

        if (nombreDeUsuario.isEmpty() || contrasenia.isEmpty()) {
            throw new Error("No pueden ser vacios");
        }
        
        if (contrasenia.contains(" ")){
            throw new Error("No puede contener espacios");
        }

        if (contrasenia.length()<=7 ){
            throw new Error("Necesita minimo 8 caracteres");
        }
        
        if (!contrasenia.contains("0") && !contrasenia.contains("1") && !contrasenia.contains("2") && !contrasenia.contains("3")
                && !contrasenia.contains("4") && !contrasenia.contains("5") && !contrasenia.contains("6") && !contrasenia.contains("7")
                && !contrasenia.contains("8") && !contrasenia.contains("9")){
            throw new Error("Necesita al menos 1 numero");
        }
        
        this.nombreDeUsuario = nombreDeUsuario;
        this.contrasenia = contrasenia;

    }

    public void ingresar(String usuario, String contrasenia) throws Exception {
        if (!this.nombreDeUsuario.equals(usuario) || !this.contrasenia.equals(contrasenia)) {
            throw  new Error("Usuario o contraseñas incorrectas");
        }

    }

}
