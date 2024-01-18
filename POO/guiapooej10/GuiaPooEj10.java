/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guiapooej10;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Usuario
 */
public class GuiaPooEj10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         double[] arregloA = new double[50];
        double[] arregloB = new double[20];

        // Inicializamos arregloA con números aleatorios
        Random rand = new Random();
        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = rand.nextDouble() * 100;
        }

        // Ordenamos arregloA de menor a mayor
        Arrays.sort(arregloA);
          // Copiamos los primeros 10 elementos ordenados de arregloA a arregloB
      System.arraycopy(arregloA, 0, arregloB, 0, 10);

        // Rellenamos los 10 últimos elementos de arregloB con el valor 0.5
        Arrays.fill(arregloB, 10, 20, 0.5);

        // Mostramos los arreglos resultantes
        System.out.println("Arreglo A ordenado:");
        System.out.println(Arrays.toString(arregloA));
        System.out.println("Arreglo B combinado:");
        System.out.println(Arrays.toString(arregloB));
    }
    
}
