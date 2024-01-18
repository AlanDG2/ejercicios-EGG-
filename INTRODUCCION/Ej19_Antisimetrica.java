/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class Ej19_Antisimetrica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
         int m = 4;
        int n = 4;
        int[][] matriz = new int[m][n];
        int [][] matrizt=new int[m][n];
        llenarMatriz(m, n, matriz,matrizt);
        mostrarMatriz(m,n,matriz,matrizt);
        compararMatriz(m,n,matriz,matrizt);
    }

    public static void llenarMatriz(int m, int n, int[][] matriz ,int[][] matrizt) {
       
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                
                matriz[i][j] = (int) (Math.random() * 10 );
                matrizt[i][j] = matriz[i][j]*-1;
            }
        }
    }

    public static void mostrarMatriz(int m, int n, int[][] matriz,int[][] matrizt) {
     
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
                System.out.print("[" + (matrizt[j][i]) + "] ");
              
            }
            System.out.println();
            
        }

    }
    
    public static void compararMatriz(int m, int n, int[][] matriz,int[][] matrizt) {
           boolean bandera=true;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < m; j++) {
                 if(matriz[i][j]!=(matrizt[i][j]*-1)){
                    bandera=false;
                    break;
                } 
                
            }
        }
        
        if ( bandera){
            System.out.println("la matris es antisimetrica");   
    
        }else {System.out.println("la matriz no es antisimetrica");}
            
    }
    
    
}
