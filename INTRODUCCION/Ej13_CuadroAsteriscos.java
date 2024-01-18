/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 *//*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
*/
import java.util.Scanner;
public class Ej13_CuadroAsteriscos {

    public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
        System.out.println("ingrese tamaño del cuadro  ");
        int num = read.nextInt();
       
        for (int i = 0; i < num; i++) {
            
            for (int j = 0; j<num; j++) {
                if (i==0 || i==num-1 || j==0 || j==num-1) {
                    System.out.print(" *");          
                }else {System.out.print("  ");
                }  
            }System.out.println("");
        }
    }
}