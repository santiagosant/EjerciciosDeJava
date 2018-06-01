/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosDeHerenciaProfesor;

/**
 *
 * @author ITUOM
 */
public class ProfesorSuplente extends Profesor {

    private int dia;
    private int mes;
    private int anio;

    public void fechaDeFinalizacion(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public boolean suplenciaFinalizada(int dia, int mes, int anio) {
        return this.anio == anio || this.mes > mes && this.anio == anio || this.dia > dia && this.mes == mes && this.anio == anio;
    }//año=año ,,año=año dia>dia,,/año=año mes=mes dia<dia

}
