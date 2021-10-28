
package tp2_ej3;
import java.util.Random;
import java.util.Scanner;
/*
Realizar el juego busca minas, el cual debe tener un arreglo multidimensional
estático de 10 x 10, deberán buscar e investigar la clase Random, para poder
asignar en donde van ha estar posicionadas las minas dentro de la matriz.
Luego permitir al usuario que pueda ir seleccionando algún espacio del arreglo
hasta que encuentre una mina o descubra todos los lugares.
*/
public class TP2_EJ3 {

    public static void main(String[] args) {
	Scanner leer = new Scanner (System.in);
        Random random = new Random(); //creo el objeto de clase random para generar numeros aleatorios
	int tablero [][]= new int[10][10]; //inicializo el tablero (array de 10x10)
	int w; //inicializo coordenadas de las minas para llenar el tablero
  	int z;
	int cantMinasUbicadas=0; //contador de minas a ubicar en el tablero	
	int intento=60;	//contador de intentos (disminuye a medida que se ingresen coordenadas correctas) Si los intentos son menores a la cantidad de minas, pierde el juego.
	int totalMinas=20; //cantidad total de minas en el tablero
	for(int j=0;j<10;j++) //doble bucle for con el que se posicionan las minas en el tablero
            for (int i=0;i<10;i++)
		tablero [j][i]=0; //posiciona un 0 por defecto cuando no hay minas
		do{  
                    w=random.nextInt(10); //genera un random del 0 al 10
                    z=random.nextInt(10); //idem
                    if  (z!=0 && w!=0 && z!=10-1 && w!=10-1){
                        tablero[w][z]=1; //ubica en el tablero un 1 para representar la mina
                        cantMinasUbicadas++; //suma al contador de minas
                    }
       		}while(cantMinasUbicadas<=totalMinas);
       	System.out.println("\n-x----------------------------------------------------x-");
       	System.out.println("  Ingresa las coordenas en el rango del 1 al 10");
        try{
            do {
                int x,y; //inicializo coordenadas que ingrese el usuario
                int cantMinas = 0;
                do{
                    System.out.println("\n-x----------------------------------------------------x-");
                    System.out.println("\n	Intento :"+intento+" , Cual es su coordenada? \n");
                    System.out.print("		Fila:  ");
                    x=leer.nextInt();
                    System.out.println();
                    System.out.print("		Columna:  ");
                    y=leer.nextInt();
                    if(x==0 || y==0 || x>10 || y>10)
                        System.out.println("\n	==>Coordenadas incorrectas<== \n");
                }while (x==0 || y==0 || x>10 || y>10);
                x=x-1; //evito que se salgan de rango las coordenadas al restarles 1
                y=y-1; //idem
                if(tablero [x][y]==0){ //revisa si en el tablero hay minas en las coordenadas del jugador 
                    if (x==0&&y==0){
                        if(x+1>=0 && x+1<10 && y<10) //revisa si hay minas en los alrededores
                            cantMinas=cantMinas+tablero [x+1][y];
                        if(x+1>=0 && x+1<10 && y+1<10 && y+1>=0)
                            cantMinas=cantMinas+tablero [x+1][y+1];
                        if(x>=0 && x<10 && y+1<10 && y+1>= 0)
                            cantMinas=cantMinas+tablero [x][y+1];
                    }
                    else {
                        if(y==0){
                            if(x+1>=0 && x+1<10 && y<10) //revisa si hay minas en los alrededores
                                cantMinas=cantMinas+tablero [x+1][y];
                            if(x-1>=0 && x-1<10 && y<10)
                                cantMinas=cantMinas+tablero [x-1][y];
                            if(x-1>=0 && x-1<10 && y+1<10 && y+1>=0)
                                cantMinas=cantMinas+tablero [x-1][y+1];
                            if(x>=0 && x<10 && y+1<10 && y+1>= 0)
                                cantMinas=cantMinas+tablero [x][y+1];
                            if(x+1>=0 && x+1<10 && y+1<10 && y+1>=0)
                                cantMinas=cantMinas+tablero [x+1][y+1];	
                        }		
                        else{ 
                            if(x-1>=0 && x-1<10 && y-1<10) //revisa si hay minas en los alrededores
                                cantMinas=cantMinas+tablero [x-1][y-1];
                            if(x>=0 && x<10 && y-1<10)
                                cantMinas=cantMinas+tablero [x][y-1];
                            if(x+1>=0 && x+1<10 && y-1<10)
                                cantMinas=cantMinas+tablero [x+1][y-1];
                            if(x+1>=0 && x+1<10 && y<10)
                                cantMinas=cantMinas+tablero [x+1][y];
                            if(x-1>=0 && x-1<10 && y<10)
                                cantMinas=cantMinas+tablero [x-1][y];
                            if(x-1>=0 && x-1<10 && y+1<10 && y+1>=0)
                                cantMinas=cantMinas+tablero [x-1][y+1];
                            if(x>=0 && x<10 && y+1<10 && y+1>= 0)
                                cantMinas=cantMinas+tablero [x][y+1];
                            if(x+1>=0 && x+1<10 && y+1<10 && y+1>=0)
                                cantMinas=cantMinas+tablero [x+1][y+1];
                        }
                    }
                    System.out.print("\n	Mina no encontrada. ");		 
                    if(intento>totalMinas)
                        System.out.print("	Alrededor hay: "+ cantMinas);
                    System.out.println("\n	Intentos restantes: "+(intento-1));
                }
                else{ //si hay una mina en el lugar que indicó el jugador
                    totalMinas = totalMinas-1; //restar al total de minas
                    System.out.println("\n	Acertaste! Mina eliminada. Restan: "+totalMinas+" minas");
                    System.out.println("\n	Intentos restantes: "+(intento-1));
                }
                intento=intento-1; //restar un intento en cualquiera de los dos casos (si hay o no mina)
            }while (intento>=totalMinas && intento>0 && totalMinas>0);
        }catch (Exception e){
            System.out.println("Error: no se ha ingresado un valor del tipo adecuado");
        }
       	if(totalMinas==0)
            System.out.println("GANASTE!");
       	if(totalMinas>intento)
            System.out.println("PERDISTE! (Exceso de minas restantes: "+totalMinas+")\n\n");
       	if(intento==0)
            System.out.println("PERDISTE! (No quedan intentos)");
    }
}