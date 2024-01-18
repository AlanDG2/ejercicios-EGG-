/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiarelacionesej01;

import guiarelacionesej01.Entidades.Perro;
import guiarelacionesej01.Entidades.Persona;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
/**
 *
 * @author Usuario
 */
public class GuiaRelacionesEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
      int option;  
      int aux;
         
      Perro dog1 = new Perro("chronos", "pitbull", 1, "mediano");
      Perro dog2 = new Perro("zeus", "labrador", 2, "mediano");
      Persona per1 = new Persona("alan", "gonzalez", 26,1143398731, null);
      Persona per2 = new Persona("ever", "guzman", 35,1143386236, null);
     

      
          System.out.println(" tenemos disponibles ");
        System.out.println("1." + dog1.toString());
         System.out.println("2." + dog2.toString());
         do {
         System.out.println(per1.getNombre()+ " seleccina alguno "  );
         option=read.nextInt();
        } while (option!=1 && option!=2);
         if (option==1) {
              per1.setPerro(dog1);           
        }else{per1.setPerro(dog2); }
         aux=option;
         
         do {
         System.out.println(per2.getNombre()+ " seleccina alguno "  );
         option=read.nextInt();
             if ((option!=1 && option!=2) || aux==option) {
                 if(option!=1 && option!=2){System.out.println(" opcion invalida");}
                 else{  System.out.println(" lo siento  ya adoptaron ese perro") ;}
             }
        } while ((option!=1 && option!=2) || aux==option);
         if (option==1) {
              per2.setPerro(dog1);           
        }else{per2.setPerro(dog2); }
    
        System.out.println(per1);  
        System.out.println(per2);
    }
    
    
    
}
