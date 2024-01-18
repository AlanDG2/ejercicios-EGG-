/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class Ej03_FraseAMayusYMinus {
    /*
    Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en
Java.
    */
    
    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("ingrese su frase ");
        String frase = read.nextLine();
        
        System.out.println(frase.toUpperCase());
         System.out.println(frase.toLowerCase());
               
        
    }

    
}













