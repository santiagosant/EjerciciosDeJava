package santiago;

import org.junit.Test;
import static org.junit.Assert.*;

public class calcuTest {
    
    @Test
    public void deberiaDar4LaSumaDe2Mas2() {
        
        calcu calculadora = new calcu();
        
        int resultado=calculadora.sumar(2, 2);
        
        assertEquals(4, resultado);
        
    }
    
    @Test
    public void deberiaDar0laSumaDe2masMenos2(){
       
        calcu calculadora = new calcu();
        
        int resultado=calculadora.sumar(2, -2);
        
        assertEquals(0, resultado);
           
        
    }
    
    @Test
    public void deberiaDar0SiDivido0Por2()throws Exception{
         calcu calculadora = new calcu();
        
        double resultado=calculadora.dividir(0, 2);
        
        assertEquals(0.0, resultado,0.0001);
        
    }
    
     @Test(expected = Error.class)
    public void deberiaFallarSiIntentoDividir2por0() throws Exception{
      
        calcu calculadora = new calcu();
        
        double resultado=calculadora.dividir(2,0);
        
        assertEquals(0.0, resultado,0.0001);
        
    }
    
}
