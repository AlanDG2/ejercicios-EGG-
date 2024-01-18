/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
import java.util.Scanner;

public class Ej20_CuadroMagico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int m = 3;
        int n = 3;
        int[][] matriz = new int[m][n];
        llenarMatriz(m, n, matriz);
        mostrarMatriz(m, n, matriz);
        matrizMagica(m, n, matriz);
    }

    public static void llenarMatriz(int m, int n, int[][] matriz) {
        Scanner read = new Scanner(System.in);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(" digite  el numero de la posicion " + i + ", " + j);
                int posicion = read.nextInt();
                matriz[i][j] = posicion;
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
    }

    public static void matrizMagica(int m, int n, int[][] matriz) {
        boolean bandera = true;
        int sumDiag2 = 0;
        int sumDiag1 = 0;
        int sumrow = 0;
        int sumcolumn = 0;
        int aux = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sumrow += matriz[i][j];
                sumcolumn += matriz[j][i];
            }
            if (sumrow == sumcolumn) {
                aux++;
            }
            sumDiag1 += matriz[i][i];
            sumDiag2 += matriz[i][(m - 1 - i)];

        }
        if (aux == m) {
            System.out.println("La matriz es un cuadro magico");
        } else {
            System.out.println("La matriz NO es un cuadro magico");
        }
    }

}