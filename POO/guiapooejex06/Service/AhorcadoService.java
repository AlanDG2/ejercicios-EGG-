/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiapooejex06.Service;

import guiapooejex06.Entidades.Ahorcado;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class AhorcadoService {
  private Ahorcado ahorcado = new Ahorcado();
  private Scanner read= new Scanner(System.in);
  private List<Character> letrasIngresadas = new ArrayList<>();
  
  public void  crearJuego(){
      System.out.println("ingrese la palabra ");
      ahorcado.setPalabra(read.nextLine());
      System.out.println("ingrese la cantidad de intentos ");
      ahorcado.setIntentos(read.nextInt());
      char[] palabra  = ahorcado.getPalabra().toCharArray();
      ahorcado.setIntentos(0);
      
  }
   public void longitud(){
       System.out.println(ahorcado.getPalabra().length());
   }
    
 public void buscar(char letra) {
    boolean encontrado = false;
    for (int i = 0; i < ahorcado.getPalabra().length(); i++) {
        if (ahorcado.getPalabra().charAt(i) == letra) {
            encontrado = true;
            letrasIngresadas.add(letra);
            System.out.println("La letra " + letra + " está en la palabra.");
            break;
        }
    }
    if (!encontrado) {
        System.out.println("La letra " + letra + " no está en la palabra.");
    } else if (letrasIngresadas.contains(letra)) {
        System.out.println("La letra " + letra + " ya ha sido ingresada antes.");
    }
}
   
   public void encontradas(){
       
       
   }
   
   
   public void  intentos(){
       
   }
   
   public void juego(){
       
   }
   
   
}
