/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comandero;

import java.util.ArrayList;

/**
 *
 * @author frang
 */
public class Mozo extends Usuario {
    
    Carta menu;
    ArrayList<Comanda> comandasArray = new ArrayList<>();

    public Mozo(String nombre, String email, String password) {
        super(nombre, email, password);
    }
    
    @Override
    public void saludar(){
        System.out.println("¡Bienvenido al piso, " + this.getNombre() + "!");
    }
    
    public void setMenu(Carta menu){
        this.menu = menu;
    }
    
    public void mostrarMenu(){
        this.menu.mostrar();
    }
    
    public void tomarPedido(){
        // Crear comanda
        // Añadir items del menú a la comanda
        // Agregar a la cola
    }
}
