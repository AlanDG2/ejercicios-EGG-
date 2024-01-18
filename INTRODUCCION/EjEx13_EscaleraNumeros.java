/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
/*

*/
import java.util.Scanner;
public class EjEx13_EscaleraNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner read = new Scanner(System.in);
        System.out.print("Digite un número natural: ");
        int n1 = read.nextInt();
        escalera(n1);
        
    }
    
    
      public static void escalera(int num) {
        String txt = "";
        for (int i = 1; i <= num; i++) {
            txt += String.valueOf(i);
            System.out.println(txt);
        }
      }
    
}
