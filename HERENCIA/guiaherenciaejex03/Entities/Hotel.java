/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaherenciaejex03.Entities;

import java.util.Random;
import java.util.Scanner;

/**
 * Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas,
 * Cantidad de Pisos, Precio de Habitaciones.
 */
public class Hotel extends Alojamiento {

    protected int cantidadHabitaciones;
    protected int numeroCamas;
    protected int cantidadPisos;
    protected boolean gimnasio;
    protected String nombreRestaurante;
    protected int capacidadRestaurante;
    protected double precioHabitaciones;

    public Hotel() {
    }

    public Hotel(int cantidadHabitaciones, int numeroCamas, int cantidadPisos, boolean gimnasio, String nombreRestaurante, int capacidadRestaurante, double precioHabitaciones, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.numeroCamas = numeroCamas;
        this.cantidadPisos = cantidadPisos;
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
        this.precioHabitaciones = precioHabitaciones;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public int getCantidadPisos() {
        return cantidadPisos;
    }

    public void setCantidadPisos(int cantidadPisos) {
        this.cantidadPisos = cantidadPisos;
    }

    public boolean isGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(boolean gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public int getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(int capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public double getPrecioHabitaciones() {
        return precioHabitaciones;
    }

    public void setPrecioHabitaciones(double precioHabitaciones) {
        this.precioHabitaciones = precioHabitaciones;
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

    /*
      private int cantidadHabitaciones;
    private int numeroCamas;
    private int cantidadPisos;
    private boolean gimnasio;
    private String nombreRestaurante;
    private int capacidadRestaurante;
    private double precioHabitaciones
     */
    @Override
    public void crearAlojamiento() {
        super.crearAlojamiento(); //To change body of generated methods, choose Tools | Templates.
        cantidadHabitaciones = random.nextInt(91) + 10;
        numeroCamas = random.nextInt(9);
        cantidadPisos = random.nextInt(40) + 10;
        gimnasio = random.nextBoolean();
        nombreRestaurante = nombresRestaurantes[random.nextInt(nombresRestaurantes.length)];
        capacidadRestaurante = random.nextInt(60) + 10;
       
    }

    @Override
    public String toString() {
        return  super.toString()+ "\nHOTEL "+"\nCantidad de Habitaciones : " + cantidadHabitaciones + "\nNumero de Camas : " + numeroCamas + "\nCantidad de Pisos : " + cantidadPisos + "\nGimnasio : " + gimnasio + "\nNombre del Restaurante : " + nombreRestaurante + "\nCapacidad del Restaurante :" + capacidadRestaurante + "\nPrecio de las Habitaciones : " + precioHabitaciones  ;
    }

    @Override
    public double precioHabitacion() {
        int capacidad;
        int gym;
        
        if (capacidadRestaurante<30) {
            capacidad=10;
        }else if(capacidadRestaurante>=30 && capacidadRestaurante<=50){
        capacidad=30;
        }else{capacidad=50;}
        if (gimnasio) {
            gym=50;
        }else{gym=30;}
        double  preciofinal=super.precioHabitacion() + cantidadHabitaciones + capacidad + gym ;
         setPrecioHabitaciones(preciofinal);
        return super.precioHabitacion() + cantidadHabitaciones + capacidad + gym ; //To change body of generated methods, choose Tools | Templates.
    }

    

    
}
