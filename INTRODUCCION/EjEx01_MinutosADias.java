
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 *//*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
*/
public class EjEx01_MinutosADias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
         Scanner read= new Scanner(System.in); 
         System.out.println("ingrese la cantidad de minutos");
         int minutes =read.nextInt();
         int days=(int)(minutes/1440);
         int hours=(int)((minutes%1440)/60);
         int restminutes=minutes-(days*1440)-(hours*60);
         System.out.println(minutes+ " minutos  son : " +days+ " dias " +hours+ " horas y " +restminutes+ " minutos ");
    }
    
}
