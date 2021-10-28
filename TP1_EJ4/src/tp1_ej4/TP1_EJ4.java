
package tp1_ej4;

public class TP1_EJ4 {

    public static void main(String[] args) {
        Persona person1 = new Persona(42793880, 0, 1200);
        System.out.println("Ingreso el sueldo a la cuenta 1");
        person1.ingreso(1, 5500);
        System.out.println("Pago el alquiler con la cuenta 2");
        person1.egreso(2, 2500);
        if(person1.esMoroso()==true){
            System.out.println("MOROSO");
        }else{
            System.out.println("NO ES MOROSO");
        }
        System.out.println("Transfiero 3000 pesos de la cuenta 1 a la cuenta 2");
        person1.transferir(2, 3000);
        if(person1.esMoroso()==true){
            System.out.println("MOROSO");
        }else{
            System.out.println("NO ES MOROSO");
        }
    }
    
}
