/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guiacollectionej04;

import com.mycompany.guiacollectionej04.Servicio.MovieService;

/**
 *
 * @author Usuario
 */
public class GuiaCollectionEj04 {

    public static void main(String[] args) {
         MovieService movieService = new MovieService();

        movieService.agregarAlumnos();

        System.out.println("Listado de todas las películas:");
        movieService.mostrarPelicula();

        System.out.println("Listado de películas con duración mayor a 1 hora:");
        movieService.mostrarPeliculaMayor();

        System.out.println("Listado de películas ordenadas por duración (de menor a mayor):");
        movieService.ordenarPeliculasPorDuracionMenorAMayor();

        System.out.println("Listado de películas ordenadas por duración (de mayor a menor):");
        movieService.ordenarPeliculasPorDuracionMayorAMenor();

        System.out.println("Listado de películas ordenadas por título:");
        movieService.ordenarPeliculasPorTitulo();

        System.out.println("Listado de películas ordenadas por director:");
        movieService.ordenarPeliculasPorDirector();
    }
}
