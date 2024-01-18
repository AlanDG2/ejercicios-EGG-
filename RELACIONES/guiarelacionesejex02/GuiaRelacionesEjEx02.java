/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiarelacionesejex02;

import guiarelacionesejex02.Entities.Sala;
import guiarelacionesejex02.ServiceCinema.ServiceCinema;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class GuiaRelacionesEjEx02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ServiceCinema cinema = new ServiceCinema();
        System.out.println(" ingrese cantidad de espectadores ");

        Integer espectadores = read.nextInt();
        cinema.createPeople(espectadores);
        cinema.cinema();
        cinema.cine();
        cinema.ubicacion();
        cinema.mostrarSala();

    }

}
