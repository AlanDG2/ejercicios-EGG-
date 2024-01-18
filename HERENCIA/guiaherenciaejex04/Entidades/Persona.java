/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaherenciaejex04.Entidades;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * • Por cada persona, se debe conocer, al menos, su nombre y apellidos, su
 * número de identificación y su estado civil.
 */
public class Persona {

    protected String nombre;
    protected String apellidos;
    protected int numeroIdentificacion;
    protected String estadoCivil;
    String[] nombresEdificios = {"Torre Esmeralda", "Edificio Aurora", "Residencial Victoria", "Centro Empresarial Ébano", "Torres del Sol", "Edificio Celeste", "Condominio Alameda", "Complejo Dorado", "Residencial Primavera", "Edificio Mirador", "Torre del Lago", "Conjunto Altamira", "Edificio Aurora", "Residencial Los Pinos", "Centro Comercial Plaza Real", "Edificio Marino", "Condominio Bella Vista", "Complejo Las Rosas", "Residencial San Martín", "Edificio Horizonte", "Torres del Parque", "Condominio Las Brisas", "Edificio Estrella", "Residencial Jardines del Valle", "Centro Empresarial Oasis", "Edificio Azul", "Conjunto Santa Fe", "Residencial Los Alamos", "Torres del Bosque", "Edificio Delicias", "Conjunto Vista Hermosa"};
    String[] names = {"Hugo", "Lucas", "Mateo", "León", "Benjamín", "Sebastián", "Martín", "Daniel", "Samuel", "Emilio", "Valentino", "Joaquín", "Diego", "Tomás", "Agustín", "Nicolás", "Santiago", "Lautaro", "Juan", "Alejandro", "Isabella", "Mía", "Emma", "Sofía", "Valentina", "Lucía", "Camila", "Martina", "Lola", "Julia"};
    String[] lastNames = {"Pérez", "González", "Rodríguez", "López", "García", "Martínez", "Fernández", "Gómez", "Hernández", "Jiménez", "Torres", "Díaz", "Rivera", "Ruiz", "Silva", "Vargas", "Romero", "Mendoza", "Ortega", "Núñez", "Sánchez", "Castillo", "Ramos", "Reyes", "Alvarez", "Soto", "Cruz", "Navarro", "Morales", "Molina"};
    String[] nombresRestaurantes = {"La Trattoria", "El Asador Argentino", "Sabor Mexicano", "La Brasserie", "Ristorante Italiano", "Burger Heaven", "Sushi Express", "El Rinconcito Peruano", "Thai Spice", "Pizzeria Bella Napoli", "Fusion Grill", "Café Paris", "Mariscos del Puerto", "La Pampa Grill", "Taste of India", "El Rincón Español", "Noodle House", "Steakhouse Texas", "Soul Kitchen", "El Jardín Oriental", "Casa de Tapas", "Bistro Français", "Taco Loco", "Gourmet Deli", "Sabor Brasileño", "Parrilla Argentina", "Mediterranean Flavors", "Asian Fusion", "Delizia Gelato", "Tandoori Spice"};
    Scanner read = new Scanner(System.in);
    Random random = new Random();
    String[] estadosCiviles = {"Soltero", "Casado", "Unión Libre"};
    String[] nombresClases = {"Matemáticas", "Historia", "Biología", "Literatura", "Física", "Inglés", "Economía", "Química", "Arte", "Educación Física"};
    String[] carrerasUniversitarias = {"Ingeniería Civil", "Medicina", "Psicología", "Administración de Empresas", "Derecho", "Arquitectura", "Educación", "Ciencias de la Computación", "Economía", "Diseño Gráfico"};

    public Persona() {
    }

    public Persona(String nombre, String apellidos, int numeroIdentificacion, String estadoCivil) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroIdentificacion = numeroIdentificacion;
        this.estadoCivil = estadoCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(int numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

   /* public void cambioEstadoCivil(String newEC) {
        this.estadoCivil = newEC;
    }

    public void crearPersona() {
        this.nombre = names[random.nextInt(names.length)];
        this.apellidos = lastNames[random.nextInt(lastNames.length)];
        this.numeroIdentificacion = random.nextInt(99999) + 10000;
        this.estadoCivil = estadosCiviles[random.nextInt(estadosCiviles.length)];
    }*/

    @Override
    public String toString() {
        return "nombre: " + nombre + " " + apellidos + "\nId:" + numeroIdentificacion + "\nestadoCivil : " + estadoCivil;
    }

}
