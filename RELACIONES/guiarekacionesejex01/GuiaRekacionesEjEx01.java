/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiarekacionesejex01;

import guiarekacionesejex01.Entidades.Perro;
import guiarekacionesejex01.Entidades.Persona;
import guiarekacionesejex01.Entidades.Service.ServiceAdoption;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class GuiaRekacionesEjEx01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner read = new Scanner(System.in);
      int option=5;  
      int aux;
      ServiceAdoption service = new ServiceAdoption();
       
      
        System.out.println("Bienvenido  soy tu asistente virtual de vererinaria Petcity  \n Ingrese la cantidad de cachoros que tenemos  disponibles para adopcion ");
        int dogs=read.nextInt();
        System.out.println("ingrese la cantidad de solicitudes de adopcion");
        int people = read.nextInt();
        System.out.println("");
        System.out.println("");
        
       service.createDogs(dogs);
       service.createPeople(people);
       service.dogsAvalible();
       service.lista();
      
   
    
    
    }
}

