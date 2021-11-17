
package comandero;

import java.util.Scanner;

public class Validaciones {

    private static Scanner leer = new Scanner(System.in);
    public static Integer validarInt(String valor) {

        Integer numeroIngresado;
        try {
            numeroIngresado = Integer.parseInt(valor);
            return numeroIngresado;

        } catch(Exception e) {
            return -1;
        }
    }
}
