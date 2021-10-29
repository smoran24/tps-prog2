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
public class Cocinero extends User {

    public Cocinero(String nombre, String email, String password) {
        super(nombre, email, password);
    }
    
    @Override
    public void saludar(){
        System.out.println("¡Bienvenido a su cocina, " + this.getNombre() + "!");
    }
}
