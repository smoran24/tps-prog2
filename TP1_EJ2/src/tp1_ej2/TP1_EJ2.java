
package tp1_ej2;

public class TP1_EJ2 {
    public static void main(String[] args) {
        double consumo1, consumo2, kmTotal1, kmTotal2;
        AUTOS auto1 = new AUTOS("Renault", "19", 50, 95000, "AOC806", 4);
        AUTOS auto2 = new AUTOS("Chevrolet", "Corsa", 50, 80000, "ADE220", 4);
        auto1.pedirKilometraje();
        auto1.pedirCombustible();
        auto2.pedirKilometraje();
        auto2.pedirCombustible();
        consumo1=auto1.calcularConsumo();
        consumo2=auto2.calcularConsumo();
        kmTotal1=auto1.calcularKilometrajeTotal();
        kmTotal2=auto2.calcularKilometrajeTotal();
        System.out.println("El consumo (ltrs/km) del 1er auto es: " + consumo1);
        System.out.println("El kilometraje total del 1er auto es: " + kmTotal1);
        System.out.println("El consumo (ltrs/km) del 2do auto es: " + consumo2);
        System.out.println("El kilometraje total del 2do auto es: " + kmTotal2);
        if(consumo1>consumo2){
            System.out.println("El 1er auto consume más que el 2do");
        }else if (consumo2>consumo1){
            System.out.println("El 2do auto consume más que el 1ro");
        }else{
            System.out.println("Ambos autos consumen lo mismo");
        }
    }
}
