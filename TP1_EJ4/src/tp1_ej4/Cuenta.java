
package tp1_ej4;

public class Cuenta{
    private int numCuenta;
    private float saldoDisponible;

    public Cuenta(int p_numCuenta, float p_saldoDisponible) { //"p_" es por "parametro" para diferenciar las variables
        this.numCuenta = p_numCuenta;
        this.saldoDisponible = p_saldoDisponible;
    }

    public int getNumCuenta() {
        return this.numCuenta;
    }
    public float getSaldo(){
        return this.saldoDisponible;
    }
    public void agregarSaldo(float abono){
        this.saldoDisponible=this.saldoDisponible+abono; //suma a la propia cuenta el abono recibido
        System.out.println("Se ha depositado la suma indicada.");
        System.out.println("El saldo de la cuenta ahora es: "+this.saldoDisponible);
    }
    public void descontarSaldo(float abono){
        if (getSaldo()<abono){
            System.out.println("Error: No es posible realizar el pago por falta de saldo.");
        }else{
            this.saldoDisponible=this.saldoDisponible-abono; //sustrae plata de la cuenta propia
            System.out.println("El saldo de la cuenta ahora es: "+this.saldoDisponible);
        }
        
    }
}