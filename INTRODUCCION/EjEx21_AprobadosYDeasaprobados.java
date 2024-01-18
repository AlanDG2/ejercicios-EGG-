/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 *//*
Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por
trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
52
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
igual al 7 de sus notas del curso.

*/
import java.util.Scanner;
public class EjEx21_AprobadosYDeasaprobados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       int cont1=0;
       int cont2=0;
        for (int i = 1; i < 11; i++) {
            System.out.println("digite la nota del trabajo  practico  del estudiante " +i);
            double nota1=read.nextDouble();
             System.out.println("digite la nota del segundo  trabajo  practico  del estudiante " +i);
            double nota2=read.nextDouble();
             System.out.println("digite la nota del integrdor  del estudiante " +i);
            double nota3=read.nextDouble();
             System.out.println("digite la nota del segundo integrador   practico  del estudiante " +i);
            double nota4=read.nextDouble();
            double prom=nota1*.1 + nota2*.15 + nota3*.25 + nota4*.5;
            System.out.flush();
            if (prom>=7) {
                cont1++;
            }else{cont2++;}
            
        }
        System.out.println("la cantidad de estudiantes aprobados es " +cont1+ " \n la cantidad  de estudiantes que reprobaron  es " +cont2);
    }
    
}
