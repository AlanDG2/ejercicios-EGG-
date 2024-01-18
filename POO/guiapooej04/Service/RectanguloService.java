
package guiapooej04.Service;

import java.util.Scanner;
import guiapooej04.Entidades.Rectangulo;

/**
 *
 * @author Usuario
 */
public class RectanguloService {
      private Rectangulo rectangulo = new Rectangulo();     
      private Scanner read = new Scanner(System.in);
  
      
    
      
    public void crearRectangulo() {
        System.out.print("Ingrese la base: ");
        rectangulo.setBase(read.nextInt());
        System.out.print("Ingrese la altura: ");
        rectangulo.setAltura(read.nextInt());
    }

    public int calcularSuperficie() {
        return rectangulo.getBase() * rectangulo.getAltura();
    }

    public int calcularPerimetro() {
        return  (rectangulo.getBase() + rectangulo.getAltura())*2;
    }

    public void dibujarRectangulo() {
        for (int i = 0; i < rectangulo.getAltura(); i++) {
            for (int j = 0; j <rectangulo.getBase(); j++) {
                if (i == 0 || i == rectangulo.getAltura() - 1 || j == 0 || j == rectangulo.getBase()- 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
