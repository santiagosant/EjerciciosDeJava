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
public class CuentaBancaria {
   
    protected double saldo;

    public double getSaldo() {
        return this.saldo;
}

public void depositar(double monto) {
        this.saldo += monto;
    }

public void extraer(double monto) {
    if (monto <= this.saldo) {
    this.saldo -= monto;
    }
}
    
}
