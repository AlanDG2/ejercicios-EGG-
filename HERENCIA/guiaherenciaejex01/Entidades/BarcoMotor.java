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
public class BarcoMotor extends Barco {

    private Integer cv;
    private Scanner read = new Scanner(System.in);

    public BarcoMotor() {
    }

    public BarcoMotor(Integer cv) {
        this.cv = cv;
    }

    public BarcoMotor(Integer cv, String matricula, Integer eslora, Integer añoFabricacion) {
        super(matricula, eslora, añoFabricacion);
        this.cv = cv;
    }

    public Integer getCv() {
        return cv;
    }

    public void setCv(Integer cv) {
        this.cv = cv;
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
        return super.calcularModulo() + cv; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void crearBarco(String name) {
        super.crearBarco(name); //To change body of generated methods, choose Tools | Templates.
        System.out.println("ingrese el numero de caballos de vapor ");
        setCv(read.nextInt());
        read.nextLine();

    }

    @Override
    public String toString() {
        return "BarcoMotor:" + "\n Caballos de vapor " + cv + super.toString();
    }

}
