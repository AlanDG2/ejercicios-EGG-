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
public class Camping extends ExtraHotel {

    private int capacidadMaximaCarpas;
    private int cantidadBanios;
    private boolean restaurante;

    public Camping() {
    }

    public Camping(int capacidadMaximaCarpas, int cantidadBanios, boolean restaurante, boolean privado, double metrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metrosCuadrados, nombre, direccion, localidad, gerente);
        this.capacidadMaximaCarpas = capacidadMaximaCarpas;
        this.cantidadBanios = cantidadBanios;
        this.restaurante = restaurante;
    }

    public int getCapacidadMaximaCarpas() {
        return capacidadMaximaCarpas;
    }

    public void setCapacidadMaximaCarpas(int capacidadMaximaCarpas) {
        this.capacidadMaximaCarpas = capacidadMaximaCarpas;
    }

    public int getCantidadBanios() {
        return cantidadBanios;
    }

    public void setCantidadBanios(int cantidadBanios) {
        this.cantidadBanios = cantidadBanios;
    }

    public boolean isRestaurante() {
        return restaurante;
    }

    public void setRestaurante(boolean restaurante) {
        this.restaurante = restaurante;
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
        return super.toString() + "\n Camping" +"\nCapacidad Maxima Carpas : " + capacidadMaximaCarpas + "\nCantidad Banios : " + cantidadBanios + "\nRestaurante : " + restaurante + "\n" ;
    }

    /*
      private int capacidadMaximaCarpas;
    private int cantidadBanios;
    private boolean restaurante;
     */
    @Override
    public void crearAlojamiento() {
        super.crearAlojamiento(); //To change body of generated methods, choose Tools | Templates.
        capacidadMaximaCarpas=random.nextInt(20)+50;
        cantidadBanios=random.nextInt(10)+5;
        restaurante=random.nextBoolean();

    }

}
