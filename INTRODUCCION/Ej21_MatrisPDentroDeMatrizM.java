/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
import java.util.Scanner;

public class Ej21_MatrisPDentroDeMatrizM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int m = 10;
        int p = 3;
        int[][] matrizM = new int[m][m];
        int[][] matrizP = new int[p][p];
        llenarMatriz(m, m, matrizM);
        mostrarMatriz(m, m, matrizM);
        llenarMatrizP(p, p, matrizP);
        mostrarMatriz(p, p, matrizP);
        compararMatriz(m, m, matrizM, matrizP);
    }

    public static void llenarMatriz(int m, int n, int[][] matriz) {

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public static void llenarMatrizP(int m, int n, int[][] matriz) {
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
        System.out.println("__________________________________________");  
    }

    public static void compararMatriz(int m, int n, int[][] matriz, int[][] matrizP) {
        boolean matrizEncontrada = false;
     

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < m -1; j++) {
                if (matriz[i][j] == matrizP[0][0]) {
                  boolean  bandera = true;
                    for (int k = 0; k < matrizP.length; k++) {

                        for (int l = 0; l < matrizP[0].length; l++) {
                            if (matriz[k + i][l + j] != matrizP[k][l]) {
                                bandera = false;
                                break;

                            }

                        }
                        if (!bandera) {
                            break;
                        }
                    }
                    if (bandera) {
                        matrizEncontrada = true;
                        break;
                    }

                }

            }
            if (matrizEncontrada) {
                break;
            }
        }

        if (matrizEncontrada) {
            System.out.println("la matrizP  se encuentra dentro  de la matriz M ");
        } else {
            System.out.println("la matrizP  no se encuentra dentro  de la matriz M ");
        }

    }

}
