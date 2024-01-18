/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaherenciaej02;

import guiaherenciaej02.Entities.Lavadora;
import guiaherenciaej02.Entities.Televisor;

/**
 *
 * @author Usuario
 */
public class GuiaHerenciaEj02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Lavadora lavadora = new Lavadora();
    Televisor televisor = new Televisor();

    lavadora.crearLavadora(); // Llama al método crearLavadora() para ingresar los atributos de la lavadora
    televisor.crearTv(); // Llama al método crearTelevisor() para ingresar los atributos del televisor

    double precioFinalLavadora = lavadora.precioFinal();
    double precioFinalTelevisor = televisor.precioFinal();

    System.out.println("Precio final de la lavadora: $" + precioFinalLavadora);
    System.out.println("Precio final del televisor: $" + precioFinalTelevisor);
        
    }
    
}
