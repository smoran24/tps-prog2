
package tp1_ej7;
import java.util.Scanner;

public class TP1_EJ7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float precio;
        int eleccion, nPiso, mCuad, antig, nVentanas;
        String dir;
        do{
            System.out.println("Bienvenido. ¿Desea consultar por un piso o por un local?");
            System.out.println("[1]. Piso");
            System.out.println("[2]. Local");
            eleccion=in.nextInt();
        }while(eleccion<1 || eleccion>2);
        System.out.println("Ingrese la dirección:");
        dir=in.nextLine();
        in.nextLine(); //EVITA QUE SALTEE EL SIGUIENTE NEXTLINE
        System.out.println("Ingrese el area en metros cuadrados:");
        mCuad=in.nextInt();
        System.out.println("Ingrese la antiguedad (en años):");
        antig=in.nextInt();
        if (eleccion==1){
            System.out.println("Ingrese el numero del piso:");
            nPiso=in.nextInt();
            in.nextLine(); //EVITA QUE SALTEE EL SIGUIENTE NEXTLINE
            Piso inm1 = new Piso(nPiso, dir, mCuad, antig);
            precio=inm1.calcularValor();
        }else{
            System.out.println("Ingrese el numero de ventanas del local:");
            nVentanas=in.nextInt();
            in.nextLine(); //EVITA QUE SALTEE EL SIGUIENTE NEXTLINE
            Local inm1 = new Local(nVentanas, dir, mCuad, antig);
            precio=inm1.calcularValor();
        }
        System.out.println("El valor del inmueble es de: $"+precio);
        
        /*switch(eleccion){
            case 1:
                System.out.println("Ingrese el numero del piso:");
                nPiso=in.nextInt();
                in.nextLine(); //EVITA QUE SALTEE EL SIGUIENTE NEXTLINE
                System.out.println("Ingrese la dirección:");
                dir=in.nextLine();
                System.out.println("Ingrese el area en metros cuadrados:");
                mCuad=in.nextInt();
                System.out.println("Ingrese la antiguedad (en años):");
                antig=in.nextInt();
                Piso inm1 = new Piso(nPiso, dir, mCuad, antig);
                precio=inm1.calcularValorPiso();
                System.out.println("El valor del piso es de: $"+precio);
                break;
            case 2:
                System.out.println("Ingrese el numero de ventanas del local:");
                nVentanas=in.nextInt();
                in.nextLine(); //EVITA QUE SALTEE EL SIGUIENTE NEXTLINE
                System.out.println("Ingrese la dirección:");
                dir=in.nextLine();
                System.out.println("Ingrese el area en metros cuadrados:");
                mCuad=in.nextInt();
                System.out.println("Ingrese la antiguedad (en años):");
                antig=in.nextInt();
                Local inm2 = new Local(nVentanas, dir, mCuad, antig);
                precio=inm2.calcularValorLocal();
                System.out.println("El valor del local es de: $"+precio);
                break;
        }
        */
    }
    
}
