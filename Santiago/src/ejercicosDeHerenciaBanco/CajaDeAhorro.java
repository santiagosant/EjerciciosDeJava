/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicosDeHerenciaBanco;

/**
 *
 * @author ITUOM
 */
public class CajaDeAhorro extends CuentaBancaria{
       
    private double tasaDeInteres;
    private double saldoInicial;
    protected double saldoTotal;
    
    public CajaDeAhorro(double tasaDeInteres,double saldoInicial){
        this.tasaDeInteres=tasaDeInteres;
        super.extraer(saldoInicial);
        this.saldoInicial=saldoInicial;
    }
    
    public double saldoTotal(int meses){
        saldoTotal = saldoTotal + (meses * (this.tasaDeInteres/100) * this.saldoInicial);
        super.depositar(saldoTotal);
        return saldoTotal;
    }
        
}
