/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comandero;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author frang
 */
public class Comandero {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Usuario> usersArray = new ArrayList<>();
    static Usuario usuario = null;

    public static void main(String[] args) {

        
        generarData();
        
        registrarUsuario();
        
        while(usuario == null){
            // Registro o inicio de sesión, cambio de usuario
            usuario = iniciarSesion();
        }
        
        cerrarSesion();
        
    }
    
    
    public static void generarData(){
        // Método para generar dummie data para ser utilizada de ejemplo.
        
        Cocinero cocinero = new Cocinero("Cocinero", "cocinero@email.com", "cocinero123");
        usersArray.add(cocinero);
        
        Mozo mozo = new Mozo("Mozo", "mozo@email.com", "mozo123");
        usersArray.add(mozo);
        
        Carta carta = new Carta();
        
        Producto item1 = new Producto(1, "Pizza", 150.0f);
        Producto item2 = new Producto(2, "Empanadas", 250.0f);
        Producto item3 = new Producto(3, "Lomo", 125.5f);
        Producto item4 = new Producto(4, "Hamburguesa", 95.9f);
        
        carta.addItem(item1);
        carta.addItem(item2);
        carta.addItem(item3);
        carta.addItem(item4);

        mozo.setMenu(carta);
        mozo.mostrarMenu();

    }
    

    
    public static void registrarUsuario(){   
        String nombreU, emailU, passwordU, confirmacion;
        Usuario newUser = null;
        int tipoU;
        
        System.out.println("Ingrese el tipo de usuario:");
        System.out.println("1. Cocinero");
        System.out.println("2. Mozo");
        tipoU = sc.nextInt();
        sc.nextLine(); // Clears the buffer of the scanner
        
        
        System.out.println("Ingrese nombre de usuario");
        nombreU = sc.nextLine();
        
        System.out.println("Ingrese email");
        emailU = sc.nextLine();
        
        System.out.println("Ingrese contraseña");
        passwordU = sc.nextLine();
        
        do {
            System.out.println("Confirme contraseña");
            confirmacion = sc.nextLine();
        }while (!passwordU.equals(confirmacion));
        
        
        switch(tipoU){
             case 1:
                 newUser = new Cocinero(nombreU, emailU, passwordU);
                 break;
             case 2:
                 newUser = new Mozo(nombreU, emailU, passwordU);
                 break;
        }
        
        usersArray.add(newUser);
    }
        
    public static Usuario iniciarSesion(){
        // AGREGAR VALIDAR Y TRY CATCH
        
        String nombreU, passwordU;
        Usuario usuario = null;
        
        System.out.println("Ingrese nombre de usuario");
        nombreU = sc.nextLine();
        
        for (Usuario user: usersArray){
            if (nombreU.equals(user.getNombre())){
                usuario = user;
                usuario.conectado = true;
            } 
        }
        
        if (usuario == null){
            System.out.println("No existe usuario");
        } else {
            System.out.println("Ingrese contraseña");
            passwordU = sc.nextLine();

            if (!passwordU.equals(usuario.getContrasenia())){
                usuario = null;
                System.out.println("Contraseña incorrecta");
            } else {
                usuario.saludar();
            }
        }
        
        return usuario;
    }
    
    public static void cerrarSesion(){
        System.out.println("¡Hasta luego, " + usuario.getNombre() + "!");
        usuario.conectado = false;
        usuario = null;
    }
    
}
