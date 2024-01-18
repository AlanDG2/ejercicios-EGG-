/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 *//*
Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el
operador de división. Nota: recordar que las variables de tipo entero truncan los
números o resultados.
*/
import java.util.Scanner;
public class EjEx11_DigitosDeNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        System.out.println("digite un numero ");
        int num =read.nextInt();
        int count=0;
        int aux=num;
        aux=Math.abs(aux);
        while (aux>=1) {
            aux=(int)aux/10;
           count++; 
        }
        System.out.println(num+ " tiene " +count+ " digitos ");
        
    }
    
}
