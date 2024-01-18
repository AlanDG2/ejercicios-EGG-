/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase
String.
*/
import java.util.Scanner;
public class EjEx03_Vocal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
         System.out.println("ingrese su letra ");
        String letra= read.nextLine();
        letra=letra.toUpperCase();
        switch(letra) {
            case "A" -> System.out.println("es una A ");
            case "E" -> System.out.println("es una E ");
            case "I"-> System.out.println("es una I");
            case "O" -> System.out.println("es una O");
            case "U" -> System.out.println("es una U");
                 
            default -> System.out.println(" no es una vocal");
        }
    }
    
}
