/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guiapooejex05;

import guiapooejex05.Entidades.MesesDelAnio;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class GuiaPooEjEx05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        MesesDelAnio mesesDelAnio = new MesesDelAnio();
        boolean acierto = false;
        String mesSecreto=mesesDelAnio.escogerMes();
        while (!acierto) {
            System.out.print("Adivine el mes secreto. Introduzca el nombre del mes en minusculas: ");
            String mes = sc.nextLine();
            acierto = mesesDelAnio.adivinarMes(mes,mesSecreto);
        }
        sc.nextLine();
    }
    
    
}
