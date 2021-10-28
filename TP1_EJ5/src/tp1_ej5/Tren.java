
package tp1_ej5;

public class Tren extends Vehiculo{
    private int numRuedas;
    private int velMax;
    private int autonomia;
    private float retardo;

    public Tren(String marca, String modelo) {
        super(marca, modelo);
        this.numRuedas=8;
        this.velMax=80;
        this.autonomia=1;
        this.retardo=0;
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
