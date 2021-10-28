
package tp1_ej3;
import java.util.Scanner;

public class RECTANGULO {
    private float base;
    private float altura;
    
    public RECTANGULO (float base, float altura){
        this.base=base;
        this.altura=altura;
    }
    public void pedirBase(){
        Scanner in = new Scanner(System.in);
        do{
            System.out.print("Ingrese la longitud de la base del rectángulo: ");
            this.base = in.nextFloat();
        }while(this.base<0);
    }
    public void pedirAltura(){
        Scanner in = new Scanner(System.in);
        do{
            System.out.print("Ingrese la longitud de la altura del rectángulo: ");
            this.altura = in.nextFloat();
        }while(this.altura<0);
    }
    public float calcularArea(){
        float area;
        area=this.altura*this.base;
        return(area);
    }
    public float calcularPerimetro(){
        float perimetro;
        perimetro=(this.altura)*2+(this.base)*2;
        return(perimetro);
    }
}
