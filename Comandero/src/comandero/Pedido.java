
package comandero;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

public class Pedido {
    //Se incializa una Hashtable con el número de cliente y su ArrayList con los pedidos.
    private static Hashtable<Integer, ArrayList> pedido = new Hashtable<Integer, ArrayList>();
    //Se incializa una Hashtable con el número de cliente y el estado del pedido, "False" si no está preparado y "True" si ya está preparado.
    private static Hashtable<Integer, Boolean> estado = new Hashtable<Integer, Boolean>();

    //Llena la hastable con el numero del cliente y los productos de su orden
    public static void generarPedido(ArrayList productos, int numeroOrden) {

        pedido.put(numeroOrden, productos);
        estado.put(numeroOrden, false);
    }
    //Devuelve pedido
    public static ArrayList GetPedido(int key){
        return pedido.get(key);
    }
    //Devuelve estado
    public static boolean GetEstado(int key){
        return estado.get(key);
    }
    //Muestra todos los pedidos con la condición false, por medio de enumeración.
    public static void mostrarPedidos(){
        Enumeration<Integer> e = pedido.keys();
        while (e.hasMoreElements()) {

            int key = e.nextElement();
            if (GetEstado(key)==false){
                System.out.println("El numero de Cliente es: " + key + " y el pedido es: " + GetPedido(key) + " su estado es: a preparar.");
            }
        }
    }
    //Cambia el estado mediante FIFO de los pedidos, mediante enumeración y devuelve un mensaje si no hay más pedidos para preparar, es llamado por Empleado.
    public static void cambiarEstado(){
        Enumeration<Integer> e = estado.keys();
        int numeroPedido = pedido.size();
        int contadorEstados = 0;


        Enumeration<Integer> v = estado.keys();

        while (v.hasMoreElements()) {

            int key = v.nextElement();
            if (GetEstado(key)==false){
                contadorEstados++;
            }
        }
        if (contadorEstados == 0)
            System.out.println("No hay pedidos para preparar!");
        else {
            while (e.hasMoreElements() && numeroPedido != 0) {
                int key = e.nextElement();
                if (GetEstado(key) == false) {
                    System.out.println("El pedido del Cliente: " + key + " ha sido preparado");
                    estado.put(key, true);
                    numeroPedido = 0;
                }

            }
        }
    }
}