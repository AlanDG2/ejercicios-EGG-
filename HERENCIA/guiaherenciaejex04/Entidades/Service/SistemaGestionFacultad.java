/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaherenciaejex04.Entidades.Service;

import guiaherenciaejex04.Entidades.Empleados;
import guiaherenciaejex04.Entidades.Estudiantes;
import guiaherenciaejex04.Entidades.Persona;
import guiaherenciaejex04.Entidades.PersonalServicio;
import guiaherenciaejex04.Entidades.Profesores;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class SistemaGestionFacultad {

    String[] nombresEdificios = {"Torre Esmeralda", "Edificio Aurora", "Residencial Victoria", "Centro Empresarial Ébano", "Torres del Sol", "Edificio Celeste", "Condominio Alameda", "Complejo Dorado", "Residencial Primavera", "Edificio Mirador", "Torre del Lago", "Conjunto Altamira", "Edificio Aurora", "Residencial Los Pinos", "Centro Comercial Plaza Real", "Edificio Marino", "Condominio Bella Vista", "Complejo Las Rosas", "Residencial San Martín", "Edificio Horizonte", "Torres del Parque", "Condominio Las Brisas", "Edificio Estrella", "Residencial Jardines del Valle", "Centro Empresarial Oasis", "Edificio Azul", "Conjunto Santa Fe", "Residencial Los Alamos", "Torres del Bosque", "Edificio Delicias", "Conjunto Vista Hermosa"};
    String[] names = {"Hugo", "Lucas", "Mateo", "León", "Benjamín", "Sebastián", "Martín", "Daniel", "Samuel", "Emilio", "Valentino", "Joaquín", "Diego", "Tomás", "Agustín", "Nicolás", "Santiago", "Lautaro", "Juan", "Alejandro", "Isabella", "Mía", "Emma", "Sofía", "Valentina", "Lucía", "Camila", "Martina", "Lola", "Julia"};
    String[] lastNames = {"Pérez", "González", "Rodríguez", "López", "García", "Martínez", "Fernández", "Gómez", "Hernández", "Jiménez", "Torres", "Díaz", "Rivera", "Ruiz", "Silva", "Vargas", "Romero", "Mendoza", "Ortega", "Núñez", "Sánchez", "Castillo", "Ramos", "Reyes", "Alvarez", "Soto", "Cruz", "Navarro", "Morales", "Molina"};
    String[] nombresRestaurantes = {"La Trattoria", "El Asador Argentino", "Sabor Mexicano", "La Brasserie", "Ristorante Italiano", "Burger Heaven", "Sushi Express", "El Rinconcito Peruano", "Thai Spice", "Pizzeria Bella Napoli", "Fusion Grill", "Café Paris", "Mariscos del Puerto", "La Pampa Grill", "Taste of India", "El Rincón Español", "Noodle House", "Steakhouse Texas", "Soul Kitchen", "El Jardín Oriental", "Casa de Tapas", "Bistro Français", "Taco Loco", "Gourmet Deli", "Sabor Brasileño", "Parrilla Argentina", "Mediterranean Flavors", "Asian Fusion", "Delizia Gelato", "Tandoori Spice"};
    Scanner read = new Scanner(System.in);
    Random random = new Random();
    String[] estadosCiviles = {"Soltero", "Casado", "Unión Libre"};
    String[] nombresClases = {"Matemáticas", "Historia", "Biología", "Literatura", "Física", "Inglés", "Economía", "Química", "Arte", "Educación Física"};
    String[] carrerasUniversitarias = {"Ingeniería Civil", "Medicina", "Psicología", "Administración de Empresas", "Derecho", "Arquitectura", "Educación", "Ciencias de la Computación", "Economía", "Diseño Gráfico"};

    Persona estudiante = new Estudiantes();
    Persona profesor = new Profesores();
    Persona conserje = new PersonalServicio();

    
    public void crearPersona(){
        setearPersona(estudiante );
        setearPersona(profesor );
        setearPersona(conserje);
    
             
    }
    
    public void setearPersona(Persona persona) {
        persona.setNombre(names[random.nextInt(names.length)]);
        persona.setApellidos(lastNames[random.nextInt(lastNames.length)]);
        persona.setNumeroIdentificacion(random.nextInt(99999) + 100000);
        persona.setEstadoCivil(estadosCiviles[random.nextInt(estadosCiviles.length)]);
        
        if (persona instanceof Estudiantes) {
                   ((Estudiantes) persona).setCurso(carrerasUniversitarias[random.nextInt(carrerasUniversitarias.length)]);  }
        if (persona instanceof Empleados) {
                   ((Empleados) persona).setAnoIncorporacion(random.nextInt(23)+2000);
                   ((Empleados) persona).setNumeroDespacho(random.nextInt(10)+1);
         }
        if (persona instanceof Profesores) {
                   ((Profesores) persona).setDepartamento(nombresClases[random.nextInt(nombresClases.length)]); } 
           if (persona instanceof PersonalServicio) {
                   ((PersonalServicio) persona).setSeccion(random.nextInt(10)+1);  } 
             
 }
       
   
    public void cambioEstadoCivil() {

        int option;
        int answer;
        do {

            System.out.println("ingrese  el  nuevo  estado civil ");
            String estado = read.nextLine();
            System.out.println(" de quien desea cambiar  el estado  civil \n1. Estudiante \n2. Profesor \n3. concerje ");
            answer = read.nextInt();
            read.nextLine();
            switch (answer) {
                case 1:
                    estudiante.setEstadoCivil(estado);
                    break;
                case 2:
                    profesor.setEstadoCivil(estado);
                    break;
                case 3:
                    conserje.setEstadoCivil(estado);
                    break;
                 default:
                    System.out.println(" opcion invalida intente de nuevo ");
                    break;
            }
        } while (answer != 1 && answer != 2 && answer != 3);

    }
        
        
    public void reasignarDespacho(){
        int answer;
         do {

                        System.out.println(" de quien desea cambiar  de despacho  \n1. Profesor \n2. concerje ");
                        answer = read.nextInt();
                        read.nextLine();
                        switch (answer) {
                            case 1:
                                ((Profesores) profesor).setNumeroDespacho(answer);
                                break;
                            case 2:
                                ((PersonalServicio) conserje).setNumeroDespacho(answer);
                                break;
                            default:
                                System.out.println(" opcion invalida intente de nuevo ");
                                break;
                        }
                    } while (answer != 1 && answer != 2);
    }
      
    
    
    public  void matricularEnCurso(){
          System.out.println("  ingrese el nombre de el nuevo curso ");
                    String curso = read.nextLine();
                    ((Estudiantes) estudiante).setCurso(curso);
    }
   
    public void cambiarDepartamento(){
         System.out.println("ingrese el  departamento  nuevo  departamento  del profesor ");
                    String departamento = read.nextLine();
                    ((Profesores) profesor).setDepartamento(departamento);
    }
    
    
    public void cambiarSeccion(){
        System.out.println("ingrese el  numero  de seccion  nueva para el personal de servicio ");
                    int seccion = read.nextInt();
                    read.nextLine();
                    ((PersonalServicio) conserje).setSeccion(seccion);
    }
    
    
     public void mostrar(){
       
                    System.out.println("");
                    System.out.println(estudiante.toString());
                    System.out.println(profesor.toString());
                    System.out.println(conserje.toString());
    }
    
    
    }

