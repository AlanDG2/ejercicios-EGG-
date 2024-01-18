


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz.
*/
import java.util.Scanner;
public class Ej18_Transpuesta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int m = 4;
        int n = 4;
        int[][] matriz = new int[m][n];
        llenarMatriz(m, n, matriz);
        mostrarMatriz(m, n, matriz);
    }

    public static void llenarMatriz(int m, int n, int[][] matriz) {
       
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = (int) (Math.random() * 10 );
            }
        }
    }

    public static void mostrarMatriz(int m, int n, int[][] matriz) {
        System.out.println("Matriz principal:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println();
        }
        System.out.println("Matriz transpuesta:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("[" + matriz[j][i] + "] ");
            }
            System.out.println();
        }
    }
     
    
    
    
}
