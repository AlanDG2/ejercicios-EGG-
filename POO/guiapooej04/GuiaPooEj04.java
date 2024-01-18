package guiapooej04;

import guiapooej04.Entidades.Rectangulo;
import guiapooej04.Service.RectanguloService;

public class GuiaPooEj04 {

    public static void main(String[] args) {
        RectanguloService service = new RectanguloService();
        service.crearRectangulo();
  
        System.out.println("La superficie del rectangulo es : " + service.calcularSuperficie());
        System.out.println("El perimetro del rectangulo es : " + service.calcularPerimetro());
        service.dibujarRectangulo();
    }
}
