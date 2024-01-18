/*
Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
métodos:
 Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
 Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
 Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
 Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
package guiapooej12.Service;

import guiapooej12.Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaService {

    private Persona persona = new Persona();
    private Scanner read = new Scanner(System.in);

    public void crearPersona() {
        System.out.print("Introduzca su nombre: ");
        String nombre = read.nextLine();
        System.out.print("Introduce el dia: ");
        int dia = read.nextInt();
        System.out.print("Introduce el mes (1-12): ");
        int mes = read.nextInt() - 1;
        System.out.print("Introduce el anio: ");
        int anio = read.nextInt() - 1900;
        Date nacimiento = new Date(anio, mes, dia);
        persona.setNombre(nombre);
        persona.setFecha(nacimiento);
    }

    public int calcularEdad() {
        Date fechaActual = new Date();
        int edadActual = fechaActual.getYear() - persona.getFecha().getYear();
        if ((fechaActual.getMonth() >= persona.getFecha().getMonth()) && (fechaActual.getDay() < persona.getFecha().getDay())) {
            edadActual--;
        }
        return edadActual;
    }

    public void mostrarPersona() {
        System.out.println(" Nombre: " + persona.getNombre() + "\n Fecha de nacimiento: " + persona.getFecha());
    }

    public boolean menorQue(int edad) {
        if (calcularEdad() > edad) {
            System.out.println("es menor");
            return true;
        } else {
            System.out.println("es mayor ");
            return false;
        }
    }
}
