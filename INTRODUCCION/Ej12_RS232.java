/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
/*
12. Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que
ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia
distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas
e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
*/
import java.util.Scanner;
public class Ej12_RS232 {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        int cont1=0;
        int cont2=0;
        String palabra = "";
        
        do {
            System.out.println("Ingrese una palabra");
            palabra = read.nextLine();
        
            if (palabra.length()<=5 && palabra.substring(0,1).equalsIgnoreCase("x") && palabra.substring(palabra.length()-1).equalsIgnoreCase("o")) {
                cont1++;
            } else {
                cont2++;
            }
        } while (!palabra.equals("&&&&&"));
        if(!palabra.equals("&&&&&")){cont2--;}

        System.out.println("Número de palabras que cumplen con la condición: " + cont1);
        System.out.println("Número de palabras que no cumplen con la condición: " + cont2);
    }
}

