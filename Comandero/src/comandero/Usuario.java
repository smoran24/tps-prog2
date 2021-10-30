/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comandero;

/**
 *
 * @author frang
 */

import java.util.Scanner;

public abstract class Usuario {
    private String nombre;
    private String email;
    private String contrasenia;
    public boolean conectado;    

    public Usuario(String nombre, String email, String password) {
        this.nombre = nombre;
        this.email = email;
        this.contrasenia = password;
        this.conectado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContrasenia() {
        return contrasenia;
    }
    
    
    
    public abstract void saludar();

}
