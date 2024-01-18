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
public class Residencia extends ExtraHotel {

    private int cantidadHabitaciones;
    private boolean descuentoGremios;
    private boolean campoDeportivo;

    public Residencia() {
    }

    public Residencia(int cantidadHabitaciones, boolean descuentoGremios, boolean campoDeportivo) {
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.descuentoGremios = descuentoGremios;
        this.campoDeportivo = campoDeportivo;
    }

    public Residencia(int cantidadHabitaciones, boolean descuentoGremios, boolean campoDeportivo, boolean privado, double metrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metrosCuadrados, nombre, direccion, localidad, gerente);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.descuentoGremios = descuentoGremios;
        this.campoDeportivo = campoDeportivo;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public boolean isDescuentoGremios() {
        return descuentoGremios;
    }

    public void setDescuentoGremios(boolean descuentoGremios) {
        this.descuentoGremios = descuentoGremios;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
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

    @Override
    public String toString() {
        return super.toString()+ "\n Residencia"+"\nCantidad de Habitaciones : " + cantidadHabitaciones + "\nDescuentoGremios : " + descuentoGremios + "\nCampoDeportivo=" + campoDeportivo +"\n";
    }
    /*
       private int cantidadHabitaciones;
    private boolean descuentoGremios;
    private boolean campoDeportivo;
     */
    @Override
    public void crearAlojamiento() {
        super.crearAlojamiento(); //To change body of generated methods, choose Tools | Templates.
        cantidadHabitaciones = random.nextInt(5) + 1;
        descuentoGremios = random.nextBoolean();
        campoDeportivo = random.nextBoolean();

    }

}
