
package parcial1;

public class Celular extends Dispositivo{
    private boolean encendido;
    public Bateria bat;
    public UnidadModular umodular;

    public Celular(Integer nroserie) {
        super(nroserie);
    }

    
    public void Colocar(Bateria objbat){
        
    }
    public void Encender(){
        
    }
    public void Apagar(){
        
    }
    public void MostrarInfo(){
        System.out.println("Num. Serie: "+this.nroserie);
        
    }
}
