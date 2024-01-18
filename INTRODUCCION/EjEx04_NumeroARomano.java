
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
/*
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.
*/
public class EjEx04_NumeroARomano {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner read=new Scanner(System.in);
         System.out.println("ingrese un numero del  1 al  10  ");
        int num= read.nextInt();
        
        switch(num) {
            case 1 -> System.out.println("es  I ");
            case 2 -> System.out.println("es II ");
            case 3-> System.out.println("es III ");
            case 4 -> System.out.println("es IV ");
            case 5 -> System.out.println("es  V " );
            case 6 -> System.out.println("es VI ");
            case 7 -> System.out.println("es VII ");
            case 8 -> System.out.println("es VIII ");
            case 9 -> System.out.println("es IX ");
            case 10 -> System.out.println("es X ");
                 
            default -> System.out.println(" nuemro  erroneo  ");
        }
    }
}
