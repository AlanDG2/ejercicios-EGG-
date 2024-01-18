
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Ej10_SumaALimite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner read = new Scanner(System.in);

        System.out.println("Ingrese el límite positivo: ");
        int limite = read.nextInt();

        int suma = 0;
        int numero;

        do {
            System.out.println("Ingrese un numero: ");
            numero = read.nextInt();
            suma += numero;
        } while (suma <= limite);

        System.out.println("La suma de los numeros ha superado el límite inicial.");
        System.out.println("Suma total: " + suma);
    }
    
}
