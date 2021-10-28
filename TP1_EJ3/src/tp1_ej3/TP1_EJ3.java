
package tp1_ej3;

public class TP1_EJ3 {
    public static void main(String[] args) {
        RECTANGULO rec1 = new RECTANGULO(0, 0);
        RECTANGULO rec2 = new RECTANGULO(0, 0);
        RECTANGULO rec3 = new RECTANGULO(0, 0);
        
        System.out.println("[RECTANGULO 1]");
        rec1.pedirAltura();
        rec1.pedirBase();
        System.out.println("[RECTANGULO 2]");
        rec2.pedirAltura();
        rec2.pedirBase();
        System.out.println("[RECTANGULO 3]");
        rec3.pedirAltura();
        rec3.pedirBase();
        float area1=rec1.calcularArea();
        float area2=rec2.calcularArea();
        float area3=rec3.calcularArea();
        float perim1=rec1.calcularPerimetro();
        float perim2=rec2.calcularPerimetro();
        float perim3=rec3.calcularPerimetro();
        System.out.println("El área del 1er rectángulo es: " + area1);
        System.out.println("El perímetro del 1er rectángulo es: " + perim1);
        System.out.println("El área del 2do rectángulo es: " + area2);
        System.out.println("El perímetro del 2do rectángulo es: " + perim2);
        System.out.println("El área del 3er rectángulo es: " + area3);
        System.out.println("El perímetro del 3er rectángulo es: " + perim3);
        
        float mayorPerim, mayorArea;
        
        if(perim1>perim2){
            mayorPerim = perim1;
        }else{
            mayorPerim = perim2;
        }
        if(mayorPerim==perim1 && mayorPerim>perim3){
            System.out.println("El mayor de los perímetros es el del 1er rectángulo");
        }else if (mayorPerim==perim2 && mayorPerim>perim3){
            System.out.println("El mayor de los perímetros es el del 2do rectángulo");
        }else{
            System.out.println("El mayor de los perímetros es el del 3er rectángulo");
        }
        
        if(area1>area2){
            mayorArea = area1;
        }else{
            mayorArea = area2;
        }
        if(mayorArea==area1 && mayorArea>area3){
            System.out.println("La mayor de las áreas es la del 1er rectángulo");
        }else if (mayorArea==area2 && mayorArea>area3){
            System.out.println("La mayor de las áreas es la del 2do rectángulo");
        }else{
            System.out.println("La mayor de las áreas es la del 3er rectángulo");
        }
    }
}
