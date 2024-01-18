/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaherenciaejex04.Entidades;

/**
Sobre el personal de servicio, hay que conocer a qué sección están asignados
(biblioteca, decanato, secretaría, ...).
 */
public class PersonalServicio extends Empleados {
     private  int seccion;

    public PersonalServicio() {
    }

    public PersonalServicio(int seccion, int anoIncorporacion, int numeroDespacho, String nombre, String apellidos, int  numeroIdentificacion, String estadoCivil) {
        super(anoIncorporacion, numeroDespacho, nombre, apellidos, numeroIdentificacion, estadoCivil);
        this.seccion = seccion;
    }

    public int getSeccion() {
        return seccion;
    }

    public void setSeccion(int seccion) {
        this.seccion = seccion;
    }

    public int getAnoIncorporacion() {
        return anoIncorporacion;
    }

    public void setAnoIncorporacion(int anoIncorporacion) {
        this.anoIncorporacion = anoIncorporacion;
    }

    public int  getNumeroDespacho() {
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
     
     public void cambiarSeccion(int nuevaSeccion) {
        
        this.seccion = nuevaSeccion;
    }
/*
    @Override
    public void crearPersona() {
        super.crearPersona(); //To change body of generated methods, choose Tools | Templates.
        this.seccion=random.nextInt(10)+1;
    }

  

    
     @Override
    public void reasignarDespacho(int nuevoDespacho) {
        super.reasignarDespacho(nuevoDespacho); //To change body of generated methods, choose Tools | Templates.
    }
     */
        
    @Override
    public String toString() {
        return super.toString()+"\nSeccion: " + seccion +"\n";
    }
     
     
     
}
