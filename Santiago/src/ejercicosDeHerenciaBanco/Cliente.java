/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicosDeHerenciaBanco;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ITUOM
 */
public class Cliente extends CuentaBancaria{
   
    private List<CuentaBancaria> cuentasBancarias=new ArrayList<>(); 
   
    public void agregarCuenta(CuentaBancaria cuenta){
        this.cuentasBancarias.add(cuenta);
    }
    
    public int cantidadDeCuentas(){
        return this.cuentasBancarias.size();
    }
    
    public double saldosTotal(){
        double saldosTotales=0;
        for (CuentaBancaria cuenta : this.cuentasBancarias){
            saldosTotales+=cuenta.getSaldo();
        }
        return saldosTotales;
    }
    
}
