
package tp1_ej6;
import java.util.Scanner;

public class TP1_EJ6 {
    public static void main(String[] args) {
        Estudiante est1;
        Profesor prof1;
        Servicio ser1;
        int DNI, legajo, decision, anioIncorporacion;
        String nom, ape, estCivil, area;
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el nombre:");
        nom=in.nextLine();
        System.out.println("Ingrese el apellido:");
        ape=in.nextLine();
        System.out.println("Ingrese el DNI:");
        DNI=in.nextInt();
        in.nextLine(); //EVITA QUE SALTEE EL SIGUIENTE NEXTLINE
        System.out.println("Ingrese el estado civil:");
        estCivil=in.nextLine();
        System.out.println("¿Qué ocupación tiene?");
        System.out.println("[1] Estudiante");
        System.out.println("[2] Profesor");
        System.out.println("[3] Personal de servicio");
        decision=in.nextInt();
        switch(decision){
            case 1:
                System.out.println("Ingrese el número de legajo:");
                legajo=in.nextInt();
                in.nextLine(); //EVITA QUE SALTEE EL SIGUIENTE NEXTLINE
                System.out.println("Ingrese el curso:");
                area=in.nextLine();
                est1 = new Estudiante(legajo, area, nom, ape, DNI, estCivil);
                est1.mostrar();
                break;
            case 2:
                System.out.println("Ingrese el año de incorporación:");
                anioIncorporacion=in.nextInt();
                in.nextLine(); //EVITA QUE SALTEE EL SIGUIENTE NEXTLINE
                System.out.println("Ingrese el número de despacho:");
                legajo=in.nextInt();
                in.nextLine(); //EVITA QUE SALTEE EL SIGUIENTE NEXTLINE
                System.out.println("Ingrese el departamento:");
                area=in.nextLine();
                prof1 = new Profesor(anioIncorporacion, legajo, area, nom, ape, DNI, estCivil);
                prof1.mostrar();
                break;
            case 3:
                System.out.println("Ingrese el año de incorporación:");
                anioIncorporacion=in.nextInt();
                System.out.println("Ingrese el número de despacho:");
                legajo=in.nextInt();
                in.nextLine(); //EVITA QUE SALTEE EL SIGUIENTE NEXTLINE
                System.out.println("Ingrese la seccion:");
                area=in.nextLine();
                ser1 = new Servicio(anioIncorporacion, legajo, area, nom, ape, DNI, estCivil);
                ser1.mostrar();
                break;
            default:
                System.out.println("Error: opción no valida");
        }
    }
    
}
