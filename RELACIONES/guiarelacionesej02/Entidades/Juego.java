 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiarelacionesej02.Entidades;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Usuario
 */
public class Juego {
     private ArrayList<Jugador> jugadores;
    private Revolver revolver;
    private Scanner read = new Scanner(System.in);

    public Juego() {
    }

    public Juego(ArrayList<Jugador> jugadores, Revolver revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }
     public void llenarJuego(ArrayList<Jugador> jugadores, Revolver revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

     public void ronda() {
        boolean alguienSeMojo = false;
        Jugador jugadorActual;
        int i=0;
         do {
             jugadorActual=jugadores.get(i);
          
             System.out.println(jugadorActual.getNombre() + "  es tu turno, "+ " tu posicion actual es " +revolver.getPosicionActual() + " presiona el gatillo ((enter))  ");
             String enter=read.nextLine();
         alguienSeMojo = jugadorActual.disparo(revolver);
             System.out.println(jugadorActual.toString());
             
         if (alguienSeMojo) {
            System.out.println("HEADSHOT!!! "); 
         }
         i++;
             if (i== jugadores.size()) {
                 i=0;
             }
             
    
         } while (!alguienSeMojo );
         
            System.out.println(revolver.toString());
        
        
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores + ", revolver=" + revolver + '}';
    }
}
