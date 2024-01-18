
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Ej09_PrimeraLetraA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner read = new Scanner(System.in);

        System.out.println("Ingrese una frase o palabra: ");
        String entrada = read.nextLine();

       if (entrada.substring(0, 1).equalsIgnoreCase("A")) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
    
}
