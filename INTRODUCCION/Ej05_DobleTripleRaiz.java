
/**
 *
Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
 */
import java.util.Scanner;
public class Ej05_DobleTripleRaiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("ingrese el numero ");
        int num1 = read.nextInt();
        System.out.println(" el doble de"+ num1+ "es :" +num1*2+ "\n el triple de " +num1+ " es :"+num1*3+"\n la raiz cuadrada de "+num1+" es : "+Math.sqrt(num1));
    }
    
}
