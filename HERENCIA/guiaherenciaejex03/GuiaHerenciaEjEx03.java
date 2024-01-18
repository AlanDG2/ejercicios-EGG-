/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaherenciaejex03;

import guiaherenciaejex03.Entities.Alojamiento;
import guiaherenciaejex03.Entities.Camping;
import guiaherenciaejex03.Entities.HotelCincoEstrellas;
import guiaherenciaejex03.Entities.HotelCuatroEstrellas;
import guiaherenciaejex03.Entities.Residencia;
import guiaherenciaejex03.Service.AlojamientoService;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class GuiaHerenciaEjEx03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        AlojamientoService service  = new AlojamientoService();
       ArrayList<Alojamiento>hoteles= service.crearLista();
        int option;
        
     
       
         do {
   System.out.println("Bienvenido ");
        System.out.println(" ---- menu-----");
        System.out.println("1. mostrar todos los  alojamientos ");
        System.out.println("2. todos los hoteles de más caro a más barato.");
        System.out.println("3. todos los campings con restaurante");
        System.out.println("4. todos las residencias que tienen descuento.");
        System.out.println("5. salir");
         option= read.nextInt();
        read.nextLine();

   
                switch (option) {
                    case 1:service.mostrar(hoteles);
                        break;
                    case 2:service.sortedList(hoteles);
                        break;
                    case 3:service.restaurantes(hoteles);
                        break;
                    case 4: service.descuento(hoteles);
                        break;
                    case 5:System.out.println("Adiós");
                        break;
                    default:
                        System.out.println("Opción inválida");
                        break;
                }
           
        } while (option != 5);
    }

}
