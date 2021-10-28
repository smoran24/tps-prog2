
package tp1_ej5;
import java.util.Scanner;

public class TP1_EJ5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int kilometros;
        float tiempoAuto, tiempoMoto, tiempoTren, menorTiempo;
        Auto auto1 = new Auto("Chevrolet", "Corsa");
        Moto moto1 = new Moto("Honda", "GTX");
        Tren tren1= new Tren("General Electric", "AC4400");
        
        System.out.println("Ingrese una distancia en kilómetros a destino:");
        kilometros=in.nextInt();
        tiempoAuto=auto1.tiempoRecorrido(kilometros);
        System.out.println("El tiempo que se demora el auto es: " + tiempoAuto + " horas.");
        tiempoMoto=moto1.tiempoRecorrido(kilometros);
        System.out.println("El tiempo que se demora la moto es : " + tiempoMoto + " horas. ");
        tiempoTren=tren1.tiempoRecorrido(kilometros);
        System.out.println("El tiempo que se demora el tren es: " + tiempoTren + " horas. ");
        
        if(tiempoAuto<tiempoMoto){
            menorTiempo = tiempoAuto;
        }else{
            menorTiempo = tiempoMoto;
        }
        if(menorTiempo==tiempoAuto && menorTiempo<tiempoTren){
            System.out.println("El auto llega en menos tiempo");
        }else if (menorTiempo==tiempoMoto && menorTiempo<tiempoTren){
            System.out.println("La moto llega en menos tiempo");
        }else{
            System.out.println("El tren llega en menos tiempo");
        }
    }
    
}
