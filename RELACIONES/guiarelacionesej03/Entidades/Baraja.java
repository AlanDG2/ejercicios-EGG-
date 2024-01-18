/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiarelacionesej03.Entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Baraja {
     private  List<Cartas> baraja;
     private List<Cartas> sacadas = new ArrayList();
     
      public Baraja() {
        baraja = new ArrayList<>();
        
        String[] palos = {"Espadas", "Bastos", "Oros", "Copas"};

        for (String palo : palos) {
            for (int numero = 1; numero <= 12; numero++) {
                if (numero != 8 && numero != 9) { 
                    baraja.add(new Cartas(numero, palo));
                }
            }
        }
    }

      
      public void barajar() {
        Collections.shuffle(baraja);
    }
      public Cartas siguienteCarta() {
        if (!baraja.isEmpty()) {
            sacadas.add(baraja.get(0));
            return baraja.remove(0);
        } else {
            System.out.println("No hay más cartas en la baraja.");
            return null;
        }
        
    }
    
        public int cartasDisponibles() {
        return baraja.size();
    }
     public void darCartas(int cantidad){
         if (cantidad <= baraja.size()) {
             for (int i = 0; i < cantidad; i++) {
                 System.out.println(siguienteCarta().toString());  
                 
             }  
         }else{System.out.println("No hay suficientes cartas en la baraja.");}
         
     } 

     public void cartasMonton(){
         if (sacadas.size()>0) {
            for (Cartas sacada : sacadas) {
             System.out.println(sacada);
         } 
         }else{System.out.println("Aun no  se ha sacado ni una sola carta ");}
         
     }
     
     public void mostrarBaraja(){
         for (Cartas cartas : baraja) {
             System.out.println(cartas);
         }
     } 
     
     
    @Override
    public String toString() {
        return "Baraja{" + "baraja=" + baraja + '}';
    }
      
      
      
}
