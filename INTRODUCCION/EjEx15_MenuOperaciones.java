
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class EjEx15_MenuOperaciones {

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
            System.out.print("Elija opcion: ");
            opcion = read.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese dos numeros enteros: ");
                    numero1 = read.nextInt();
                    numero2 = read.nextInt();
                    int suma = sumar(numero1, numero2);
                    System.out.println("Resultado de la suma: " + suma);
                    break;
                case 2:
                    System.out.println("Ingrese dos números enteros: ");
                    numero1 = read.nextInt();
                    numero2 = read.nextInt();
                    int resta = restar(numero1, numero2);
                    System.out.println("Resultado de la resta: " + resta);
                    break;
                case 3:
                    System.out.println("Ingrese dos numeros enteros: ");
                    numero1 = read.nextInt();
                    numero2 = read.nextInt();
                    int multiplicacion = multiplicar(numero1, numero2);
                    System.out.println("Resultado de la multiplicacion: " + multiplicacion);
                    break;
                case 4:
                    System.out.println("Ingrese dos numeros enteros: ");
                    numero1 = read.nextInt();
                    numero2 = read.nextInt();
                    if (numero2 != 0) {
                        double division = dividir(numero1, numero2);
                        System.out.println("Resultado de la division: " + division);
                    } else {
                        System.out.println("No se puede dividir por cero.");
                    }
                    break;
                case 5:
                    if (confirmarSalida(read)) {
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

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static double dividir(int a, int b) {
        return (double) a / b;
    }

    public static boolean confirmarSalida(Scanner scanner) {
        System.out.print("¿Está seguro que desea salir del programa (S/N)? ");
        char confirmacion = scanner.next().charAt(0);
        return confirmacion == 'S' || confirmacion == 's';
    }
    
}
