
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class EjEx18_SumaVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner read = new Scanner(System.in);

        System.out.print("Ingrese el tamanio del vector (N): ");
        int N = read.nextInt();

        int[] vector = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            vector[i] = read.nextInt();
        }

        int sumaTotal = calcularSumaVector(vector);

        System.out.println("La suma de los elementos del vector es: " + sumaTotal);
    }

    public static int calcularSumaVector(int[] vector) {
        int suma = 0;
        for (int elemento : vector) {
            suma += elemento;
        }
        return suma;
    }
    
}
