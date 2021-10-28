
package tp1_ej6;

public class Profesor extends Persona{
    private int anioIncorporacion;
    private int numDespacho;
    private String departamento;

    public Profesor(int anioIncorporacion, int numDespacho, String departamento, String nombre, String apellido, int DNI, String estCivil) {
        super(nombre, apellido, DNI, estCivil);
        this.anioIncorporacion = anioIncorporacion;
        this.numDespacho = numDespacho;
        this.departamento = departamento;
    }
    public void mostrar(){
        super.mostrar();
        System.out.println("Año de incorporación: "+this.anioIncorporacion);
        System.out.println("Número de despacho: "+this.numDespacho);
        System.out.println("Departamento: "+this.departamento);
    }
}
