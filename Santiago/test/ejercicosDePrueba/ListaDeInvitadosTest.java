package ejercicosDePrueba;

import org.junit.Test;
import static org.junit.Assert.*;

public class ListaDeInvitadosTest {
    
    @Test (expected = Error.class)
    public void noSePuedeCrearLaListaConPrecioDeCubiertosNegativos() {
        ListaDeInvitados lista=new ListaDeInvitados(-10.0, 0, 10);
    }
    @Test (expected = Error.class)
    public void noSePodriaNoPonerLimiteALosInvitados(){
        ListaDeInvitados lista=new ListaDeInvitados(10, 10, 0);
    }
    
}
