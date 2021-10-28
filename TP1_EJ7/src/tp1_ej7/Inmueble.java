
package tp1_ej7;

public abstract class Inmueble {
    protected String direccion;
    protected int mCuadrados;
    protected int antiguedad;

    public Inmueble(String dir, int mCuad, int antig) {
        this.direccion = dir;
        this.mCuadrados = mCuad;
        this.antiguedad = antig;
    }
}
