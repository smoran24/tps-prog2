
package tp2_ej1;
import java.util.ArrayList;   
import java.util.Iterator;    
import java.util.Scanner;
/*
Tomando en cuenta el ejercicio 2 del trabajo practico 1, el cual consta del
manejo de personas de una universidad, retomar el código y que el sistema
agregue y elimine registros en un arraylist. Permita mostrar todos los registros,
que se pueda navegar el arraylist mostrando los detalles de cada registro
dando la posibilidad de elegir primer registro, anterior, siguiente y ultimo.
*/

public class TP2_EJ1 {

    public static void main(String[] args) {
      try {
        Scanner leer = new Scanner(System.in);
        int opciones;
        
        // Declaración el ArrayList
        ArrayList<Persona> personas = new ArrayList<Persona>();

        Iterator itrPersonas = personas.iterator();
        
        do{
            System.out.println("-.Menu.-");
            System.out.println("1. Ingresar nuevo Alumno");
            System.out.println("2. Ingresar nuevo Docente");
            System.out.println("3. Ingresar nuevo Empleado");
            System.out.println("4. Mostrar Lista Completa");
            System.out.println("5. Mostrar siguiente");
            System.out.println("0. Salir");
            opciones=leer.nextInt();
            if(opciones>0 && opciones<4){ //crea el objeto nuevaPers solo si la opción es 1, 2 o 3. Sino, no lo hace.
                Persona nuevaPers = new Persona();
                switch(opciones){
                case 1:
                    //caso alumno
                    nuevaPers.setTipo(0);
                    System.out.println("Nombre: ");
                    nuevaPers.setNombre(leer.next());
                    System.out.println("Apellido: ");
                    nuevaPers.setApellido(leer.next());
                    System.out.println("DNI: ");
                    nuevaPers.setDni(leer.nextInt());
                    System.out.println("Estado Civil: ");
                    nuevaPers.setEstado_civil(leer.next());
                    personas.add(nuevaPers); //agregamos la persona al arraylist
                    itrPersonas = personas.iterator();
                    break;
                case 2:
                    //caso docente
                    nuevaPers.setTipo(1);
                    System.out.println("Nombre: ");
                    nuevaPers.setNombre(leer.next());
                    System.out.println("Apellido: ");
                    nuevaPers.setApellido(leer.next());
                    System.out.println("DNI: ");
                    nuevaPers.setDni(leer.nextInt());
                    System.out.println("Estado Civil: ");
                    nuevaPers.setEstado_civil(leer.next());
                    System.out.println("Año de Incorporacion: ");
                    nuevaPers.setAño_incorporacion(leer.nextInt());
                    System.out.println("Numero de Despacho: ");
                    nuevaPers.setNum_despacho(leer.nextInt());
                    personas.add(nuevaPers); //agregamos la persona al arraylist
                    itrPersonas = personas.iterator();
                    break;
                case 3:
                    //caso empleado
                    nuevaPers.setTipo(2);
                    System.out.println("Nombre: ");
                    nuevaPers.setNombre(leer.next());
                    System.out.println("Apellido: ");
                    nuevaPers.setApellido(leer.next());
                    System.out.println("DNI: ");
                    nuevaPers.setDni(leer.nextInt());
                    System.out.println("Estado Civil: ");
                    nuevaPers.setEstado_civil(leer.next());
                    System.out.println("Año de Incorporacion: ");
                    nuevaPers.setAño_incorporacion(leer.nextInt());
                    System.out.println("Departamento donde Trabaja: ");
                    nuevaPers.setDepartamento(leer.next());
                    personas.add(nuevaPers); //agregamos la persona al arraylist
                    itrPersonas = personas.iterator();
                    break;
            }
            }else{
                Persona pers=new Persona(); //creo el objeto persona para ser recorrido por ITERADORES en los casos 4 y 5
                switch(opciones){
                    case 4:
                    //listar las personas
                    System.out.println("Lista de integrantes de la universidad");
                    while(itrPersonas.hasNext()){
                            pers = (Persona)itrPersonas.next(); //el objeto persona hace de puntero de referencia al iterador itPersonas
                            System.out.println("Nombre: "+pers.getNombre()
                                    +" Ap.:"+pers.getApellido()
                                    +" Tipo:"+pers.getTipo());
                            
                            if (pers.getTipo()>=1){
                                System.out.println("Año de inc.: "+pers.getAño_incorporacion());
                            }
                            if (pers.getTipo()==1){
                                System.out.println("Numero de Despacho: "+pers.getNum_despacho());
                            }
                            if (pers.getTipo()==2){
                                System.out.println("Departamento donde Trabaja: "+pers.getDepartamento());
                            }
                    }
                    itrPersonas = personas.iterator();
                    break;
                case 5:
                    //listar la siguiente persona en la lista
                    System.out.println("Mostrar siguiente");
                    
                    if (itrPersonas.hasNext()){
                            pers = (Persona)itrPersonas.next();
                            System.out.println("Nombre: "+pers.getNombre()
                                    +" Ap.:"+pers.getApellido()
                                    +" Tipo:"+pers.getTipo());
                    }else
                        System.out.println("Es el último");
                    break; 
                case 0:
                    System.out.println("Usted ha salido con éxito");
                    break;
                default:
                    System.out.println("Opcion ingresada no existente, vuelva a intentarlo");
                    break;
                }
            } 
        }while(opciones!=0);
      } catch (Exception e) { //excepción por si el usuario ingresa un valor que no es ENTERO
          System.out.println("Error: Valor inválido.");
      }
    }
}
