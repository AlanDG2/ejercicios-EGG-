/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
/*
12. Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-
0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
*/
import java.util.Scanner;
public class EjEx12_Contador3AE {

    public static void main(String[] args) {
       Scanner read =new Scanner(System.in);
       int cont1=0;
       String palabra;
       
        for (int i = 0; i < 1000; i++) {
            palabra=String.valueOf(i);
            if(palabra.contains("3")){
            palabra=palabra.replace("3","E");
            }
            switch (palabra.length()) {
                case 1:
                    System.out.println("0-0-"+palabra);
                    break;
                case 2:
                    System.out.println("0-"+palabra.charAt(0)+ "-"+palabra.charAt(1));
                    break;
                case 3:
                    System.out.println(palabra.charAt(0)+"-"+palabra.charAt(1)+"-"+palabra.charAt(2));
                    break;
               
            }
           
            
        }
       
    }
    
}
