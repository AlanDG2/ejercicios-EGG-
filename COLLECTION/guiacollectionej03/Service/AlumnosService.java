/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiacollectionej03.Service;

import guiacollectionej03.Entidades.Alumnos;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class AlumnosService {

    List<Alumnos> listaAlumnos = new ArrayList<>();
    Scanner read = new Scanner(System.in);

    public void agregarAlumnos() {
        String respuesta;

        do {
            System.out.print("Ingrese el nombre del alumno: ");
            String nombre = read.nextLine();
            List<Integer> notas = new ArrayList<>();

            for (int i = 1; i <= 3; i++) {
                System.out.print("Ingrese la nota " + i + ": ");
                int nota = read.nextInt();
                notas.add(nota);
            }

            read.nextLine(); // Limpiar el buffer de entrada

            Alumnos alumno = new Alumnos(nombre, notas);
            listaAlumnos.add(alumno);

            System.out.print("Desea crear otro alumno? (S/N): ");
            respuesta = read.nextLine();
        } while (respuesta.equalsIgnoreCase("S"));
    }
    
       public void mostrarAlumnos() {
        for (Alumnos alumno : listaAlumnos) {
            System.out.println("Alumno: " + alumno.getNombre());
            System.out.println("Notas: " + alumno.getNotas());
         }
    }
       
      public double notaFinal(String nombreAlumno) {

    for (Alumnos alumno : listaAlumnos) {
        if (alumno.getNombre().equalsIgnoreCase(nombreAlumno)) {
            List<Integer> notas = alumno.getNotas();
            double suma = 0;

            for (int nota : notas) {
                suma += nota;
            }

            return suma / notas.size();
        }
    }

    return -1; // Retorna -1 si el alumno no se encuentra en la lista
} 
       
    
    
    
}
