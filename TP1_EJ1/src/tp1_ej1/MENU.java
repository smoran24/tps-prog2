
package tp1_ej1;
import java.util.Scanner;

public class MENU {
    int opcion;
    float resultado;
    Scanner in = new Scanner(System.in);
    OPERACIONES op = new OPERACIONES(); //crea el objeto "op" de tipo OPERACIONES
    
    void mostrarMenu(float param1, float param2, String nombre){
        System.out.println("Seleccione la operación que desea realizar:");
        System.out.println("[1] Suma");
        System.out.println("[2] Resta");
        System.out.println("[3] Producto");
        System.out.println("[4] División");
        opcion = in.nextInt();
        switch (opcion){
            case 1:
                resultado = op.suma(param1, param2);
                break;
            case 2:
                while(param1-param2<0){
                    System.out.println("ERROR: La resta no puede ser negativa");
                    System.out.println("Ingrese el primer número: ");
                    param1 = in.nextFloat();
                    System.out.println("Ingrese el segundo número: ");
                    param2 = in.nextFloat();
                }
                resultado = op.resta(param1, param2);
                break;
            case 3:
                resultado = op.producto(param1, param2);
                break;
            case 4:
                while(param2==0){
                    System.out.println("ERROR: No es posible dividir por 0");
                    System.out.println("Ingrese el segundo número: ");
                    param2 = in.nextFloat();
                }
                resultado = op.cociente(param1, param2);
                break;
            default:
                System.out.println("ERROR: Opción no válida");
                break;
        }
        System.out.println(nombre + ", el resultado es: " + resultado);
    }
}
