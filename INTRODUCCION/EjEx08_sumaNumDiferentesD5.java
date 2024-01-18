/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares
y la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
*/
import java.util.Scanner;
public class EjEx08_sumaNumDiferentesD5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner read= new Scanner(System.in);
       boolean multiplo =false;
       int pair=0;
       int odd=0;
       int count=0;
        do {
            System.out.println("ingrese un numero");
            int num= read.nextInt();
           
            if (num>0){
             count++;
              if(num%2==0){
                pair++;
            }else{odd++;}
              if(num%5==0 ){
                multiplo=true;   
                break;
            }
            }
            
        } while (!multiplo);
        
        System.out.println("la cantidad de numeros leidos  son " +count+ "\n la cantidad de numero pares es " +pair+ " \n la cantidad de numero impares es " +odd);
    }
    
}
