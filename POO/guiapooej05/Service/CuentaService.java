/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package guiapooej05.Service;

import guiapooej05.Entidades.CuentaBancaria;
import java.io.IOException;
import java.util.Scanner;

public class CuentaService {

    private CuentaBancaria cuenta = new CuentaBancaria();
    private Scanner read = new Scanner(System.in);

    public void cuenta() {
        System.out.println("ingrese su DNI ");
        cuenta.setDNI(read.nextLong());
        System.out.println("ingrese su numero  de cuenta ");
        cuenta.setNumeroCuenta(read.nextInt());
        System.out.println("ingrese su saldo actual  ");
        cuenta.setSaldoActual(read.nextInt());
        menu();
    }

    public void ingresar() {
        System.out.println(" cuanto  dinero  desea ingresar ");
        cuenta.setSaldoActual(cuenta.getSaldoActual() + read.nextDouble());
        consultarSaldo();
    }

    public void retirar() {
        if (cuenta.getSaldoActual() == 0) {
            System.out.println("su cuenta esta vacia ");
        } else {
            System.out.println(" cuanto  dinero  desea retirar  ");
            double retiro = read.nextDouble();
            if (retiro > cuenta.getSaldoActual()) {
                System.out.println(" fondos insuficientes ");

            } else {
                cuenta.setSaldoActual(cuenta.getSaldoActual() - retiro);
                consultarSaldo();
            }

        }

    }

    public void extraccionRapida() {
        if (cuenta.getSaldoActual() == 0) {
            System.out.println("su cuenta esta vacia ");
        } else {
            double fast =cuenta.getSaldoActual() * 0.2;
            cuenta.setSaldoActual(cuenta.getSaldoActual() - fast);
            System.out.println("retiro " + String.format("%,.0f", fast));
            consultarSaldo();
        }
    }

    public void consultarSaldo() {
        System.out.println("su saldo  actual es " + String.format("%,.0f", cuenta.getSaldoActual()));
    }

    public void menu() {
        int option;
        do {
            System.out.println(" Bienvenido  que opcion desea \n 1). ingresar saldo \n 2). retirar saldo \n 3). extraccion rapida \n 4).consultar saldo \n  5).salir ");
            option = read.nextInt();
            switch (option) {
                case 1:
                    ingresar();
                    break;
                case 2:
                    retirar();
                    break;
                case 3:
                    extraccionRapida();
                    break;
                case 4:
                    consultarSaldo();
                    break;
                case 5:
                    System.out.println("Hasta luego, esperamos verlo pronto");
                    break;
                default:
                    System.out.println("Opción invalida. Intente de nuevo.");
                    break;
            }

        } while (option != 5);

    }
 

}
