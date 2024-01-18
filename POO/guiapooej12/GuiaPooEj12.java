
package guiapooej12;

import guiapooej12.Service.PersonaService;
import java.util.Scanner;

public class GuiaPooEj12 {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
       PersonaService  persona = new PersonaService();
       persona.crearPersona();
        System.out.println("la edad es "+ persona.calcularEdad());
        System.out.println("ingrese otra edad ");
       persona.menorQue(read.nextInt());
       persona.mostrarPersona();
    }
    
}
