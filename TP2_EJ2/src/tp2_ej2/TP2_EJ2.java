
package tp2_ej2;
import java.util.ArrayList;
//import java.util.Iterator;
import java.util.Scanner;
/*
Programa que permite insertar N datos de Productos en un ArrayList (los datos
de cada Producto son
Nombre, código, stock). Posteriormente visualice los datos de los productos
cuyo stock sea menor a 10.
 */
public class TP2_EJ2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList <Producto> arrayProductos = new ArrayList();
        //Iterator itrProductos = arrayProductos.iterator(); //creo un iterador para el arraylist de productos
        int opcion;
        //Usar set para cada atributo pedido
        try{
            do{
                System.out.println("---------Menú---------");
                System.out.println("[1] Ingresar nuevo producto");
                System.out.println("[2] Mostrar productos con stock<10");
                System.out.println("[3] Salir");
                opcion=in.nextInt();
                switch(opcion){
                    case 1:
                        Producto miProducto = new Producto(); //creo el nuevo objeto de tipo producto
                        System.out.println("Inserte nombre:");
                        miProducto.setNombre(in.next());
                        System.out.println("Inserte código:");
                        miProducto.setCodigo(in.nextInt());
                        System.out.println("Inserte stock:");
                        miProducto.setStock(in.nextInt());
                        arrayProductos.add(miProducto); //añado el producto al arraylist
                        //itrProductos = arrayProductos.iterator();
                        break;
                    case 2:
                        Producto.listarProductos(arrayProductos);
                        break;
                    case 3:
                        System.out.println("Gracias por usar el programa.");
                        break;
                    default:
                        System.out.println("Error: opción no válida.");
                        break;
                }
            }while(opcion!=3);
        }catch (Exception e){
            System.out.println("Error: no se ha ingresado un valor del tipo adecuado");
        }
        
    }
    
}
/*
                    case 2:
                        Producto indiceProd = new Producto(); //creo el objeto producto para ser recorrido por el ITERADOR
                        while(itrProductos.hasNext()){
                            indiceProd = (Producto)itrProductos.next(); //el objeto indiceProd hace de puntero al iterador itrProductos (convirtiendolo al tipo Producto) 
                            if(indiceProd.getStock()<10){ //solo listará a los que tengan stock menor a 10
                                System.out.println("Nombre: "+indiceProd.getNombre()
                                    +", Código:"+indiceProd.getCodigo()
                                    +", Stock:"+indiceProd.getStock());
                            }
                        }
                        break;
*/