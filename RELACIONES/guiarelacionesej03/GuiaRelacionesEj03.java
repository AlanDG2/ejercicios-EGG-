/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiarelacionesej03;

import guiarelacionesej03.Entidades.Baraja;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class GuiaRelacionesEj03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Baraja mazo = new Baraja();
        int option;
        do {

            System.out.println("Por favor seleccione una opcion \n1).Barajar \n2).Siguiente carta \n3).Cartas disponibles \n4).Dar cartas \n5).Cartas del monton \n6).Mostrar baraja \n7).Salir");
            option = read.nextInt();
            switch (option) {
                case 1:
                    mazo.barajar();
                    break;
                case 2:
                    System.out.println(mazo.siguienteCarta());
                    break;
                case 3:
                    System.out.println("Quedan " + mazo.cartasDisponibles() + " cartas disponibles");
                    break;
                case 4:
                    System.out.println("por favor ingrese la cantidad de carta que quiere");
                    int cantidad = read.nextInt();
                    mazo.darCartas(cantidad);
                    break;
                case 5:
                    mazo.cartasMonton();
                    break;
                case 6:
                    mazo.mostrarBaraja();
                    break;
                case 7:
                    System.out.println("ADIOS....");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
            System.out.println("");
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");
        } while (option != 7);

    }

}
