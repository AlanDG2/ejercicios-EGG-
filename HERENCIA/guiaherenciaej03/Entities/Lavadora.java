/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaherenciaej03.Entities;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Lavadora extends Electrodomesticos {

    private Scanner read = new Scanner(System.in);
    private int carga;
    private Random random = new Random();

    public Lavadora() {
    }

    public Lavadora(int carga) {
        this.carga = carga;
    }

    public Lavadora(int carga, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
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

    /*Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
    padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
    el atributo propio de la lavadora.*/
    public void crearLavadora() {
             crearElectrodomestico();
        setCarga(random.nextInt(20)+5);
        
    }

    
    @Override
    public double precioFinal() {
    double precioFinal = super.precioFinal(); // Llama al método precioFinal() de la superclase Electrodomestico

    if (carga > 30) {
        precioFinal += 500;
    }
        System.out.println("el precio de la lavadora es " + precioFinal);
    return precioFinal;
}
    
    
    
    
    
}
