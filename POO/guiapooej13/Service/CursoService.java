/*
    Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un
    programa para organizar la información de cada curso. Para ello, crearemos una clase
    entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia,
    cantidadDiasPorSemana, turno (mañana o tarde), precioPorHora y alumnos. Donde
    alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
    nombres de cada alumno. A continuación, se implementarán los siguientes métodos:
     Un constructor por defecto.
     Un constructor con todos los atributos como parámetro.
     Métodos getters y setters de cada atributo.
     método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
    que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
    en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
    nombre de cada alumno.
     Método crearCurso(): el método crear curso, le pide los valores de los atributos al
    usuario y después se le asignan a sus respectivos atributos para llenar el objeto
    Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
    al atributo alumnos
     Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
    en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
    día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
    se repite el encuentro.
 */
package guiapooej13.Service;

import guiapooej13.Entidades.Curso;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CursoService {

    private Curso curso = new Curso();
    private Scanner read = new Scanner(System.in);

    public void crearCurso() {
          System.out.print("Ingrese el nombre del curso: ");
    curso.setNombreCurso(read.nextLine());

    System.out.print("Ingrese la cantidad de horas por dia: ");
    curso.setCantidadHorasPorDia(read.nextInt());
    read.nextLine();

    System.out.print("Ingrese la cantidad de dias por semana: ");
    curso.setCantidadDiasPorSemana(read.nextInt());
    read.nextLine();

    System.out.print("Ingrese el turno (1: maniana, 2: tarde): ");
    curso.setTurno(read.nextInt());
    read.nextLine();

    System.out.print("Ingrese el precio por hora: ");
    curso.setPrecioPorHora(read.nextDouble());
    read.nextLine();

     curso.cargarAlumnos();
    }

    public double calcularGananciaSemanal() {
        return curso.getCantidadHorasPorDia() * curso.getPrecioPorHora() * curso.getCantidadDiasPorSemana() * curso.getAlumnos().length;
    }

}
