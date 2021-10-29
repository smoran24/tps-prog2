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

public abstract class User {
    private String nombre;
    private String email;
    private String password;
    public boolean loggedIn;    

    public User(String nombre, String email, String password) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.loggedIn = false;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPassword() {
        return password;
    }
    
    
    
    public abstract void saludar();

}
