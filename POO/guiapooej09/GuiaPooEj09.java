/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guiapooej09;

import guiapooej09.Service.MatematicaService;

/**
 *
 * @author Usuario
 */
public class GuiaPooEj09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MatematicaService  number = new MatematicaService();
      number.crearNum();
      number.devolverMayor();
      
    }
    
}
