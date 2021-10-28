
package tp2_ej1;

public class Persona {
    
    private int tipo; //0=alumno 1=docente 2=empleado
    private String nombre;
    private String apellido;
    private String estado_civil;
    private int dni;
    private int año_incorporacion;
    private int num_despacho;
    private String departamento;
    private String seccion;

    Persona() {
        //constructor vacío
    }
    //a continuación, gets y sets de cada atributo de la clase:
    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getAño_incorporacion() {
        return año_incorporacion;
    }

    public void setAño_incorporacion(int año_incorporacion) {
        this.año_incorporacion = año_incorporacion;
    }

    public int getNum_despacho() {
        return num_despacho;
    }

    public void setNum_despacho(int num_despacho) {
        this.num_despacho = num_despacho;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }
}
