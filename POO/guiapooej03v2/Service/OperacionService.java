/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiapooej03v2.Service;

/**
 *
 * @author Usuario
 */
import guiapooej03v2.Entidades.Operacion;
import java.util.Scanner;

public class OperacionService {
    private Operacion operacion;
    private Scanner scanner;

    public OperacionService() {
        scanner = new Scanner(System.in);
        operacion = new Operacion();
    }

    public void crearOperacion() {
        System.out.print("Ingrese el primer numero: ");
        operacion.setNumero1(scanner.nextDouble());

        System.out.print("Ingrese el segundo numero: ");
        operacion.setNumero2(scanner.nextDouble());
    }

    public double sumar() {
        return operacion.getNumero1() + operacion.getNumero2();
    }

    public double restar() {
        return operacion.getNumero1() - operacion.getNumero2();
    }

    public double multiplicar() {
        if (operacion.getNumero1() == 0 || operacion.getNumero2() == 0) {
            System.out.println("ERROR: no se puede multiplicar por cero");
            return 0;
        }
        return operacion.getNumero1() * operacion.getNumero2();
    }

    public double dividir() {
        if (operacion.getNumero2() == 0) {
            System.out.println("ERROR: no se puede dividir por cero");
            return 0;
        }
        return operacion.getNumero1() / operacion.getNumero2();
    }
}