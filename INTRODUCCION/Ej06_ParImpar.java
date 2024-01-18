
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Ej06_ParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner read = new Scanner(System.in);
        System.out.println("ingrese un numero  ");
        int n1= read.nextInt();
        if (n1==0) {
            System.out.println(" el numero es cero " );
        }else if (n1%2==0){
            System.out.println(" el numero es par" );
        }else{ System.out.println(" el numero es impar" );}
        
                
    }
    
}
