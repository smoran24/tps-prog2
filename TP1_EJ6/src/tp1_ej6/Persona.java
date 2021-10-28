
package tp1_ej6;

public class Persona {
    //atributos o caractisticas
    //para herencia
    protected String nombre;
    protected String apellido;
    protected int DNI;
    protected String estCivil;

    public Persona(String nombre, String apellido, int DNI, String estCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.estCivil = estCivil;
    }
    public void mostrar(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Apellido: "+this.apellido);
        System.out.println("DNI: "+this.DNI);
        System.out.println("Estado Civil: "+this.estCivil);
    }
    
}