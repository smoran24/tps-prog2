package comandero;
import java.util.Random;
import java.util.ArrayList;

public class Cliente{
    private int numeroID = 0; //por defecto será 0. El usuario no setea su ID, lo hace el programa a través de una llamada a generarNumeroID
    private ArrayList <String> productos = new ArrayList<String>(); //ARRAYLIST CONTIENE STRINGS (nombres de los productos)


    public Cliente() {
        generarNumeroID(); //GENERA UN NÚMERO DE ID AL CLIENTE CUANDO SE CREA
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
    public void agregarProducto(int numProducto){
        String producto = getProducto(numProducto);
        productos.add(producto);
    }

    public void eliminarProducto(int numProducto){
        String producto = getProducto(numProducto);
        productos.remove(producto);
    }
    public void nuevoPedido(){

        Pedido.generarPedido(productos, getNumeroID());

    }
    public boolean buscarProducto(int numProducto){
        boolean existeProducto = false;
        String producto = getProducto(numProducto);
        for(String prod : productos){
            if (prod.equals(producto)){
                existeProducto = true;
                break;
            }
        }
        return existeProducto;
    }

    public String getProducto(int prodId){
        String producto = "";

        switch (prodId){
          case 1:
              producto = "Pizza";
              break;
          case 2:
              producto = "Empanada";
              break;
          case 3:
              producto = "Hamburguesa";
              break;
          case 4:
              producto = "Papas";
              break;
        }

        return producto;
  }
}
