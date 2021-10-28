
package tp1_ej6;

public class Servicio extends Persona{
    private int anioIncorporacion;
    private int numDespacho;
    private String seccion;

    public Servicio(int anioIncorporacion, int numDespacho, String seccion, String nombre, String apellido, int DNI, String estCivil) {
        super(nombre, apellido, DNI, estCivil);
        this.anioIncorporacion = anioIncorporacion;
        this.numDespacho = numDespacho;
        this.seccion = seccion;
    }
    public void mostrar(){
        super.mostrar();
        System.out.println("Año de incorporación: "+this.anioIncorporacion);
        System.out.println("Número de despacho: "+this.numDespacho);
        System.out.println("Sección: "+this.seccion);
    }
}
