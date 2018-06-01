package ejercicosDeExepciones;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import santiago.calcu;

public class AutoTest {

    private Auto auto;
    
    @Before
    public void inicializar(){
       auto=new Auto();
    }
    
    @Test
    public void deberiaEncender() throws Exception {

        auto.encender();
        auto.encerRadio();
        auto.avanzar();

    }

    @Test(expected = Error.class)
    public void NoDeberiaEncenderError() throws Exception {

        auto.encender();
        auto.encender();

    }

    @Test(expected = Error.class)
    public void NoDeberiaAvanzarPorqueNoEstaEncendido() throws Exception {

        auto.avanzar();

    }

    @Test(expected = Error.class)
    public void noDeberiaPoderApagarUnAutoApagado() throws Exception {

        auto.apagarse();

    }

    @Test(expected = Error.class)
    public void noDeberiaPoderPrenderLaRadioSiYaEstaPrendida() throws Exception {

        auto.encerRadio();
        auto.encerRadio();

    }

    @Test(expected = Error.class)
    public void noDeberiaPoderAvanzarSiYaEstaEnMovimiento() throws Exception {

        auto.encender();
        auto.avanzar();
        auto.avanzar();

    }

}
