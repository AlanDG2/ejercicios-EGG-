/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiarelacionesejex02.ServiceCinema;

import guiarelacionesejex02.Entities.Cine;
import guiarelacionesejex02.Entities.Espectador;
import guiarelacionesejex02.Entities.Pelicula;
import guiarelacionesejex02.Entities.Sala;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServiceCinema {

    private ArrayList<Espectador> clientes;
    private String[] names = {"Hugo", "Lucas", "Mateo", "León", "Benjamín", "Sebastián", "Martín", "Daniel", "Samuel", "Emilio", "Valentino", "Joaquín", "Diego", "Tomás", "Agustín", "Nicolás", "Santiago", "Lautaro", "Juan", "Alejandro", "Isabella", "Mía", "Emma", "Sofía", "Valentina", "Lucía", "Camila", "Martina", "Lola", "Julia"};
    private Random random = new Random();
    private Pelicula pelicula ;
    private Scanner read = new Scanner(System.in);
    private String[][] asientos = new String[8][6];
    private Cine cine;
    private Sala sala;

    public Sala cinema() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                asientos[i][j] = String.valueOf(asientos.length - i) + (char) (j + 'A') + " ";
            }
        }
        sala = new Sala(asientos);
        return sala;
    }

    public Pelicula pelicula() {
        read.nextLine();
        System.out.println("ingrese nombre de la pelicula");
        String titulo = read.nextLine();
        System.out.println("ingrese duracion en minutos de la pelicula");
        Integer duracion = read.nextInt();
        System.out.println("ingrese edad minima  de la pelicula");
        Integer edad = read.nextInt();
        read.nextLine();
        System.out.println("ingrese nombre del director  de la pelicula");
        String director = read.nextLine();
        pelicula = new Pelicula(titulo, duracion, edad, director);
        return pelicula;

    }

    public void cine() {
         System.out.println("ingrese el precio de  la  entrada ");
        Double precio = read.nextDouble();

        cine = new Cine(pelicula(), cinema(), precio);
        System.out.println("");

    }

    public List<Espectador> createPeople(int cantidad) {
        clientes = new ArrayList();
        for (int i = 0; i < cantidad; i++) {
            String nombre = names[random.nextInt(names.length)];
            Integer edad = random.nextInt(50);
            Double dinero = (double) random.nextInt(100);
            Espectador espectador = new Espectador(nombre, edad, dinero);
            clientes.add(espectador);
        }

        return clientes;
    }

    public void ubicacion() {

        System.out.println("ingreso de espectadores ");
        int fila;
        int columna;
        boolean asientolibre = false;
        int cont = 0;
        String ocupado;
        for (int i = 0; i < clientes.size(); i++) {
            String nombre = clientes.get(i).getNombre();
            Integer edad = clientes.get(i).getEdad();
            Double dinero = clientes.get(i).getDineroDisponilbe();
            Integer edadMinima = cine.getPelicula().getEdadMinima();
            Double entrada = cine.getPrecio();

            System.out.println("ingreso del espectador numero " + (i + 1));
            if (cont <= 48) {
                if (edad >= edadMinima) {
                    if (dinero >= entrada) {
                        do {
                            fila = random.nextInt(8);
                            columna = random.nextInt(6);
                            String silla = cine.getSala().obtenerElemento(fila, columna);
                            String disponible = String.valueOf(silla.charAt(silla.length() - 1));
                            silla=silla.substring(0,silla.length() - 1);
                            if (disponible.equalsIgnoreCase("X")) {
                                System.out.println(" lo siento el asiento " + silla + " esta ocupado \n buscando asiento disponible ");
                            } else {
                                System.out.println("Bienvenido " + nombre + " puede ingresar, su asiento es " + silla);
                                ocupado=silla + "X";
                                cine.getSala().modificarValor(fila, columna, ocupado);
                                cont++;
                                asientolibre = true;
                                break;
                            }
                        } while (!asientolibre);
                        asientolibre=false;
                    } else {
                        System.out.println("lo siento " + nombre + " no tienes el suficiente dinero para comprar la entrada ");
                    }
                } else {
                    System.out.println("lo siento " + nombre + " no tienes edad para ver esta pelicula ");
                }
            } else {
                System.out.println(" lo siento " + nombre + " ya no tenemos asientos disponibles ");
            }

            System.out.println("----------------------------------------------------------------------------------------------------");
        }

    }

    public void mostrarSala(){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("["+ cine.getSala().obtenerElemento(i, j)+"]");
            }
            System.out.println("");
        }
    }
}
