/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class Ej01_Suma2Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /*
        Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
        */
        Scanner read = new Scanner(System.in);
        System.out.println("digite el primer numero  "  );
        int num1  =read.nextInt();
        System.out.println("digite el segundo numero  "  );
        int num2  =read.nextInt();
        System.out.println(num1+ " + " +num2+ " = " +(num1+num2));
        
        
           
    
       
    }
    
}
