/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guiacollectionej02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class GuiaCollectionEj02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             ArrayList<String> razasPerros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String respuesta;

        do {
            System.out.print("Ingrese la raza del perro: ");
            String raza = scanner.nextLine();
            razasPerros.add(raza);

            System.out.print("¿Desea guardar otro perro? (S/N): ");
            respuesta = scanner.nextLine();
        } while (respuesta.equalsIgnoreCase("S"));

        System.out.println("Perros guardados en el ArrayList:");
        for (String razaPerro : razasPerros) {
            System.out.println(razaPerro);
        }

        System.out.print("Ingrese el perro a buscar y eliminar: ");
        String perroBuscar = scanner.nextLine();

        Iterator<String> iterator = razasPerros.iterator();
        boolean encontrado = false;

        while (iterator.hasNext()) {
            String perro = iterator.next();
            if (perro.equalsIgnoreCase(perroBuscar)) {
                iterator.remove();
                encontrado = true;
                break;
            }
        }

        Collections.sort(razasPerros);

        if (encontrado) {
            System.out.println("Perro encontrado y eliminado. Lista ordenada:");
        } else {
            System.out.println("Perro no encontrado en la lista. Lista ordenada:");
        }

        for (String razaPerro : razasPerros) {
            System.out.println(razaPerro);
        }
    }
    
}
