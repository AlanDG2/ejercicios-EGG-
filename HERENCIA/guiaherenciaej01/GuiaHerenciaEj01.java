/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaherenciaej01;

import guiaherenciaej01.Entities.Caballo;
import guiaherenciaej01.Entities.Gato;
import guiaherenciaej01.Entities.Perro;

/**
 *
 * @author Usuario
 */
public class GuiaHerenciaEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro perro = new Perro("Stich", "carnivoro", 15, "doberman");
        Perro perro2 = new Perro("Teddy", "croquetas", 10, "chihuahua");
        Gato gato = new Gato("Pelusa", "galletas", 15, "Siames");
        Caballo caballo = new Caballo("Spark", "pasto", 25, "fino");
        
        perro.alimentarse();  
        perro2.alimentarse();
        gato.alimentarse(); 
        caballo.alimentarse();
    }
    
}
