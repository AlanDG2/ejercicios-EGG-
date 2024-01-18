/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GuiaPooEj01.entidades;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class Libro {
    private String ISBN;
    private String titulo;
    private String autor;
    private int numPaginas;
    
    public Libro() {
        // Constructor vacío
    }
    
      public Libro(String ISBN, String titulo, String autor, int numPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }
   
    
    public void cargarLibro() {
        Scanner read= new Scanner(System.in);
        System.out.print("Ingrese el numero de ISBN: ");
        ISBN = read.nextLine();
        System.out.print("Ingrese el titulo del libro: ");
        titulo = read.nextLine();
        System.out.print("Ingrese el nombre del autor: ");
        autor = read.nextLine();
        System.out.print("Ingrese el numero de paginas: ");
        numPaginas = read.nextInt();
    }
    
    public void mostrarInfo() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Numero de paginas: " + numPaginas);
    }
     

}
