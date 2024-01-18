/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaherenciaejex03.Entities;

import java.util.Random;
import java.util.Scanner;

/**
 * Los alojamientos se identifican por un nombre, una dirección, una localidad y
 * un gerente encargado del lugar.
 */
public class Alojamiento {

    protected String nombre;
    protected String direccion;
    protected String localidad;
    protected String gerente;
    String[] nombresEdificios = {"Torre Esmeralda", "Edificio Aurora", "Residencial Victoria", "Centro Empresarial Ébano", "Torres del Sol", "Edificio Celeste", "Condominio Alameda", "Complejo Dorado", "Residencial Primavera", "Edificio Mirador", "Torre del Lago", "Conjunto Altamira", "Edificio Aurora", "Residencial Los Pinos", "Centro Comercial Plaza Real", "Edificio Marino", "Condominio Bella Vista", "Complejo Las Rosas", "Residencial San Martín", "Edificio Horizonte", "Torres del Parque", "Condominio Las Brisas", "Edificio Estrella", "Residencial Jardines del Valle", "Centro Empresarial Oasis", "Edificio Azul", "Conjunto Santa Fe", "Residencial Los Alamos", "Torres del Bosque", "Edificio Delicias", "Conjunto Vista Hermosa"};
    String[] names = {"Hugo", "Lucas", "Mateo", "León", "Benjamín", "Sebastián", "Martín", "Daniel", "Samuel", "Emilio", "Valentino", "Joaquín", "Diego", "Tomás", "Agustín", "Nicolás", "Santiago", "Lautaro", "Juan", "Alejandro", "Isabella", "Mía", "Emma", "Sofía", "Valentina", "Lucía", "Camila", "Martina", "Lola", "Julia"};
    String[] lastNames = {"Pérez", "González", "Rodríguez", "López", "García", "Martínez", "Fernández", "Gómez", "Hernández", "Jiménez", "Torres", "Díaz", "Rivera", "Ruiz", "Silva", "Vargas", "Romero", "Mendoza", "Ortega", "Núñez", "Sánchez", "Castillo", "Ramos", "Reyes", "Alvarez", "Soto", "Cruz", "Navarro", "Morales", "Molina"};
    String[] nombresRestaurantes = {"La Trattoria", "El Asador Argentino", "Sabor Mexicano", "La Brasserie", "Ristorante Italiano", "Burger Heaven", "Sushi Express", "El Rinconcito Peruano", "Thai Spice", "Pizzeria Bella Napoli", "Fusion Grill", "Café Paris", "Mariscos del Puerto", "La Pampa Grill", "Taste of India", "El Rincón Español", "Noodle House", "Steakhouse Texas", "Soul Kitchen", "El Jardín Oriental", "Casa de Tapas", "Bistro Français", "Taco Loco", "Gourmet Deli", "Sabor Brasileño", "Parrilla Argentina", "Mediterranean Flavors", "Asian Fusion", "Delizia Gelato", "Tandoori Spice"};

    Scanner read = new Scanner(System.in);
    Random random = new Random();

    public Alojamiento() {
    }

    public Alojamiento(String nombre, String direccion, String localidad, String gerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.gerente = gerente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public void crearAlojamiento() {
        nombre = nombresEdificios[random.nextInt(nombresEdificios.length)];
        direccion = "calle " + random.nextInt(99) + " #" + random.nextInt(99) + "-" + random.nextInt(99);
        localidad = String.valueOf(random.nextInt(99));
        gerente = lastNames[random.nextInt(lastNames.length)];

    }

    @Override
    public String toString() {
        return "Alojamiento: " + "\nNombre: " + nombre + "\nDireccion : " + direccion + "\nLocalidad : " + localidad + "\nGerente : " + gerente  ;
        
        
    }

    public double precioHabitacion(){
        double precio = 50;
        return precio;
    }
}
