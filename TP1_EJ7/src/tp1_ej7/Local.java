
package tp1_ej7;

public class Local extends Inmueble{
    private int numVentanas;
    private float precio;

    public Local(int numVentanas, String dir, int mCuad, int antig) {
        super(dir, mCuad, antig);
        this.numVentanas = numVentanas;
        this.precio = 3900000.0f;
    }
    
    public float calcularValor(){
        float valorFinal;
        valorFinal=this.precio;
        if (this.antiguedad<15){
            valorFinal=valorFinal-(1*valorFinal/100);
        }else{
            valorFinal=valorFinal-(2*valorFinal/100);
        }
        if (this.mCuadrados>50){
            valorFinal=valorFinal+(1*valorFinal/100);
        }
        if (this.numVentanas==1 || this.numVentanas==0){
            valorFinal=valorFinal-(2*valorFinal/100);
        }else if (this.numVentanas>4){
            valorFinal=valorFinal+(4*valorFinal/100);
        }
        return valorFinal;
    }
}
