/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
/*
20. Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
parámetro. Después haremos otra función o procedimiento que imprima el vector.
*/
public class EjEx20_ImprimirVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int m=10; 
      int[] vector= new int[m];
      llenarMatriz(m,vector);
      mostrarMatriz(m,vector);
    }
    
     public static void llenarMatriz(int row, int[] matriz) {
     for (int i = 0; i < row; i++) {
           
               matriz[i]=(int) (Math.random()*10);
               
            
            
        }
       
     
    }  
      
    public static void mostrarMatriz(int m, int [] matriz) {
        System.out.println("Matriz principal:");
        int suma=0;
        for (int i = 0; i < m; i++) {
            
                System.out.print( "[" +matriz[i] + "] ");
               
          
        }
       
       
    }
}
