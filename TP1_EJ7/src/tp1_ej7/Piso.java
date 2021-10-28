
package tp1_ej7;

public class Piso extends Inmueble{
    private int numPiso;
    private float precio;

    public Piso(int numPiso, String dir, int mCuad, int antig) {
        super(dir, mCuad, antig);
        this.numPiso = numPiso;
        this.precio = 5300000.0f;
    }

    public float calcularValorPiso(){
        float valorFinal;
        valorFinal=this.precio;
        if (this.antiguedad<15){
            valorFinal=valorFinal-(1*valorFinal/100);
        }else{
            valorFinal=valorFinal-(2*valorFinal/100);
        }
        if (this.numPiso>=3){
            valorFinal=valorFinal+(3*valorFinal/100);
        }
        return valorFinal;
    }
    
    
}
