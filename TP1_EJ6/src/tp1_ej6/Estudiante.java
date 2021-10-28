
package tp1_ej6;

public class Estudiante extends Persona{
    private int numLegajo;
    private String curso;

    public Estudiante(int numLegajo, String curso, String nombre, String apellido, int DNI, String estCivil) {
        super(nombre, apellido, DNI, estCivil);
        this.numLegajo = numLegajo;
        this.curso = curso;
    }
    
    public void mostrar(){
        super.mostrar();
        System.out.println("Numero de legajo: "+this.numLegajo);
        System.out.println("Curso: "+this.curso);
    }
}
