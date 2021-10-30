
package comandero;
import java.util.Random; //importo la libreria Random

public class Cliente {
    private String nombre;
    private int numeroID = 0; //por defecto será 0. El usuario no setea su ID, lo hace el programa a través de una llamada a generarNumeroID

    public Cliente() { //constructor vacío (el mismo usuario llenará solo con su nombre después de crear el objeto tipo Cliente)
        
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String miNombre){
        this.nombre = miNombre;
    }
    
    public int getNumeroID(){
        return this.numeroID;
    }
    
    public void generarNumeroID(){ //método con el cual se generará un número de ID para el cliente
        Random r = new Random(); //creo un objeto de la clase Random importada previamente para instanciar su método nextInt
        int numGenerado;
        numGenerado=r.nextInt(1000)+1; //generará un numero entero aleatorio entre 1 y 1001 (al haberle sumado 1, nunca será 0)
        this.numeroID=numGenerado;
    }

}
