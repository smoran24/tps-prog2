
package tp1_ej1;
import java.util.Scanner; //IMPORTO LA CLASE SCANNER PARA LEER ENTRADA

public class TP1_EJ1 {

    public static void main(String[] args) {
        float numero1, numero2;
        String nombreUsuario;
        Scanner in = new Scanner(System.in); //crea el objeto "in" de clase scanner
        MENU menuCalc = new MENU();
         
        System.out.println("CALCULADORA v.1.0");
        System.out.println("Introduzca su nombre: ");
        nombreUsuario = in.nextLine(); //pide string al usuario
        System.out.println("Ingrese el primer número: ");
        numero1 = in.nextFloat(); //pide float al usuario
        System.out.println("Ingrese el segundo número: ");
        numero2 = in.nextFloat();
        menuCalc.mostrarMenu(numero1, numero2, nombreUsuario);
    }
}
