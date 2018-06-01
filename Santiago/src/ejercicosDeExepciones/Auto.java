package ejercicosDeExepciones;
public class Auto {
    
    private boolean estaEncendido;
    private boolean estaMoviendose;
    private boolean radioPrendida;

    public boolean isEstaEncendido() {
        return estaEncendido;
    }

    public boolean isEstaMoviendose() {
        return estaMoviendose;
    }

    public boolean isRadioPrendida() {
        return radioPrendida;
    }
    
    
    
    public void encender() throws Exception{
     
        if (this.estaEncendido==true){
            throw new Error("El auto ya esta encendido");
        }
        this.estaEncendido=true;
    }
    
    public void avanzar()throws Exception{
        if (this.estaEncendido==false || this.estaMoviendose==true){
            throw new Error("El auto ya esta avazando O esta apagado");
        }      
        this.estaMoviendose=true;
    }
    
    public void apagarse()throws Exception{
        if (this.estaEncendido==false || this.estaMoviendose==true){
            throw new Error("El auto esta Apagado o se esta moviendo");
        }
        this.estaEncendido=false;
        this.radioPrendida=false;
    }
    
    public void frenar(){
        this.estaMoviendose=false;
    }
    
    public void encerRadio()throws Exception{
        if (this.radioPrendida==true){
            throw new Error("La radio esta encendida");
        }
        this.radioPrendida=true;
    }
    
    
    
    
    
    
}
