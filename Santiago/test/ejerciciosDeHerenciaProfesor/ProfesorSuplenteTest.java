package ejerciciosDeHerenciaProfesor;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class ProfesorSuplenteTest {
    private ProfesorSuplente profe;
    
    @Before
    public void inicializador(){
        profe=new ProfesorSuplente();
        profe.fechaDeFinalizacion(27, 4, 2018);
}
    
   @Test
   public void laSuplenciaEstaFinalizada(){
       boolean finalizo = profe.suplenciaFinalizada(28, 4, 2018);
       assertTrue(finalizo);
   }
    @Test
    public void laSuplenciaEstaFinalizadaDiaAnterior(){
       boolean finalizo = profe.suplenciaFinalizada(26, 4, 2018);
       assertTrue(finalizo);
   }
     @Test
     public void laSuplenciaEstaFinalizadaMismoDia(){
       
       boolean finalizo = profe.suplenciaFinalizada(27, 4, 2018);
       assertTrue(finalizo);
   }
     
     @Test
    public void laSuplenciaEstaFinalizadaMismoDiaAñoDiferente(){
       
       boolean finalizo = profe.suplenciaFinalizada(27, 4, 2017);
       assertTrue(finalizo);
   }
}
