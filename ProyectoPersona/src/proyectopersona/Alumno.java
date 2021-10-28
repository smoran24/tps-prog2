/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopersona;

/**
 *
 * @author Pablo
 */
public class Alumno extends Persona {//herencia
    private int legajo;
    
    public Alumno(String nombre, String apellido, int legajo){
            super(nombre,apellido);
    this.legajo=legajo;
}
    public void Mostrar(){
        super.Mostrar();///Mostrar el ape y no
        System.out.println("El legajo es"+this.legajo);
        
    }

    
    
    
}
