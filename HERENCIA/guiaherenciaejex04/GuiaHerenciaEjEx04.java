/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaherenciaejex04;

import guiaherenciaejex04.Entidades.Estudiantes;
import guiaherenciaejex04.Entidades.Persona;
import guiaherenciaejex04.Entidades.PersonalServicio;
import guiaherenciaejex04.Entidades.Profesores;
import guiaherenciaejex04.Entidades.Service.SistemaGestionFacultad;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class GuiaHerenciaEjEx04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        Persona estudiante = new Estudiantes();
        Persona profesor = new Profesores();
        Persona conserje = new PersonalServicio();

        SistemaGestionFacultad sfg = new SistemaGestionFacultad();
        sfg.crearPersona();
        sfg.crearPersona();
        sfg.crearPersona();

        int option;
        int answer;

        do {
            System.out.println("Bienvenido ");
            System.out.println(" ------------------- menu----------------");
            System.out.println("1. Cambio del estado civil de una persona ");
            System.out.println("2. Reasignación de despacho a un empleado.");
            System.out.println("3. Matriculación de un estudiante en un nuevo curso.");
            System.out.println("4. Cambio de departamento de un profesor.");
            System.out.println("5. Traslado de sección de un empleado del personal de servicio.");
            System.out.println("6. Mostrar");
            System.out.println("7. salir");
            option = read.nextInt();
            read.nextLine();

            switch (option) {
                case 1:
                    sfg.cambioEstadoCivil();
                    break;
                case 2:
                    sfg.reasignarDespacho();
                    break;
                case 3:
                    sfg.matricularEnCurso();
                    break;
                case 4:
                    sfg.cambiarDepartamento();
                    break;
                case 5:
                    sfg.cambiarSeccion();
                    break;
                case 6:
                    sfg.mostrar();
                    break;
                case 7:
                    System.out.println("Adiós");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }

        } while (option != 7);
    }

}














































/*
     estudiante.crearPersona();
        profesor.crearPersona();
        conserje.crearPersona();
        
        int option;
        int answer;

        do {
            System.out.println("Bienvenido ");
            System.out.println(" ------------------- menu----------------");
            System.out.println("1. Cambio del estado civil de una persona ");
            System.out.println("2. Reasignación de despacho a un empleado.");
            System.out.println("3. Matriculación de un estudiante en un nuevo curso.");
            System.out.println("4. Cambio de departamento de un profesor.");
            System.out.println("5. Traslado de sección de un empleado del personal de servicio.");
            System.out.println("6. Mostrar");
            System.out.println("7. salir");
            option = read.nextInt();
            read.nextLine();

            switch (option) {
                case 1:
                    do {

                        System.out.println("ingrese  el  nuevo  estado civil ");
                        String estado = read.nextLine();
                        System.out.println(" de quien desea cambiar  el estado  civil \n1. Estudiante \n2. Profesor \n3. concerje ");
                        answer = read.nextInt();
                        read.nextLine();
                        switch (answer) {
                            case 1:
                                estudiante.cambioEstadoCivil(estado);
                                break;
                            case 2:
                                profesor.cambioEstadoCivil(estado);
                                break;
                            case 3:
                                conserje.cambioEstadoCivil(estado);
                                break;
                            default:
                                System.out.println(" opcion invalida intente de nuevo ");
                                break;
                        }
                    } while (answer != 1 && answer != 2 && answer != 3);

                    break;
                case 2:

                    do {

                        System.out.println(" de quien desea cambiar  de despacho  \n1. Profesor \n2. concerje ");
                        answer = read.nextInt();
                        read.nextLine();
                        switch (answer) {
                            case 1:
                                ((Profesores) profesor).reasignarDespacho(option);
                                break;
                            case 2:
                                ((PersonalServicio) conserje).reasignarDespacho(option);
                                break;
                            default:
                                System.out.println(" opcion invalida intente de nuevo ");
                                break;
                        }
                    } while (answer != 1 && answer != 2);
                    break;
                case 3:
                    System.out.println("  ingrese el nombre de el nuevo curso ");
                    String curso = read.nextLine();
                    ((Estudiantes) estudiante).matricularEnCurso("curso");
                    break;
                case 4:
                    System.out.println("ingrese el  departamento  nuevo  departamento  del profesor ");
                    String departamento = read.nextLine();
                    ((Profesores) profesor).cambiarDepartamento(departamento);
                    break;
                case 5:
                    System.out.println("ingrese el  numero  de seccion  nueva para el personal de servicio ");
                    int seccion = read.nextInt();
                    read.nextLine();
                    ((PersonalServicio) conserje).cambiarSeccion(seccion);
                    break;
                case 6:
                    System.out.println("");
                    System.out.println(estudiante.toString());
                    System.out.println(profesor.toString());
                    System.out.println(conserje.toString());
                    break;

                case 7:
                    System.out.println("Adiós");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }

        } while (option != 7);
    }
 */
 /*
• Cambio del estado civil de una persona.
• Reasignación de despacho a un empleado.
• Matriculación de un estudiante en un nuevo curso.
• Cambio de departamento de un profesor.
• Traslado de sección de un empleado del personal de servicio.
• Imprimir toda la información de cada tipo de individuo. Incluya un programa de prueba
que instancie objetos de los distintos tipos y pruebe los métodos desarrollados.
 */
