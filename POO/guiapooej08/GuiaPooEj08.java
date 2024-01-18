/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guiapooej08;

import guiapooej08.CadenaService.CadenaService;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class GuiaPooEj08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        CadenaService cadena=new CadenaService();
        
        cadena.crearCadena();
        cadena.mostrarVocales();
        cadena.invertirFrase();
       System.out.println("ingrese una letra  para  buscar cuantas  veces se repite ");
        cadena.vecesRepetido(read.nextLine());
          System.out.println("ingrese una frase   para  comparar su longitud con la frase anterior  ");
        cadena.compararLongitud(read.nextLine());
          System.out.println("ingrese una frase   para unirla con la primera  ");
        cadena.unirFrases(read.nextLine());
          System.out.println("ingrese una letra  para remplazar las  'a'  ");
        cadena.reemplazar(read.nextLine());
          System.out.println("ingrese una letra  para  buscar si la frase la contiene  ");
        cadena.contiene(read.nextLine());
    }
    
}
