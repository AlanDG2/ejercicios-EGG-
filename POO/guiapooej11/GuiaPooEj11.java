/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guiapooej11;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class GuiaPooEj11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedimos al usuario el día, mes y año para crear la fecha
        System.out.print("Introduce el dia: ");
        int dia = scanner.nextInt();
        System.out.print("Introduce el mes (1-12): ");
        int mes = scanner.nextInt() - 1; 
        System.out.print("Introduce el anio: ");
        int anio = scanner.nextInt();
        

        Date fecha = new Date(anio - 1900, mes, dia); 
        System.out.println("Fecha introducida: " + fecha);
        Date fechaActual = new Date();
        int diferenciaAnios = fechaActual.getYear() - fecha.getYear();

        System.out.println("Diferencia de años entre la fecha introducida y la actual: " + diferenciaAnios);
    }
    
}
