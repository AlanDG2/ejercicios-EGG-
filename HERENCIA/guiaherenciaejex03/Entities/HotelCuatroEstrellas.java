/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaherenciaejex03.Entities;

/**
 *
 * @author Usuario
 */
public class HotelCuatroEstrellas extends Hotel {

    public HotelCuatroEstrellas() {
    }

    public HotelCuatroEstrellas(int cantidadHabitaciones, int numeroCamas, int cantidadPisos, boolean gimnasio, String nombreRestaurante, int capacidadRestaurante, double precioHabitaciones, String nombre, String direccion, String localidad, String gerente) {
        super(cantidadHabitaciones, numeroCamas, cantidadPisos, gimnasio, nombreRestaurante, capacidadRestaurante, precioHabitaciones, nombre, direccion, localidad, gerente);
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
    
        
    }

    @Override
    public String toString() {
        return super.toString()+"\n"; //To change body of generated methods, choose Tools | Templates.
    }

}
