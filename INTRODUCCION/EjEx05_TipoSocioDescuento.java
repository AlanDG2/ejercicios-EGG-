
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class EjEx05_TipoSocioDescuento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner read=new Scanner(System.in);
         System.out.println("ingrese su letra ");
        String letra= read.nextLine();
        letra=letra.toUpperCase();
        double discount=0;
        switch(letra) {
            case "A" -> discount=.5;
            case "B" -> discount=.35;
            case "C"-> discount=0;
            default -> System.out.println(" tipo socio incorrecto ");
        }
        if  (letra.equals("A") || letra.equals("B") || letra.equals("C"))  {
             System.out.println("cuanto  es el precio  del tratamiento");
             double price= read.nextDouble();
             System.out.println("el precio  a pagar para los socios tipo " +letra+" es de $" +(int)(price-(price*discount)));
        }
    }
    }
    

