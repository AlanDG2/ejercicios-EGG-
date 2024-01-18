/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadextra2.Service;

import actividadextra2.Entidades.Pelicula;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * @author Usuario
 */
public class PeliculaServicio {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //  static Pelicula[] peliculasDisponibles = new Pelicula[100]; // [............La momia,null,null]  Peliculas
    static List<Pelicula> disponibles = new ArrayList();
    static Random random = new Random();

    public List<Pelicula> crearPeliculas() {

        String[] titulos = {"La La Land", "Inception", "The Dark Knight", "Interstellar", "Pulp Fiction",
            "The Shawshank Redemption", "Fight Club", "Goodfellas", "The Matrix", "Forrest Gump",
            "The Godfather", "Schindler's List", "Casablanca", "Braveheart", "Gladiator",
            "The Lion King", "Titanic", "Avatar", "The Avengers", "Jurassic Park",
            "Inglourious Basterds", "The Departed", "The Prestige", "Memento", "Eternal Sunshine of the Spotless Mind",
            "Amelie", "The Grand Budapest Hotel", "Blade Runner", "The Social Network", "The Big Lebowski"};
        String[] generos = {"Drama", "Sci-Fi", "Action", "Comedy", "Thriller", "Romance", "Horror", "Adventure"};

        Set<String> nombresUtilizados = new HashSet<>();

        System.out.println("cuantas peliculas desea agregar ");
        int n = leer.nextInt();
        leer.nextLine();

        for (int i = 0; i < n; i++) {
            String titulo;
            do {
                titulo = titulos[random.nextInt(titulos.length)];
            } while (nombresUtilizados.contains(titulo));

            nombresUtilizados.add(titulo);

            String genero = generos[random.nextInt(generos.length)];
            int anio = random.nextInt(30) + 1990; // Genera un año entre 1990 y 2019
            int duracion = random.nextInt(180) + 60; // Genera una duración entre 60 y 240 minutos         

            Pelicula pelicula = new Pelicula(titulo, genero, anio, duracion);
            disponibles.add(pelicula);

        }

        return disponibles;
    }

    public void listarPeliculas(ArrayList<Pelicula> list) {
        if (list.isEmpty()) {
            System.out.println("no  hay peliculas  disponibles  por favor ingrese  peliculas ");
        }
        for (Pelicula pelicula : list) {
            System.out.println(pelicula);
        }
    }

    public void buscarPeliculaPorTitulo(ArrayList<Pelicula> list) {
        if (list.isEmpty()) {
            System.out.println(" no hay  peliculas disponibles porfavor agregue  primero las peliculas");
        } else {

            boolean encontrado = false;
            System.out.println("ingrese el  titulo  que desea  buscar");
            String titulo = leer.nextLine();
            for (Pelicula pelicula : disponibles) {
                if (pelicula.getTitulo().equalsIgnoreCase(titulo)) {
                    encontrado = true;
                    System.out.println("La película está en la lista.");
                    System.out.println(pelicula);
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("La película no se encuentra en la lista.");
            }
        }
    }

    public void buscarPeliculaPorGenero( ArrayList<Pelicula> list) {
        if (list.isEmpty()) {
            System.out.println(" no hay  peliculas disponibles porfavor agregue  primero las peliculas");

        } else {
            System.out.println(" ingrese el genero  que  desea buscar");
             String genero = leer.nextLine();
            List<Pelicula> movies = disponibles.stream().filter(pelicula -> pelicula.getGenero().equalsIgnoreCase(genero)).collect(Collectors.toCollection(ArrayList::new));
            if (movies.isEmpty()) {
                System.out.println("No existe la película.");
            } else {
                for (Pelicula movie : movies) {
                    System.out.println(movie);
                }
            }
        }
    }

    public void eliminarPelicula(ArrayList<Pelicula> listaPeliculas, String tituloPelicula) {
        Iterator<Pelicula> iterator = listaPeliculas.iterator();
        while (iterator.hasNext()) {
            Pelicula pelicula = iterator.next();
            if (pelicula.getTitulo().equalsIgnoreCase(tituloPelicula)) {
                iterator.remove();
                break;
            }
        }
    }

}

/*  public static void almacenarPelicula(Pelicula pelicula){
        for(int i = 0; i < peliculasDisponibles.length; i++){
            if(peliculasDisponibles[i] == null){
                peliculasDisponibles[i] = pelicula;
                i = peliculasDisponibles.length;
            }
        }
    }

    public static void cargarPelicula(){
        almacenarPelicula(crearPelicula());
    }
 */
//     
//     public void crearPelicula(){
//        /*System.out.println("Ingrese el título de la película:");
//        String titulo = leer.nextLine();
//        System.out.println("Ingrese el genero de la película:");
//        String genero = leer.nextLine();
//        System.out.println("Ingrese el año de la película:");
//        int anio = leer.nextInt();
//        System.out.println("Ingrese la duración en minutos de la película:");
//        int duracionMinutos = leer.nextInt();
//
//        // Pelicula peli - new Pelicula(titulo, genero, anio, duracionMinutos);
//        // return  peli;
//        return new Pelicula(titulo, genero, anio, duracionMinutos);*/
//        Pelicula pelicula=new Pelicula("la momia","acción",1999,124);
//        disponibles.add(pelicula);
//       
//    }

