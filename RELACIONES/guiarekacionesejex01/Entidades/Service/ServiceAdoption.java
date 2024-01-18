/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiarekacionesejex01.Entidades.Service;

import guiarekacionesejex01.Entidades.Perro;
import guiarekacionesejex01.Entidades.Persona;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Usuario
 */
public class ServiceAdoption {
    Scanner read = new Scanner(System.in);
    private ArrayList<Perro> dogList;
    private ArrayList<Persona> peopleList;
    private Set<Perro> avaliblelist = new HashSet<>();;
    private String[] dogsNames = {"Adan", "Agus", "Amigo", "Anko", "Arco", "Bicho", "Bruce", "Bruno", "Capo", "Cesar", "Coby", "Crack", "Coffee", "Curro", "Chimo", "Dalton", "Duque", "Gino", "Gringo", "Gus", "Hans", "Homer", "Karim", "Keico", "Mimo", "Ness", "Paco", "Pistacho", "Rayo", "Rufo", "Suco", "Tamo", "Toby", "Tormo", "Urco"};
    private String[] breeds = {"Labrador Retriever", "Bulldog Francés", "Golden Retriever", "Pastor Alemán", "Beagle", "Yorkshire Terrier", "Boxer", "Dóberman", "Chihuahua", "Poodle"};
    private String[] sizes = {"pequeño", "mediano", "grande"};
    private String[] names={"Hugo", "Lucas", "Mateo", "León", "Benjamín", "Sebastián", "Martín", "Daniel", "Samuel", "Emilio", "Valentino", "Joaquín", "Diego", "Tomás", "Agustín", "Nicolás", "Santiago", "Lautaro", "Juan", "Alejandro", "Isabella", "Mía", "Emma", "Sofía", "Valentina", "Lucía", "Camila", "Martina", "Lola", "Julia"};
    private String[] lastNames={"Pérez", "González", "Rodríguez", "López", "García", "Martínez", "Fernández", "Gómez", "Hernández", "Jiménez", "Torres", "Díaz", "Rivera", "Ruiz", "Silva", "Vargas", "Romero", "Mendoza", "Ortega", "Núñez", "Sánchez", "Castillo", "Ramos", "Reyes", "Alvarez", "Soto", "Cruz", "Navarro", "Morales", "Molina"};    
    private    Random random = new Random();
    

    

    public  List<Perro> createDogs(int cantidad) {
      dogList = new ArrayList();
        for (int i = 0; i < cantidad; i++) {
            String nombre = dogsNames[random.nextInt(dogsNames.length)];
            String raza = breeds[random.nextInt(breeds.length)];
            Integer edad = random.nextInt(5) + 1; // Genera una edad aleatoria entre 1 y 10
            String tamaño = obtenerTamaño(raza);

            Perro perro = new Perro(nombre, raza, edad, tamaño);
            dogList.add(perro);
        }

        return dogList;
    }

    
      public  List<Persona> createPeople(int cantidad) {
      peopleList = new ArrayList();
        for (int i = 0; i < cantidad; i++) {
            String nombre = names[random.nextInt(names.length)];
            String apellido = lastNames[random.nextInt(lastNames.length)];
            Integer edad = random.nextInt(50) + 18; 
            Integer id = random.nextInt(999999999) + 100000000; // 
            Persona person = new Persona(nombre,apellido,edad,id,null);
            peopleList.add(person);
        }

        return peopleList;
    }
    
    public void dogsAvalible(){
        for (int j = 0; j < peopleList.size(); j++) {
            System.out.println("ingresando cliente solicitud numero " + (j+1));
            System.out.println("bienvenid@ "+peopleList.get(j).getNombre() );
            if (dogList.size()>0) {
            System.out.println("Estos son los perros que tenemos disponibles ");
            for (int i = 0; i < dogList.size(); i++) {
                System.out.println( (i+1)+". "+ dogList.get(i));
            }
            System.out.println("");
            int option;
            do {
                System.out.println("seleccione el numero del perro ");
            option = read.nextInt();
                if (option<1 || option>dogList.size()) {
                    System.out.println(" numero no encontrado \n No exite o ya se dio en adopocion \n  seleccione un numero correcto");
                }
            } while (option<1 || option>dogList.size());
            
            System.out.println("felicidades " +peopleList.get(j).getNombre() +" has escogido a "+ dogList.get(option-1));
            peopleList.get(j).setPerro(dogList.get(option-1));
            dogList.remove(option-1);             
        }else{System.out.println("Lo siento ya no tenemos mas perros en adopcion ");}  
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("");
            System.out.println("------------------------------------------------------------------------------------------------");
        }
      
    }
    
    public void lista(){
        System.out.println("");
        System.out.println("Servicio terminado estos son los datos de las adopciones de hoy ");
        for (Persona person : peopleList) {
            
            System.out.println(person);
        }
    }
    
        public String obtenerTamaño(String raza) {
        if (raza.equals("Chihuahua") || raza.equals("Yorkshire Terrier")) {
            return sizes[0]; // Pequeño
        } else if (raza.equals("Labrador Retriever") || raza.equals("Golden Retriever") || raza.equals("Beagle") || raza.equals("Boxer")) {
            return sizes[1]; // Mediano
        } else {
            return sizes[2]; // Grande
        }
    }
}
