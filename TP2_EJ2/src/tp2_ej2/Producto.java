
package tp2_ej2;
//import java.util.ArrayList;

public class Producto {
    
    private String nombre;
    private int codigo;
    private int stock;

    public Producto() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    /*
    public static void listarProductos(ArrayList <Producto> arrayProducts) {
        for(Producto miProducto : arrayProducts){ //for each
            if (miProducto.stock < 10) {
                System.out.println("El nombre del producto es: "+ miProducto.nombre);
                System.out.println("El codigo del producto es: "+ miProducto.codigo);
                System.out.println("El stock del producto es: "+ miProducto.stock);
            } 
        } 
    }
    */
}

