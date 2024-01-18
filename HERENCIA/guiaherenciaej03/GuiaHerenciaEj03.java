/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaherenciaej03;

import guiaherenciaej03.Entities.Electrodomesticos;
import guiaherenciaej03.Entities.Lavadora;
import guiaherenciaej03.Entities.Televisor;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class GuiaHerenciaEj03 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
    Lavadora lavadora = new Lavadora();
    Lavadora lavadora2 = new Lavadora();
    Televisor televisor = new Televisor();
    Televisor televisor2 = new Televisor();
    ArrayList<Electrodomesticos> list = new ArrayList();

    lavadora.crearLavadora(); 
    lavadora2.crearLavadora(); 
    televisor.crearTv();
    televisor2.crearTv();
    
    list.add(televisor);
    list.add(televisor2);
    list.add(lavadora);
    list.add(lavadora2);
 
    double l=0;
    double tv=0;

        for (Electrodomesticos electro : list) {
            if (electro instanceof Lavadora ) {
                l+=electro.precioFinal();
            }else{tv+=electro.precioFinal();}
           
        }

        System.out.println("la suma de las lavadoras es " + l);
        System.out.println("la suma de las tv es " + tv);
    System.out.println("Precio final de los electrodomesticos es  $" + (l+tv));
    ;
        
    }
    
}
