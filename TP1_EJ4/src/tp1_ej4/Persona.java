
package tp1_ej4;

public class Persona {
    private int DNI;
    private Cuenta c1;
    private Cuenta c2;

    public Persona(int p_DNI, float p_saldo1, float p_saldo2) {
        this.DNI = p_DNI;
        this.c1 = new Cuenta(1, p_saldo1);
        this.c2 = new Cuenta(2, p_saldo2);
    }
    
    public boolean esMoroso(){
        if (c1.getSaldo()<0 || c2.getSaldo()<0){
            return true;
        }else{
            return false;
        }
    }
    public void ingreso(int cuentaDestino, float monto){
        if (cuentaDestino==1){
            c1.agregarSaldo(monto);
        }else{
            c2.agregarSaldo(monto);
        }
    }
    public void egreso(int cuenta, float monto){
        if (cuenta==1){
            c1.descontarSaldo(monto);
        }else{
            c2.descontarSaldo(monto);
        }
    }
    public void transferir(int cuentaDestino, float monto){ //metodo que combina lo de egreso e ingreso
        if (cuentaDestino==2){
            c1.descontarSaldo(monto);
            c2.agregarSaldo(monto);
        }else{
            c2.descontarSaldo(monto);
            c1.agregarSaldo(monto);
        }
    }
}
