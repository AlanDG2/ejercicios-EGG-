/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaherenciaejex01.Entidades;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Velero extends Barco {
     private int numMastiles;
     private Scanner read = new Scanner(System.in);

    public Velero() {
    }

    public Velero(int numMastiles) {
        this.numMastiles = numMastiles;
    }

    public Velero(int numMastiles, String matricula, Integer eslora, Integer añoFabricacion) {
        super(matricula, eslora, añoFabricacion);
        this.numMastiles = numMastiles;
    }

    public int getNumMastiles() {
        return numMastiles;
    }

    public void setNumMastiles(int numMastiles) {
        this.numMastiles = numMastiles;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getEslora() {
        return eslora;
    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    public Integer getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(Integer  añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    @Override
    public double calcularModulo() {
        return super.calcularModulo() + numMastiles; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void crearBarco(String name) {
        super.crearBarco(name); //To change body of generated methods, choose Tools | Templates.
        System.out.println("ingrese el numero de mastiles  ");
        setNumMastiles(read.nextInt());
        read.nextLine();
        
    }

    @Override
    public String toString() {
        return "Velero : "+  super.toString() + "\n Numero de mastiles" + numMastiles ;
    }
    
    
    
     
     
}
