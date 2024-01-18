/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiapooej14.Service;

import guiapooej14.Entidades.Movil;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class MovilService {

    private Movil movil = new Movil();
    private Scanner read = new Scanner(System.in);

    public void cargarCelular() {
        System.out.println("ingrese la marca del celular ");
        movil.setMarca(read.nextLine());
        System.out.println("ingrese precio del celular ");
        movil.setPrecio(read.nextDouble());
        read.nextLine();
        System.out.println("ingrese el modelo  del celular ");
        movil.setModelo(read.nextLine());
        System.out.println("ingrese la memoria ram del celular ");
        movil.setMemoriaRam(read.nextInt());
        read.nextLine();
        System.out.println("ingrese almacenamiento del celular ");
        movil.setAlmacenamiento(read.nextInt());
        read.nextLine();
    }

public void ingresarCodigo() {
    System.out.println("Ingrese el codigo del producto:");
    String product = read.nextLine();
    
     int[] codigo = new int[product.length()];
    for (int i = 0; i < product.length(); i++) {
        int number = Character.getNumericValue(product.charAt(i));
        codigo[i] = number;
    }
    movil.setCodigo(codigo);
    
    
}

// codigo[]
 
public void mostrar(){
        System.out.println(" marca : " +movil.getMarca());
        System.out.println(" Precio : $ " + movil.getPrecio());
        System.out.println(" Modelo : " + movil.getModelo());
        System.out.println(" Memoria Ram : " + movil.getMemoriaRam()+" GB");
        System.out.println(" Almacenamiento : " + movil.getAlmacenamiento()+ " GB");
        System.out.print(" El codigo   :");
        System.out.print(Arrays.toString(movil.getCodigo()));
        System.out.println("");
     

}
}
