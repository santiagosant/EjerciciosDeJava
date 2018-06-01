package ejercicosDeExepciones;

import java.util.ArrayList;
import java.util.List;

public class Compras {

    private List<Item> listaDeCompras = new ArrayList<>();
    private double presupuestoDisponible;

    public Compras(double presupuestoMaximoDeCompra) {
        this.presupuestoDisponible = presupuestoMaximoDeCompra;
    }

    public void agregar(Item item) throws Exception {
        if ((item.getPrecioUnitario() * item.getCantidad()) > this.presupuestoDisponible) {
            throw new Error("El item: " + item.getNombre() + " excede el presupues de la compra");
        }

        this.listaDeCompras.add(item);
        this.presupuestoDisponible -= (item.getPrecioUnitario() * item.getCantidad());
    }

    public double getPresupuestoDisponible() {
        return presupuestoDisponible;
    }

    
}
