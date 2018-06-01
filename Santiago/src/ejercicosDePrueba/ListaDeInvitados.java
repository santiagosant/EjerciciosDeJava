package ejercicosDePrueba;

import java.util.ArrayList;
import java.util.List;

public class ListaDeInvitados {

    private List<Invitacion> invitados = new ArrayList<>();
    private double precioCubiertoMayor;
    private double precioCubiertoMenor;
    private int cantidadInvitaciones;

    public ListaDeInvitados(double precioCubiertoMayor, double precioCubiertoMenor, int cantidadInvitaciones) {
        if (precioCubiertoMayor <= 0 || precioCubiertoMenor <= 0) {
            throw new Error("Ingrese precio Valido");
        }
        //if(cantidadInvitaciones)
        this.precioCubiertoMayor = precioCubiertoMayor;
        this.precioCubiertoMenor = precioCubiertoMenor;
        this.cantidadInvitaciones = cantidadInvitaciones;
    }

    public void agregarInvitacion(Invitacion invitacion) throws Exception {
        if (invitados.size() >= this.cantidadInvitaciones) {
            throw new Error("Cantidad de invitados superados");
        }
        this.invitados.add(invitacion);

    }

    public int invitadosTotales() {
        int cantidadTotal = 0;
        for (Invitacion participante : invitados) {
            cantidadTotal += participante.obtenerAdultos();
            cantidadTotal += participante.obtenerMenores();
        }
        return cantidadTotal;
    }

    public void confirmarInvitacion(int numeroDeInvitacion) {
        if (numeroDeInvitacion < 0) {
            throw new Error("Seleciones una invitacion valida");
        }
        this.invitados.get(numeroDeInvitacion).confirmar();
    }

    public int invitadosQueConfirmanSuAsistencia() {
        int cantidadTotal = 0;
        for (Invitacion participante : invitados) {
            if (participante.estaConfirmada()) {
                cantidadTotal += participante.obtenerAdultos();
                cantidadTotal += participante.obtenerMenores();
            }
        }
        return cantidadTotal;
    }

    public double costoTotalCubiertos() {
        int costoCubiertos = 0;
        for (Invitacion participante : invitados) {
            if (participante.estaConfirmada()) {
                costoCubiertos += (participante.obtenerAdultos() * this.precioCubiertoMayor);
                costoCubiertos += (participante.obtenerMenores() * this.precioCubiertoMenor);
            }
        }
        return costoCubiertos;
    }

    public boolean ocupanMasDeUnaMesa() {
        boolean masDeUnaMesa = false;
        for (Invitacion participantes : invitados) {
            int invitados = 0;
            invitados += participantes.obtenerAdultos() + participantes.obtenerMenores();
            if (invitados > 10) {
                masDeUnaMesa = true;
            }
        }
        return masDeUnaMesa;
    }

}
