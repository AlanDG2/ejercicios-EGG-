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
public class ExtraHotel extends Alojamiento{
    private boolean privado;
    private double metrosCuadrados;

    public ExtraHotel() {
    }

    public ExtraHotel(boolean privado, double metrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.metrosCuadrados = metrosCuadrados;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
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
      private boolean privado;
    private double metrosCuadrados;
    */

    @Override
    public String toString() {
        return super.toString() +"\nEXTRA HOTEL "+ "\nPrivado : " + privado + "\nMetrosCuadrados : " + metrosCuadrados ;
    }

  
    @Override
    public void crearAlojamiento() {
        super.crearAlojamiento(); //To change body of generated methods, choose Tools | Templates.
        setPrivado(random.nextBoolean());
        setMetrosCuadrados((double) random.nextInt(200)+50 ) ;
        
    }
    
    
   
}
