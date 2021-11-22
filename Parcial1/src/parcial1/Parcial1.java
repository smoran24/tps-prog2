
package parcial1;
import java.util.Scanner;

public class Parcial1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Empresa emp = new Empresa();
        Celular celu1 = new Celular(1000);
        Celular celu2 = new Celular(1001);
        Celular celu3 = new Celular(1002);
        Celular celu4 = new Celular(1003);
        Integer num;
        emp.Agregar(celu1);
        emp.Agregar(celu2);
        emp.Agregar(celu3);
        emp.Agregar(celu4);
        do{
            System.out.println("[Buscar un celular]");
            System.out.println("Ingrese el número de serie:");
            num=in.nextInt();
        }while(num<1000);
        emp.Listar(num);
        
    }
    
}
/*RESPUESTAS PREGUNTAS TEÓRICAS:
a) [10% ]Debo calificar un atributo como static cuando………
Respuesta: cuando se trata de un atributo que no se necesita instanciar con un objeto de la clase a la que pertenece,
se dice que es un atributo que no pertenece a un objeto de la clase, sino a la clase misma
b) [10% ]Debo calificar un atributo como final cuando……….
Respuesta: cuando el atributo es de solo lectura, es decir, que su valor inicializado no puede cambiar a lo largo del programa.


STACK
La clase Stack es una ESTRUCTURA DINÁMICA de tipo LIFO (Last In - First Out, o último en entrar - primero en salir). 
Las operaciones basicas son:

a) pop (que retira un elemento de la pila: el último), 
b) push (que añade elemento)
c) peek (consulta el elemento en la cima de la pila (el último)), 
d) empty (que comprueba si la pila esta vacia) y 
e)search (que busca un determinado elemento dentro de la pila y devuelve su posicion dentro de ella).
 
//Ejemplo Interface List, clase Stack aprenderaprogramar.com

import java.util.Stack;

public class Programa {

    public static void main(String arg[]) {

            String cadenano = "(Cadena no equilibrada en par�ntesis(()()()))))";

            String cadenasi = "(Cadena equilibrada en parentesis())";

            System.out.println("Verificaci�n equilibrado en par�ntesis para cadenano:");

            System.out.println(verificaParentesis(cadenano));

            System.out.println("Verificaci�n equilibrado en par�ntesis para cadenasi:");

            System.out.println(verificaParentesis(cadenasi));

    }

 

    public static boolean verificaParentesis(String cadena)  {

        Stack<String> pila = new Stack<String>();       
	int i = 0;

            while (i<cadena.length()) {  // Recorremos la expresi�n car�cter a car�cter

                if(cadena.charAt(i)=='('  ) {
                         pila.push( "(" );
                                            } // Si el par�ntesis es de apertura apilamos siempre                               

                else if  (cadena.charAt(i)==')'  ) {  // Si el par�ntesis es de cierre actuamos seg�n el caso

                            if (!pila.empty()){ 
                                    pila.pop(); } // Si la pila no est� vac�a desapilamos

                            else { pila.push(")"); break; } // La pila no puede empezar con un cierre, apilamos y salimos

                }

                i++;

            }

            if(pila.empty()){ return true; } else { return false; }

    }

}
*/