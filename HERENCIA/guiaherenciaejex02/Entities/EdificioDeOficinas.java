/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaherenciaejex02.Entities;

import java.util.Scanner;

/**
Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
 */
public class EdificioDeOficinas  extends Edificio{
    private int numOficinas;
    private int numPersonasOficina;
    private int numPisos;
    private Scanner read = new Scanner(System.in);

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int numOficinas, int numPersonasOficina, int numPisos) {
        this.numOficinas = numOficinas;
        this.numPersonasOficina = numPersonasOficina;
        this.numPisos = numPisos;
    }

    public EdificioDeOficinas(int numOficinas, int numPersonasOficina, int numPisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.numOficinas = numOficinas;
        this.numPersonasOficina = numPersonasOficina;
        this.numPisos = numPisos;
    }

    public int getNumOficinas() {
        return numOficinas;
    }

    public void setNumOficinas(int numOficinas) {
        this.numOficinas = numOficinas;
    }

    public int getNumPersonasOficina() {
        return numPersonasOficina;
    }

    public void setNumPersonasOficina(int numPersonasOficina) {
        this.numPersonasOficina = numPersonasOficina;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
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

    @Override
    public double calcularVolumen() {
        return super.calcularVolumen(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calcularSuperficie() {
        return super.calcularSuperficie(); //To change body of generated methods, choose Tools | Templates.
    }

    /*
    De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.*/
    
    public void cantPersonas(){
        System.out.println("cuantas personas hay por oficina ?");  
        int po= read.nextInt();
        read.nextLine();
        System.out.println("cuantas oficinas hay  por piso ? ");  
        int of= read.nextInt();
        read.nextLine();
        System.out.println("cuantos pisos tiene el edificio ");  
        int edificio= read.nextInt();
        read.nextLine();
        int floor=po*of;
        int people= po*of*edificio;
         System.out.println(" la cantidad de personas por piso es" + floor+ "\n la cantidad de personas en todo el edificio  es " + people );
         
        
        
    }
     
    
     @Override
    public void crearEdificio() {
        super.crearEdificio(); //To change body of generated methods, choose Tools | Templates.
    } 
    
    
    
}
