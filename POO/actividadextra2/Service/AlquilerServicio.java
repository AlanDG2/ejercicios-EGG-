/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadextra2.Service;

import actividadextra2.Entidades.Alquiler;
import actividadextra2.Entidades.Pelicula;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Usuario
 */
public class AlquilerServicio {

    public double total;
    static Alquiler[] alquileres = new Alquiler[100];
    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Alquiler crearAlquiler(ArrayList<Pelicula> list) {
        if (list.isEmpty()) {
            System.out.println("no hay peliculas disponibles para alquilar ");
            return null;
        } else {
            System.out.println("Ingrese el título de la película alquilada:");
            String peliculaAlquilada = leer.nextLine();

            boolean encontrado = false;

            for (Pelicula pelicula : list) {
                if (pelicula.getTitulo().equalsIgnoreCase(peliculaAlquilada)) {
                    encontrado = true;

                    break;
                }
            }

            if (encontrado) {
                System.out.println("La película está disponible ");
                System.out.println("Ingrese la fecha de inicio del alquiler en el formato dd/MM/yyyy:");
                Date fechaInicio = pedirFecha(leer.nextLine());

                System.out.println("Ingrese la fecha de fin del alquiler en el formato dd/MM/yyyy:");
                Date fechaFin = pedirFecha(leer.nextLine());

                double precio = precioAlquiler(fechaInicio, fechaFin);
                System.out.println("el precio de este alquiler es de  $" + precio);

                precioFinal(precio);
                return new Alquiler(peliculaAlquilada, fechaInicio, fechaFin, precio);

                // Alquiler alquiler = new Alquiler(peliculaAlquilada, pedirFecha("01/03/2022"), pedirFecha("15/3/2022"), 1000d);
            } else {

                System.out.println("La película no  esta disponible ");
                return null;
            }
        }
    }

    public Date pedirFecha(String fechaIngresada) {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha;
        try {
            fecha = formatoFecha.parse(fechaIngresada);
            System.out.println("Fecha ingresada: " + fecha);
            return fecha;

        } catch (ParseException e) {
            System.out.println("Formato de fecha inválido. Inténtalo de nuevo.");
        }
        return null;
    }

    public void almacenarAlquiler(ArrayList<Alquiler> list) {
        if (list.isEmpty()) {
            System.out.println("no  hay peliculas  disponibles  por favor ingrese  peliculas ");
        }
        for (Alquiler pelicula : list) {
            System.out.println(pelicula);
        }
    }

    public void buscarAlquilerPorFecha(ArrayList<Alquiler> list) {
        if (list.isEmpty()) {
            System.out.println("no hya alquileres disponibles por favor crear los aqluileres");
        } else {
            System.out.println("ingrese fecha de alquiler en formato (dd/MM/yyyy) ");
            String fechaAlquiler = leer.nextLine();
            Date fechaIngresada = pedirFecha(fechaAlquiler);

            boolean existente = false;
            for (Alquiler alquiler : list) {
                if (alquiler.getFechaInicio().equals(fechaIngresada)) {
                    System.out.println(alquiler);
                    existente = true;
                }
            }

            if (!existente) {
                System.out.println("No existe alquiler con esa fecha ");
            }
        }

    }

    public double precioAlquiler(Date fecha1, Date fecha2) {
        double precio = 0;
        // Crear instancias de Calendar y establecer las fechas
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(fecha1);
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(fecha2);

        // Calcular la diferencia en milisegundos entre las fechas
        long diferenciaMillis = cal2.getTimeInMillis() - cal1.getTimeInMillis();

        // Convertir la diferencia a días
        long diferenciaDias = diferenciaMillis / (24 * 60 * 60 * 1000);

        System.out.println("Días de alquiler: " + diferenciaDias);

        if (diferenciaDias > 3) {
            precio += 10 + ((diferenciaDias - 3) * 0.1);

        }

        return precio;
    }

    public double precioFinal(double precio) {
      total+=precio;
      return total;
    }

    
}


/*

 public static void cargarAlquiler(){
        almacenarAlquiler(crearAlquiler());
    }
 */
