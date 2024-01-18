/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiapooej02.Services;

import guiapooej02.Entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CircunferenciaService {
     private Scanner scanner = new Scanner(System.in);

    public Circunferencia crearCircunferencia() {
        System.out.print("Introduce el radio de la circunferencia: ");
        double radio = scanner.nextDouble();
        return new Circunferencia(radio);
    }

    public double calcularArea(Circunferencia circunferencia) {
        return Math.PI * Math.pow(circunferencia.getRadio(), 2);
    }

    public double calcularPerimetro(Circunferencia circunferencia) {
        return 2 * Math.PI * circunferencia.getRadio();
    }
    
}
