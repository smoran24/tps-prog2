package ejercicio4;
import java.util.Scanner;
public class persona {
    
    //Atributos
    private int dni;
    cuenta cuenta1=new cuenta();
    cuenta cuenta2=new cuenta(1,1200);
    cuenta cuenta3=new cuenta();
    
    //Constructores
    public persona(){
        this.dni=0;
    }
    
    //Metodos
    public void dni(){ //MALA PRÁCTICA: nombrar un método igual que un atributo
        System.out.println("Su DNI es: "+this.dni);
    }
    public void transferencia(){
        Scanner entrada=new Scanner(System.in);
        int opc;
        double monto;
        System.out.println("Ingrese el monto a transferir");
        monto=entrada.nextDouble();
        
        System.out.println("Ingrese la opcion deseada");
        System.out.println("1- Transferir de la cuenta 1 a la cuenta 2.");
        System.out.println("2- Transferir de la cuenta 2 a la cuenta 1.");
        System.out.println("3- Transferir de la cuenta 1 a la cuenta 3.");
        System.out.println("4- Transferir de la cuenta 2 a la cuenta 3.");
        System.out.println("5- Transferir de la cuenta 3 a la cuenta 1.");
        System.out.println("6- Transferir de la cuenta 3 a la cuenta 2.");
        opc=entrada.nextInt();
        switch(opc){
            case 1:{
                cuenta1.abono(monto);
                cuenta2.recibo(monto);
                break;
            }
            case 2:{
                cuenta2.abono(monto);
                cuenta1.recibo(monto);
                break;
            }
            case 3:{
                cuenta1.abono(monto);
                cuenta3.recibo(monto);
                break;
            }
            case 4:{
                cuenta2.abono(monto);
                cuenta3.recibo(monto);
                break;
            }
            case 5:{
                cuenta3.abono(monto);
                cuenta1.recibo(monto);
                break;
            }
            case 6:{
                cuenta3.abono(monto);
                cuenta2.recibo(monto);
                break;
            }
        }
    }
    public void morosidad(){
        System.out.println("Cuenta 1:");
        if(cuenta1.getSaldo()<0)
            System.out.println("La persona presenta deuda");
        else
            System.out.println("La persona no presenta deuda");
        
        System.out.println("Cuenta 2:");
        if(cuenta2.getSaldo()<0)
            System.out.println("La persona presenta deuda");
        else
            System.out.println("La persona no presenta deuda");
        
        System.out.println("Cuenta 3:");
        if(cuenta3.getSaldo()<0)
            System.out.println("La persona presenta deuda");
        else
            System.out.println("La persona no presenta deuda");
    }
}