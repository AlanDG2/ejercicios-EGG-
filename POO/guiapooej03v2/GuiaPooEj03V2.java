/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guiapooej03v2;

import guiapooej03v2.Service.OperacionService;

/**
 *
 * @author Usuario
 */
public class GuiaPooEj03V2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         OperacionService operacionService = new OperacionService();
        operacionService.crearOperacion();
        System.out.println("La suma de los numeros es: " + operacionService.sumar());
        System.out.println("La resta de los numeros es: " + operacionService.restar());
        System.out.println("La multiplicacion de los numeros es: " + operacionService.multiplicar());
        System.out.println("La division de los numeros es: " + operacionService.dividir());
    }
    
}
