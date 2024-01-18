/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaherenciaejex04.Entidades;

/**
Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
pertenecen (lenguajes, matemáticas, arquitectura, ...).
 */
public class Profesores extends Empleados{
     private String departamento;

    public Profesores() {
    }

    public Profesores(String departamento, int anoIncorporacion, int numeroDespacho, String nombre, String apellidos, int numeroIdentificacion, String estadoCivil) {
        super(anoIncorporacion, numeroDespacho, nombre, apellidos, numeroIdentificacion, estadoCivil);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
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

    public void setNumeroIdentificacion(int  numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
     
      public void cambiarDepartamento(String nuevoDepartamento) {
        this.departamento = nuevoDepartamento;
    }
/*
    @Override
    public void reasignarDespacho(int nuevoDespacho) {
        super.reasignarDespacho(nuevoDespacho); //To change body of generated methods, choose Tools | Templates.
    }

      
    @Override
    public void crearPersona() {
        super.crearPersona(); //To change body of generated methods, choose Tools | Templates.
        this.departamento=nombresClases[random.nextInt(nombresClases.length)];
    }
*/
      
    @Override
    public String toString() {
        return super.toString()+  "\nDepartamento : " + departamento+ "\n"  ;
    }
      
      
      
}
