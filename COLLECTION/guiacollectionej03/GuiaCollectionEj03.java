/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guiacollectionej03;

import guiacollectionej03.Service.AlumnosService;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class GuiaCollectionEj03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         AlumnosService servicio = new AlumnosService();
         Scanner read = new Scanner(System.in);
  
     servicio.agregarAlumnos();
    servicio.mostrarAlumnos();

     System.out.print("Ingrese el nombre del alumno para calcular su nota final: ");
    String nombreAlumno = read.nextLine();
    double promedio=servicio.notaFinal(nombreAlumno);
    
    if (promedio != -1) {
        System.out.println("La nota final de " + nombreAlumno + " es: " + promedio);
    } else {
        System.out.println("El alumno " + nombreAlumno + " no se encuentra en la lista.");
    }
    }
    
}
