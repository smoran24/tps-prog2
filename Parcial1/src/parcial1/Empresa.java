
package parcial1;
import java.util.ArrayList;

public class Empresa {
    private ArrayList<Celular> celulares = new ArrayList();
    
    public void Agregar(Celular cel){
        celulares.add(cel);
    }
    public void Listar(Integer celNum){
       /* boolean busqueda;
        busqueda=celulares.contains(celNum);
        if (busqueda==false){
            System.out.println("No se encontró celular");
        }*/
       for (Celular cel : celulares) {
           if (cel.nroserie==celNum){
               cel.MostrarInfo();
           }
        }
    }
    
}
