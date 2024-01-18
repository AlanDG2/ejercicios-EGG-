/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadextra2;

import actividadextra2.Entidades.Alquiler;
import actividadextra2.Entidades.Pelicula;
import actividadextra2.Service.AlquilerServicio;
import actividadextra2.Service.PeliculaServicio;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ActividadExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PeliculaServicio pelicula = new PeliculaServicio();
        AlquilerServicio alquiler = new AlquilerServicio();
        Scanner read = new Scanner(System.in);
        ArrayList<Pelicula> listPelicula = new ArrayList();
        ArrayList<Alquiler> listAlquiler = new ArrayList();
        int opcion;

        do {
            mostrarMenu();
            opcion = read.nextInt();
            read.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    listPelicula.addAll(pelicula.crearPeliculas());
                    break;
                case 2:
                    pelicula.listarPeliculas(listPelicula);
                    break;
                case 3:
                    Alquiler disponible = alquiler.crearAlquiler(listPelicula);
                    if (disponible != null) {
                        listAlquiler.add(disponible);
                        String peliculaAlquilada = disponible.getPeliculaAlquilada();

                        pelicula.eliminarPelicula(listPelicula, peliculaAlquilada);

                    }

                    break;
                case 4:
                    alquiler.almacenarAlquiler(listAlquiler);
                    break;
                case 5:

                    pelicula.buscarPeliculaPorTitulo(listPelicula);
                    break;
                case 6:

                    pelicula.buscarPeliculaPorGenero(listPelicula);
                    break;
                case 7:
                    alquiler.buscarAlquilerPorFecha(listAlquiler);
                    break;
                case 8:
                    System.out.println("el precio total del  alquiler es "+alquiler.total);
                    break;
                case 9:
                    System.out.println("¡Gracias por utilizar nuestro servicio de alquiler de películas!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
            }
        } while (opcion != 9);
    }

    private static void mostrarMenu() {
        System.out.println("\n");
        System.out.println("========= Servicio de Alquiler de Películas ========");
        System.out.println("1. Cargar una película");
        System.out.println("2. Listar todas las películas disponibles");
        System.out.println("3. Crear un alquiler");
        System.out.println("4. Listar todos los alquileres");
        System.out.println("5. Buscar películas por título ");
        System.out.println("6. Buscar películas por  género");
        System.out.println("7. Buscar alquileres por fecha");
        System.out.println("8. precio del alquiler");
        System.out.println("9. Salir");
        System.out.print("Elige una opción: ");
        System.out.println("");
    }

}
