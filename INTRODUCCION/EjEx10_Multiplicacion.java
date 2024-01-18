/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 *//*
Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */
import java.util.Scanner;

public class EjEx10_Multiplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int factor1 = (int) (Math.random() * 50 +1)+1;
        int factor2 = (int) (Math.random() * 10 +1)+1;
        // Math.random( )* (max -min)+min 
        
        System.out.println("cuanto  es " + factor1 + "X" + factor2 + "=?");
        int resultado = read.nextInt();
        
        
        if (resultado != (factor1 * factor2)) {
            do {
                System.out.println("fallaste intenta de nuevo ");
                resultado = read.nextInt();    
            } while (resultado!=(factor1*factor2));
        }
        System.out.println("CORRECTO ");
    }
}
