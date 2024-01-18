/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiapooejex03.Entidades;

/**
 *
 * @author Usuario
 */
public class Raices {
     private double a, b, c;
    
    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double getDiscriminante() {
        return Math.pow(b, 2) - 4 * a * c;
    }
    
    public boolean tieneRaices() {
        return getDiscriminante() >= 0;
    }
    
    public boolean tieneRaiz() {
        return getDiscriminante() == 0;
    }
    
    public void obtenerRaices() {
        if (tieneRaices()) {
            double x1 = (-b + Math.sqrt(getDiscriminante())) / (2 * a);
            double x2 = (-b - Math.sqrt(getDiscriminante())) / (2 * a);
            System.out.println("Las raices de la ecuación son: x1 = " + x1 + ", x2 = " + x2);
        } else {
            System.out.println("La ecuación no tiene raices reales.");
        }
    }
    
    public void obtenerRaiz() {
        if (tieneRaiz()) {
            double x = -b / (2 * a);
            System.out.println("La unica raiz de la ecuacion es: x = " + x);
        } else {
            System.out.println("La ecuacion no tiene una unica raiz.");
        }
    }
    
    public void calcular() {
        if (tieneRaices()) {
            obtenerRaices();
        } else if (tieneRaiz()) {
            obtenerRaiz();
        } else {
            System.out.println("La ecuación no tiene solucion.");
        }
    }
}
