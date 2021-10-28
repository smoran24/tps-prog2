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

///private
///protected //se usa para herencia
///public 


public class Persona {
    
    //atributos o caractisticas
    protected String nombre; //para herencia
    protected String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    
    //comportamientos u operaciones
    public void Mostrar(){
        System.out.println("El nombre es"+this.nombre);
        System.out.println("El apellido es"+this.apellido);
        
    }
        
    public void Leer(){
        //Scanner in=new Scanner();
        //in
    }
    }
    
    
    
    

