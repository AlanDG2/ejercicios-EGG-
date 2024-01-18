/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiapooej03.Entidades;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main

g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
*/
public class Operacion {
    private int numero1;
    private int numero2;

    public Operacion() {
    }

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public void crearOperacion(){
       Scanner read= new Scanner(System.in);
        System.out.print("Ingrese el primer numero  ");
        numero1= read.nextInt();
         System.out.print("Ingrese el segundo  numero  ");
        numero2= read.nextInt();
        
    }
    
   public int sumar() {
        return this.numero1 + this.numero2;
    }
    
    public int restar() {
        return this.numero1 - this.numero2;
    }
    
    public int multiplicar() {
        if (this.numero1 == 0 || this.numero2 == 0) {
            System.out.println("No se puede multiplicar por cero.");
            return 0;
        } else {
            return this.numero1 * this.numero2;
        }
    }
    
    public int dividir() {
        if (this.numero2 == 0) {
            System.out.println("No se puede dividir por cero.");
            return 0;
        } else {
            return this.numero1 / this.numero2;
        }
    }
    
    
    
}