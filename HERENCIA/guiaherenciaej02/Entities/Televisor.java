/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaherenciaej02.Entities;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Televisor extends Electrodomesticos {

    private Scanner read = new Scanner(System.in);
    private int resolucion;
    private boolean sintonizadorTDT;
    private Random random = new Random();

    public Televisor() {
    }

    public Televisor(int resolucion, boolean sintonizadorTDT) {
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Televisor(int resolucion, boolean sintonizadorTDT, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    @Override
    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    @Override
    public double getPeso() {
        return peso;
    }

    @Override
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void crearTv() {

           crearElectrodomestico(" de el tv ");
        System.out.println("ingrese la resolucion del tv ");
        setResolucion(read.nextInt());
        read.nextLine();
        String answer;
         sintonizadorTDT =false;
        do {
             System.out.println("su tv tiene sintonizador tdt ? S/N");
             answer=read.nextLine();
             if (answer.equalsIgnoreCase("S")) {
               sintonizadorTDT =true;
            }
        } while (!"S".equalsIgnoreCase(answer) && !"N".equalsIgnoreCase(answer)  );
        
        
    }

    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal(); // Llama al método precioFinal() de la superclase Electrodomestico

        if (resolucion > 40) {
            precioFinal *= 1.3; // Incrementa el precio en un 30%
        }

        if (sintonizadorTDT) {
            precioFinal += 500; // Aumenta $500 si tiene sintonizador TDT
        }

        return precioFinal;
    }

}
