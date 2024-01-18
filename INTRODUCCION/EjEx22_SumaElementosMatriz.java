/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
/*
Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
muestre la suma de sus elementos.
*/
import java.util.Scanner;
public class EjEx22_SumaElementosMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("digite la cantidad de filas de la matriz ");
        int row=read.nextInt();
         System.out.println("digite la cantidad de columnas  de la matriz ");
        int column=read.nextInt();
        
        int [][] matriz= new int [row][column];
        llenarMatriz(row,column,matriz);
        mostrarMatriz(row,column,matriz);
        
        
    }
     public static void llenarMatriz(int row,  int column, int[][] matriz) {
     for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
               matriz[i][j]=(int) (Math.random()*10);
               
            }
            
        }
       
     
    }  
      
    public static void mostrarMatriz(int m, int n, int [][] matriz) {
        System.out.println("Matriz principal:");
        int suma=0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(  matriz[i][j] + "  ");
                suma+=matriz[i][j];
            }
            System.out.println();
        }
        System.out.println("__________________________________________");
         System.out.println("la suma de todos los elementos de la matriz es " +suma);
       
    }
    
}
