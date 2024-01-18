/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
*/
import java.util.Scanner;
public class Ej04_CentigradosAFarenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner read = new Scanner(System.in);
        System.out.println("ingrese la temperatura ");
        int celcius = read.nextInt();
        int farenheit=32+((9*celcius)/5);
        System.out.println(celcius+ "° centigrados  en farenheit son  " +farenheit+ "°" );
                
        
    }
    
}
