/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaherenciaej04;

import guiaherenciaej04.entidades.Circulo;
import guiaherenciaej04.entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class GuiaHerenciaEj04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("ingrese el radio del circulo ");
        double radio= read.nextDouble();
        
        System.out.println("ingrese la base del rectangulo ");
        double base= read.nextDouble();
        System.out.println("ingrese la altura del rectangulo ");
        double altura = read.nextDouble();
        Circulo circulo = new Circulo(radio);
        Rectangulo rectangulo = new Rectangulo(base, altura);
        
        // Calcular área y perímetro del círculo
        double areaCirculo = circulo.calcularArea();
        double perimetroCirculo = circulo.calcularPerimetro();
        
        // Calcular área y perímetro del rectángulo
        double areaRectangulo = rectangulo.calcularArea();
        double perimetroRectangulo = rectangulo.calcularPerimetro();
        
        // Mostrar resultados
        System.out.println("Área del círculo: " + areaCirculo);
        System.out.println("Perímetro del círculo: " + perimetroCirculo);
        System.out.println("Área del rectángulo: " + areaRectangulo);
        System.out.println("Perímetro del rectángulo: " + perimetroRectangulo);
    }
    
}
