
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Ej11_Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int opcion;
        int numero1, numero2;
        boolean salir = false;

        do {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elija opción: ");
            opcion = read.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese dos numeros enteros: ");
                    numero1 = read.nextInt();
                    numero2 = read.nextInt();
                    System.out.println("Resultado de la suma: " + (numero1 + numero2));
                    break;
                case 2:
                    System.out.println("Ingrese dos numeros enteros: ");
                    numero1 = read.nextInt();
                    numero2 = read.nextInt();
                    System.out.println("Resultado de la resta: " + (numero1 - numero2));
                    break;
                case 3:
                    System.out.println("Ingrese dos números enteros: ");
                    numero1 = read.nextInt();
                    numero2 = read.nextInt();
                    System.out.println("Resultado de la multiplicacion: " + (numero1 * numero2));
                    break;
                case 4:
                    System.out.println("Ingrese dos números enteros: ");
                    numero1 = read.nextInt();
                    numero2 = read.nextInt();
                    if (numero2 != 0) {
                        System.out.println("Resultado de la division: " + ((double) numero1 / numero2));
                    } else {
                        System.out.println("No se puede dividir por cero.");
                    }
                    break;
                case 5:
                    System.out.print("¿Esta seguro que desea salir del programa (S/N)? ");
                    char confirmacion = read.next().charAt(0);
                    if (confirmacion == 'S' || confirmacion == 's') {
                        salir = true;
                    }
                    break;
                default:
                    System.out.println("Opcion invalida. Por favor, elija una opcion valida.");
                    break;
            }
            System.out.println();
        } while (!salir);
    }
    
    
}
