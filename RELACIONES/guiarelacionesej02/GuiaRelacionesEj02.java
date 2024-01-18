/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiarelacionesej02;

import guiarelacionesej02.Entidades.Juego;
import guiarelacionesej02.Entidades.Jugador;
import guiarelacionesej02.Entidades.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class GuiaRelacionesEj02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner read = new Scanner(System.in);
      ArrayList<Jugador> list =new ArrayList();
      Revolver arma = new Revolver();
      arma.llenarRevolver();
      
      int players;
        System.out.println("JUGEMOS A LA RULETA RUSA");
        do {
        System.out.println("ingrese la cantidad de jugadores");
        players= read.nextInt();  
            if (players>6) {
                players=6;
                System.out.println("el limite es 6  jugadores seran 6 ");
            }
        } while (players<1);
            read.nextLine();
        for (int i = 0; i <players; i++) {
            Jugador newplayer = new Jugador();
            System.out.println("ingrese el nombre del  jugador "+ (i+1));            
            newplayer.setNombre(read.nextLine());
            System.out.println("ingrese su id ");
            newplayer.setId(read.nextInt());
            read.nextLine();
            list.add(newplayer);      
        }
            Juego newgame = new Juego();
            newgame.llenarJuego(list, arma);
            newgame.ronda();
                 
            
          //  newgame.llenarJuego(list, arma);
           // newgame.ronda();
       
        
        
        
        
       
    }
    
}
