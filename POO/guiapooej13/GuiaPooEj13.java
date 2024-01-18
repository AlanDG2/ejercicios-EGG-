
package guiapooej13;

import guiapooej13.Entidades.Curso;
import guiapooej13.Service.CursoService;




/**
 *
 * @author Usuario
 */
public class GuiaPooEj13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      CursoService  service = new CursoService();
      Curso curso = new Curso();
       service.crearCurso();
        System.out.println("las ganacias del  curso " + curso.getNombreCurso()+ " es " + service.calcularGananciaSemanal());
    }
    
}
