
package tp1_ej5;

public class Auto extends Vehiculo{
    private int numRuedas;
    private int velMax;
    private int autonomia;
    private float retardo;

    public Auto(String marca, String modelo) {
        super(marca, modelo);
        this.numRuedas=4;
        this.velMax=220;
        this.autonomia=600;
        this.retardo=1;
    }
    public int getVelMax() {
        return velMax;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public float getRetardo() {
        return retardo;
    }
    
}
