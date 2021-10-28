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
public class ProyectoPersona {//clase Principal 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona juan;
        //juan es una variable u objeto de tipo Persona
        juan=new Persona("Juan Carlos","Perez");
        juan.Mostrar();//mostraría el apellido y nombre del objeto Juan
        //activando el método Mostrar()
        
        Alumno carlos=new Alumno("Carlos Alberto","Gomez",44323);
        carlos.Mostrar();
        //System.out.printl(juan.nombre);
        
        
        
        
    }
    
}
