package ejercicosDeExepciones;

import java.util.List;

public class Prueba {
    public static void main(String[] args) throws Exception  {
//        
//        IngresoASistema usuario1= new IngresoASistema("Santiago", "asdfgh jk1");
//        
//        usuario1.ingresar("Santiago", "asdfghjk1");
//       

    
//    Curso curso1=new Curso(16,8,2,
//                           15,12,2);
//    

    Compras compro= new Compras(1000);
    compro.agregar(new Item("Azucar", 50, 5));
    System.out.println(compro.getPresupuestoDisponible());
    compro.agregar(new Item("Coca-Cola", 75, 11));
    System.out.println(compro.getPresupuestoDisponible());
    
    }
}
