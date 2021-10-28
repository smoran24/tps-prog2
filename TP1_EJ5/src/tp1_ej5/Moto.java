
package tp1_ej5;

public class Moto extends Vehiculo{
    private int numRuedas;
    private int velMax;
    private int autonomia;
    private float retardo;

    public Moto(String marca, String modelo) {
        super(marca, modelo);
        this.numRuedas=2;
        this.velMax=150;
        this.autonomia=700;
        this.retardo=0.5f;
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
