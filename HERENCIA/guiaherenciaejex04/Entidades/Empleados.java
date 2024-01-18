/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaherenciaejex04.Entidades;

/**
 *Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
incorporación a la facultad y qué número de despacho tienen asignado.
 
 */
public class Empleados extends Persona {
    protected  int anoIncorporacion;
    protected  int numeroDespacho;

    public Empleados() {
    }

    public Empleados(int anoIncorporacion, int numeroDespacho, String nombre, String apellidos, int numeroIdentificacion, String estadoCivil) {
        super(nombre, apellidos, numeroIdentificacion, estadoCivil);
        this.anoIncorporacion = anoIncorporacion;
        this.numeroDespacho = numeroDespacho;
    }

    public int getAnoIncorporacion() {
        return anoIncorporacion;
    }

    public void setAnoIncorporacion(int anoIncorporacion) {
        this.anoIncorporacion = anoIncorporacion;
    }

    public int getNumeroDespacho() {
        return numeroDespacho;
    }

    public void setNumeroDespacho(int numeroDespacho) {
        this.numeroDespacho = numeroDespacho;
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
/*
     public void reasignarDespacho(int nuevoDespacho) {
        this.numeroDespacho = nuevoDespacho;
    }

    @Override
    public void crearPersona() {
        super.crearPersona(); //To change body of generated methods, choose Tools | Templates.
        this.anoIncorporacion=random.nextInt(23)+2000;
        this.numeroDespacho=random.nextInt(10)+1;
    }*/

    @Override
    public String toString() {
        return super.toString()+"\nAnoIncorporacion : " + anoIncorporacion + "\nNumeroDespacho :" + numeroDespacho ;
    }
    
    
    
}
