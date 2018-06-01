package ejercicosDeExepciones;

import java.util.Objects;

public class Item {

    private String nombre;
    private double precioUnitario;
    private int cantidad;

    public Item(String nombre, double precioUnitario, int cantidad) throws Exception {
        
        if(nombre.isEmpty() || nombre.equalsIgnoreCase(" ") || nombre.length()==0 ){
            throw new Error("Nombre invalido");
        }
        
        if (precioUnitario < 0) {
            throw new Error("Tiene que tener un precio valido");
        }

        if (cantidad <= 0) {
            throw new Error("Se tiene que agreagar al menos 1 unidad");
        }

        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.nombre);
        return hash;
    }
                
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Item other = (Item) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
    
    

}
