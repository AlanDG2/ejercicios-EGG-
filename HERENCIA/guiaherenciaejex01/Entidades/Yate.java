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
public class Yate extends Barco{
    private Integer cv;
    private Integer numCamarotes;
     private Scanner read = new Scanner(System.in);

    public Yate() {
    }

    public Yate(Integer cv, Integer numCamarotes) {
        this.cv = cv;
        this.numCamarotes = numCamarotes;
    }

    public Yate(Integer cv, Integer numCamarotes, String matricula, Integer eslora, Integer añoFabricacion) {
        super(matricula, eslora, añoFabricacion);
        this.cv = cv;
        this.numCamarotes = numCamarotes;
    }

    public Integer getCv() {
        return cv;
    }

    public void setCv(Integer cv) {
        this.cv = cv;
    }

    public Integer getNumCamarotes() {
        return numCamarotes;
       
    }

    public void setNumCamarotes(Integer numCamarotes) {
        this.numCamarotes = numCamarotes;
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

    public void setAñoFabricacion(Integer añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    @Override
    public double calcularModulo() {
        return super.calcularModulo()+cv+numCamarotes; //To change body of generated methods, choose Tools | Templates.
    }

     @Override
    public void crearBarco(String name) {
        super.crearBarco(name); //To change body of generated methods, choose Tools | Templates.
        System.out.println("ingrese el numero de caballos de vapor ");
        setCv(read.nextInt());
        read.nextLine();
        System.out.println("ingrese el numero camarotes ");
        setNumCamarotes(read.nextInt());
        read.nextLine();
    
    }

    @Override
    public String toString() {
        return "Yate:" + "\n Caballos de vapor" + cv + "\n Numero de camarotes : " + numCamarotes + super.toString();
    }

    
           
}
