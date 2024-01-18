/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GuiaPooEj01;

import GuiaPooEj01.entidades.Libro;

/**
 *
 * @author Usuario
 */
/*}
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
*/
public class GuiaPooEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Libro libro1 = new Libro();
        libro1.cargarLibro();
        libro1.mostrarInfo();
        
        Libro libro2 = new Libro("1234567890", "El gran Gatsby", "F. Scott Fitzgerald", 180);
        libro2.mostrarInfo();
      
    }
    
}
