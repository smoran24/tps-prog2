
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

*/