/*
 */
package guiapooej14;

import guiapooej14.Service.MovilService;

/**
 *
 * @author Usuario
 */
public class GuiaPooEj14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MovilService movil = new MovilService();
       
        movil.cargarCelular();
        movil.ingresarCodigo() ;
        movil. mostrar();
       
    }
    
}
