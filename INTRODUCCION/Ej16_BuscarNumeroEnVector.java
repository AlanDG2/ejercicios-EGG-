
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
*/
public class Ej16_BuscarNumeroEnVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner read = new Scanner(System.in);
        System.out.println("ingrese el tamaño del vector  ");
        int num=read.nextInt();
        int[] array = new int[num];

        for (int i = 0; i < array.length; i++) {
            int random = (int) (Math.random() * 10);
            array[i]=random;
                    
        }
        System.out.println("ingrese  un numero  del 1  al 9 para buscarlo en el vector  ");
        int buscar=read.nextInt();
        int aux=0;
        
        for (int i = 0; i <array.length; i++) {
            if(array[i]==buscar){
              aux++  ;
            }
        }
        if(aux==0){
            System.out.println("el numero no se encuentra  en el vector "); 
        } else if(aux==1){
            System.out.print("el numero  esta  en el vector "); 
        }else{System.out.print("el numero  esta  en el vector y   esta repetido "); }
    }
    
}
