/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaherenciaejex04.Entidades;

/**
En cuanto a los estudiantes, se requiere almacenar el curso en el que están
matriculados.
 */
public class Estudiantes extends Persona {
     private String curso;

    public Estudiantes() {
    }

    public Estudiantes(String curso, String nombre, String apellidos, int numeroIdentificacion, String estadoCivil) {
        super(nombre, apellidos, numeroIdentificacion, estadoCivil);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
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
      
    
    public void matricularEnCurso(String nuevoCurso) {
        this.curso = nuevoCurso;
    }

    /*@Override
    public void crearPersona() {
        super.crearPersona(); //To change body of generated methods, choose Tools | Templates.
        this.curso=carrerasUniversitarias[random.nextInt(carrerasUniversitarias.length)];
        
        
    }
    @Override
    public void cambioEstadoCivil(String newEC) {
        super.cambioEstadoCivil(newEC); //To change body of generated methods, choose Tools | Templates.
    }*/

    
    @Override
    public String toString() {
        return super.toString() + "\ncurso : " + curso +"\n";
    }

    
    
    
      
}
