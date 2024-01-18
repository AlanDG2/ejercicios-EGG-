/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guiacollectionej01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class GuiaCollectionEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          ArrayList<String> razasPerros = new ArrayList<>();
        Scanner read = new Scanner(System.in);
        String respuesta;

        do {
            System.out.print("Ingrese la raza del perro: ");
            String raza = read.nextLine();
            razasPerros.add(raza);

            System.out.print("¿Desea guardar otro perro? (S/N): ");
            respuesta = read.nextLine();
        } while (respuesta.equalsIgnoreCase("S"));

        System.out.println("Perros guardados en el ArrayList:");
        for (String razaPerro : razasPerros) {
            System.out.println(razaPerro);
        }
    }
    
}
