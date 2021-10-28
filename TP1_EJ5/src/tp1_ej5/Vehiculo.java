
package tp1_ej5;

public abstract class Vehiculo {
    private String marca;
    private String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    public abstract int getVelMax(); //sirve para utilizar la función getVelMax y las otras.
    public abstract int getAutonomia();
    public abstract float getRetardo();
    
    public float cargarCombustible(int distancia){
        float demora;
        int autonomia=getAutonomia();
        float retardo=getRetardo();
        demora=distancia/autonomia*retardo;
        return demora;
    }
    
    public float tiempoRecorrido(int distancia){
        float tiempo;
        int velocidad = getVelMax();
        tiempo=distancia/velocidad;
        float tiempoDemora=cargarCombustible(distancia);
        tiempo=tiempo+tiempoDemora;
        return tiempo;
    }
}
