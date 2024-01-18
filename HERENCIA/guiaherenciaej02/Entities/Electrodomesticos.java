/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaherenciaej02.Entities;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Electrodomesticos {
    private  Scanner read = new Scanner(System.in);
    protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    

    public Electrodomesticos() {
    }

    public Electrodomesticos(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    private char comprobarConsumoEnergetico(char letra) {
        if (letra >= 'A' && letra <= 'F') {
            return letra;
        } else {
            return 'F';
        }
    }

    private String comprobarColor(String color) {
        String colorValido = color.toLowerCase();
        if (colorValido.equals("blanco") || colorValido.equals("negro") || colorValido.equals("rojo")
                || colorValido.equals("azul") || colorValido.equals("gris")) {
            return colorValido;
        } else {
            return "blanco";
        }
    }
    
      public void crearElectrodomestico(String name) {
        System.out.print("Ingrese el color "+ name + "(blanco, negro, rojo, azul, gris): ");
        setColor( comprobarColor(read.nextLine()));
        System.out.print("Ingrese el consumo energético  "+ name + "(letra entre A y F): ");
         setConsumoEnergetico(comprobarConsumoEnergetico( read.next().charAt(0)));
        System.out.print("Ingrese el peso  "+ name + " : ");
        setPeso(read.nextDouble());
        setPrecio(1000d);
        
    }

      public double precioFinal() {
        double precioFinal = precio;

        // Ajustar precio según el consumo energético
        switch (consumoEnergetico) {
            case 'A':
                precioFinal += 1000;
                break;
            case 'B':
                precioFinal += 800;
                break;
            case 'C':
                precioFinal += 600;
                break;
            case 'D':
                precioFinal += 500;
                break;
            case 'E':
                precioFinal += 300;
                break;
            case 'F':
                precioFinal += 100;
                break;
        }

        // Ajustar precio según el peso
        if (peso >= 1 && peso <= 19) {
            precioFinal += 100;
        } else if (peso >= 20 && peso <= 49) {
            precioFinal += 500;
        } else if (peso >= 50 && peso <= 79) {
            precioFinal += 800;
        } else if (peso >= 80) {
            precioFinal += 1000;
        }

        return precioFinal;
    }
      
      
      
      
      
}
