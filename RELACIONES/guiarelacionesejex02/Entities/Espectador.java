/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiarelacionesejex02.Entities;

/**
 *
 * @author Usuario
 */
public class Espectador {
   // nombre edad dinero dispoible
    private String nombre;
    private Integer edad;
    private double dineroDisponilbe;

    public Espectador() {
    }

    public Espectador(String nombre, Integer edad, double dineroDisponilbe) {
        this.nombre = nombre;
        this.edad = edad;
        this.dineroDisponilbe = dineroDisponilbe;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public double getDineroDisponilbe() {
        return dineroDisponilbe;
    }

    public void setDineroDisponilbe(double dineroDisponilbe) {
        this.dineroDisponilbe = dineroDisponilbe;
    }

    @Override
    public String toString() {
        return "Espectador{" + "nombre=" + nombre + ", edad=" + edad + ", dineroDisponilbe=" + dineroDisponilbe + '}';
    }
    
    
}
