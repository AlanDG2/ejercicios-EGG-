/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class EjEx09DivisionPorRestas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
      int dividendo, divisor, cociente = 0, resto;
      System.out.println("Digite el dividendo: ");
      dividendo = sc.nextInt();
      System.out.println("Digite el divisor: ");    
      divisor = sc.nextInt();
       int resultado;
      
      do {
         resultado = dividendo - divisor;
         System.out.println(dividendo + " - " + divisor + " = " + resultado);
         cociente++;
         dividendo = resultado;
      } while (resultado >= divisor);
      
      resto = dividendo;
      System.out.println("El residuo es " + resto + " y el cociente es " + cociente);
      
    }
    }
    

