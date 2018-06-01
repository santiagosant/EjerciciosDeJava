/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicosDePrueba;

/**
 *
 * @author ITUOM
 */
public class Invitacion {

    private int adultos;
    private int menores;
    private boolean confirmada;

    public Invitacion(int adultos, int menores) {
        this.adultos = adultos;
        this.menores = menores;
        this.confirmada = false;
    }

    public int obtenerAdultos() {
        return this.adultos;
    }

    public int obtenerMenores() {
        return this.menores;
    }

    public boolean estaConfirmada() {
        return this.confirmada;
    }

    public void confirmar() {
        this.confirmada = true;
    }

}
