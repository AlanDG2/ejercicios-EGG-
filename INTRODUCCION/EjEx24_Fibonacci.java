/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 *//*
Realizar un programa que complete un vector con los N primeros números de la sucesión
de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión de los siguientes
números:
*/
import java.util.Scanner;
public class EjEx24_Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Digite un numero natural:");
        int fiboSequence = sc.nextInt();
        System.out.println("El numero " + fiboSequence + " en la sucesion Fibonacci es: " + fibonacci(fiboSequence));
    }
    public static int fibonacci(int num) {
        int  startingNum= 1;
        int finalNum = 0;
        int resultado = 0;
        int i;
        switch (num) {
            case 0:
                resultado = 0;
                break;
            case 1:
                resultado = 1;
                break;
            default:
                for (i = 2; i <= num; i++) {
                    resultado = startingNum + finalNum;
                    finalNum = startingNum;
                    startingNum = resultado;
                }
                break;
        }
        return resultado;
    }
    
}
