/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaherenciaejex02.Entities;

import java.util.Scanner;

/**
 *
 Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
 */
public class PoliDeportivo extends Edificio {
    private String nombre;
    private String tipo;
    private Scanner read = new Scanner(System.in);

    public PoliDeportivo() {
    }

    public PoliDeportivo(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public PoliDeportivo(String nombre, String tipo, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    @Override
    public void crearEdificio() {
        super.crearEdificio(); //To change body of generated methods, choose Tools | Templates.
           
       
    }
    
    public  int tipo(){
         System.out.println("ingrese el nombre del  poli Deportivo ");
        setNombre(read.nextLine());
        System.out.println("el polideportivo  es  abietro o  techado");
        setTipo(read.nextLine());
     
        if (getTipo().equalsIgnoreCase("abierto")) {
             System.out.println("poli deportivo  abierto ");
            return 1;
            
        }
         System.out.println("poli deportivo con techo  ");
        return 0;
    }
    
}
