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
public class calcu {
    
    public int sumar(int n1, int n2){
        return n1+n2;
    }
    public double dividir(int n1,int n2)throws Exception{
        
        if (n2==0){
            throw new Error("no se divide por 0");
        }
        return (n1/n2);
    }
}
