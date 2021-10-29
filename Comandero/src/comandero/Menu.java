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
public class Menu {
    static ArrayList<menuItem> itemsArray = new ArrayList<>();

    public Menu() {
    }
    
    public void addItem(menuItem item){
        itemsArray.add(item);
    }

    public void removeItem(menuItem item){
        itemsArray.remove(item);
    }
    
    public void mostrar(){
        System.out.println("");
        System.out.println("********************");
        System.out.println("Carta del Restaurant");
        System.out.println("");
        
        for (menuItem item: itemsArray){
            item.mostrar();
        }
        
        System.out.println("********************");
        System.out.println("");
    }
}
