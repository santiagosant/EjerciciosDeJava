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
public class CuentaCorriente extends CuentaBancaria{
    
    private double descubierto;
    private double saldo;
       
    public CuentaCorriente(double descubierto, double saldo){
        this.descubierto=descubierto;
        super.extraer(saldo);
        this.saldo=saldo;
    }
    
    public CuentaCorriente(double saldo){
        this.descubierto=1000.0;
        super.extraer(saldo);
        this.saldo=saldo;
    }
    
    @Override
    public void extraer(double monto) {
       if (monto <= this.saldo+this.descubierto) {
       this.saldo -= monto;
     }
}
}
