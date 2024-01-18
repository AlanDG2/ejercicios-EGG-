/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 *//*
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
*/
import java.util.Scanner;
public class Ej14_Divisas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("que divisa desea convertir libra, dolar o yen? ");
        String divisa =read.nextLine();
        System.out.println("ingrese la cantidad de euros a   convertir  ");
        double money = read.nextDouble();
        convert(money,divisa);
     
        
    }
    
    public static void convert (double money,String divisa){
       double exchange = 0;
        String simbolo = "";
        divisa=divisa.toLowerCase();
        switch (divisa) {
            case "dólares":
                exchange = 1.18;
                simbolo = "$";
                break;
            case "yenes":
                exchange = 130.21;
                simbolo = "¥";
                break;
            case "libras":
                exchange = 0.86;
                simbolo = "£";
                break;
            default:
                System.out.println("divisa incorrecta ");
                return;
        }

        double convercion = money* exchange;
        System.out.println(money + " euros son " + convercion  + " " + simbolo);
    }
}
