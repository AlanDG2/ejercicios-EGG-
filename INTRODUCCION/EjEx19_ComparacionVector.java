/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).
*/
import java.util.Scanner;
public class EjEx19_ComparacionVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner read= new Scanner (System.in);
        System.out.println("ingrese la longitud delos vectores ");
        int m=read.nextInt();
       int[] v1= new int[m];
       int[] v2= new int[m];
       llenarVector( m,  v1);
       llenarVector( m,  v2);
       mostrarVector( m,  v1);
       mostrarVector( m, v2);
       compararVector( m, v1,  v2);
       
       
    }
    
      public static void llenarVector(int row, int[] vector) {
     for (int i = 0; i < row; i++) {
               vector[i]=(int) (Math.random()*10);
        }
    }  
      
    public static void mostrarVector(int m, int [] vector) {
        System.out.println("Matriz principal:");
        int suma=0;
        for (int i = 0; i < m; i++) {
                System.out.print( "[" +vector[i] + "] ");
        }
        System.out.println("");
    }
    
     public static void compararVector(int m, int [] vector1, int[] vector2) {
        System.out.println("Matriz principal:");
        boolean comparar=true;
        for (int i = 0; i < m; i++) {
                if (vector1[i]!=vector2[i]) {
                comparar=false;
                break;
            }
        }
         if (comparar) {
             
             System.out.println(" todos los elementos de los vectores son iguales ");
             
         }else{ System.out.println(" los vectores no son iguales");}
       
    }
}
