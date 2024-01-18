/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 */
import java.util.Scanner;

public class EjEx17_Primo{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Escriba un número: ");
        int n1 = read.nextInt();
        System.out.println(primo(n1));
    }

    public static String primo(int a) {
        int cont = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                cont++;
            }
        }
        if (cont > 2) {
            return "No es primo";
        } else {
            return "Es primo";
        }
    }
}
