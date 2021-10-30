/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comandero;

import java.util.ArrayList;

/**
 *
 * @author frang
 */
public class Carta {
    static ArrayList<Producto> itemsArray = new ArrayList<>();

    public Carta() {
    }
    
    public void addItem(Producto item){
        itemsArray.add(item);
    }

    public void removeItem(Producto item){
        itemsArray.remove(item);
    }
    
    public void mostrar(){
        System.out.println("");
        System.out.println("********************");
        System.out.println("Carta del Restaurant");
        System.out.println("");
        
        for (Producto item: itemsArray){
            item.mostrar();
        }
        
        System.out.println("********************");
        System.out.println("");
    }
}
