/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaherenciaejex02.Entities;

import java.util.Scanner;

/**
 *
 * llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase
 * edificio tendrá como métodos: • Método calcularSuperficie(): calcula la
 * superficie del edificio. • Método calcularVolumen(): calcula el volumen del
 * edifico.
 */
public class Edificio {

    protected double ancho;
    protected double alto;
    protected double largo;
    private Scanner read = new Scanner(System.in);

    public Edificio() {
    }

    public Edificio(double ancho, double alto, double largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double calcularSuperficie( ) {
        double area = 2 * (ancho * largo + ancho * alto + largo * alto);
        System.out.println(" la superficie del edificio es "+ area +" m^2 ");
        return area;
    }

    public double calcularVolumen() {
        double volumen = ancho * largo * alto;
        return volumen;
    }

    public void crearEdificio() {
          System.out.println("ingrese el ancho del edificio ");
        setAncho(read.nextDouble());
         System.out.println("ingrese el largo del edificio ");
          setAlto(read.nextDouble());
          System.out.println("ingrese el alto del edificio ");
           setLargo(read.nextDouble());
  

        
    }

}
