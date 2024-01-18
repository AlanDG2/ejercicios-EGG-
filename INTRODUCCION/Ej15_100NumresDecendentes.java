/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
*/
import java.util.Scanner;
public class Ej15_100NumresDecendentes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner read = new Scanner(System.in);
        int[] array=new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i]=i+1;
        }
         for (int i =array.length-1 ; i>=0 ; i--) {
             System.out.println(array[i]);
        }
        
    }
     
}
