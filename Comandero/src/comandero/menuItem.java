/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comandero;

/**
 *
 * @author frang
 */
public class menuItem {
    
    int id;
    String nombre;
    float precio;

    public menuItem(int id, String nombre, float precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public void mostrar(){
        System.out.println(this.id + ". " + this.nombre + " -> $" + this.precio);
    }
    
}
