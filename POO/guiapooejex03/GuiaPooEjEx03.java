/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guiapooejex03;

import guiapooejex03.Entidades.Raices;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class GuiaPooEjEx03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el valor de a: ");
        double a = sc.nextDouble();
        
        System.out.print("Ingrese el valor de b: ");
        double b = sc.nextDouble();
        
        System.out.print("Ingrese el valor de c: ");
        double c = sc.nextDouble();
        
        Raices ecuacion = new Raices(a, b, c);
        ecuacion.calcular();
    }
    }
    

