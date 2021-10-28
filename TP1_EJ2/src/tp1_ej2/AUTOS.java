
package tp1_ej2;
import java.util.Scanner;

public class AUTOS {
    private String marca;
    private String modelo;
    private double combustible;
    private double kilometros;
    private String patente;
    private int puertas;
    
    public AUTOS(String marca, String modelo, double combustible, double kilometros, String patente,int puertas){
        this.marca=marca; //constructor de la clase AUTOS
        this.modelo=modelo;
        this.combustible=combustible;
        this.kilometros=kilometros;
        this.patente=patente;
        this.puertas=puertas;
    }
    public void acelerar(){
        
    }
    public void frenar(){
        
    }
    public void velocidad(){
        
    }
    public void pedirKilometraje(){
        Scanner in = new Scanner(System.in);
        do{
            System.out.print("Ingrese el kilometraje reciente del auto: ");
            this.kilometros = this.kilometros+in.nextDouble();
        }while(this.kilometros<0);
    }
    public void pedirCombustible(){
        Scanner in = new Scanner(System.in);
        do{
            System.out.print("Ingrese la cantidad en litros que contiene el tanque: ");
            this.combustible = in.nextDouble();
        }while(this.combustible<0);
    }
    public double calcularKilometrajeTotal(){
        double kmTotal = this.kilometros;
        return(kmTotal);
    }
    public double calcularConsumo(){
        double resultado = this.kilometros*this.combustible;
        return(resultado);
    }
}
