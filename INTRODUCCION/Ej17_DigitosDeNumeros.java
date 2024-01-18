/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
*/
import java.util.Scanner;
public class Ej17_DigitosDeNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    Scanner leer = new Scanner(System.in); 

    System.out.println("Ingrese tamaño del vector");
    int n = leer.nextInt();
    
    int[] vector = new int[n];
    int contador = 0;
    for (int i = 0; i < n; i++) {
    vector[i] = (int)(Math.random()*10000+1); 
        }
        for (int j = 1; j < 6; j++) {
           for (int i = 0; i < vector.length; i++) {
            if (String.valueOf(vector[i]).length() ==j ) {
                contador++;
            }        
        }if (contador>0){
           System.out.println(" el vector  tiene " +contador+ " numeros de  " +j+ " digitos" );}
        }
    }
    }
   


