/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guiapooej02;

import guiapooej02.Entidades.Circunferencia;
import guiapooej02.Services.CircunferenciaService;

/**
 *
 * @author Usuario
 *//*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
*/
public class GuiaPooEj02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         CircunferenciaService service = new CircunferenciaService();

        Circunferencia circ = service.crearCircunferencia();
        System.out.println("Radio de la circunferencia: " + circ.getRadio());

        System.out.println("Area de la circunferencia: " + service.calcularArea(circ));
        System.out.println("Perímetro de la circunferencia: " + service.calcularPerimetro(circ));
    }
    
}
