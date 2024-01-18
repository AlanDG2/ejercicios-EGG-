/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class Ej02_MostrarNombre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
        */
         Scanner read = new Scanner(System.in);
        System.out.println("escriba su nombre  "  );
        String name  =read.nextLine();
          System.out.println("Hola! " +name  );
        
        
    }
    
}
