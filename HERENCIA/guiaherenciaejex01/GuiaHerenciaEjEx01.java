/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaherenciaejex01;

import guiaherenciaejex01.Entidades.Alquiler;
import guiaherenciaejex01.Entidades.Barco;
import guiaherenciaejex01.Entidades.BarcoMotor;
import guiaherenciaejex01.Entidades.Velero;
import guiaherenciaejex01.Entidades.Yate;   
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class GuiaHerenciaEjEx01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Alquiler alquiler = new Alquiler();
        System.out.println("Bienvenido  por favor seleccione el tipo de nave que posee \n1.Barco a motor \n2.Velero \n3.Yate");
        int tipo = read.nextInt();
        read.nextLine();
        Barco barco;

        switch (tipo) {
            case 1:
                barco = new BarcoMotor();
                barco.crearBarco("Barco a motor ");
                alquiler.crearAlquiler(barco);
                System.out.println("el costo del alquiler  es  " + (barco.calcularModulo() * alquiler.dias()));
                System.out.println(alquiler.toString());
                System.out.println(barco.toString());

                break;
            case 2:
                barco = new Velero();
                barco.crearBarco(" Velero ");
                alquiler.crearAlquiler(barco);
                System.out.println("el costo del alquiler  es  " + (barco.calcularModulo() * alquiler.dias()));
                System.out.println(alquiler.toString());
                System.out.println(barco.toString());
                break;
            case 3:
                barco = new Yate();
                barco.crearBarco(" Yate");
                alquiler.crearAlquiler(barco);
                System.out.println("el costo del alquiler  es  " + (barco.calcularModulo() * alquiler.dias()));
                System.out.println(alquiler.toString());
                System.out.println(barco.toString());
                break;
            default:
                System.out.println("dato incorrecto");
        }

    }

}
