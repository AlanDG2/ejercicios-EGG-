/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaherenciaejex02;

import guiaherenciaejex02.Entities.Edificio;
import guiaherenciaejex02.Entities.EdificioDeOficinas;
import guiaherenciaejex02.Entities.PoliDeportivo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class GuiaHerenciaEjEX02 {

    /**
    Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.
* 
* 
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ArrayList<Edificio> list= new ArrayList();
        PoliDeportivo pd1= new  PoliDeportivo();
        PoliDeportivo pd2= new  PoliDeportivo();
        EdificioDeOficinas eo1= new EdificioDeOficinas();
        EdificioDeOficinas eo2= new EdificioDeOficinas();        
        int cont=0;
        list.add(pd1);
        list.add(pd2);
        list.add(eo1);
        list.add(eo2); 
        
        for (Edificio edificio : list) {
            edificio.crearEdificio();
            edificio.calcularSuperficie();
            edificio.calcularVolumen();
           
        }
        
        eo1.cantPersonas();
        eo2.cantPersonas();
        cont+=pd1.tipo();
        cont+=pd1.tipo();
        if (cont>0) {
            System.out.println(cont + " poli deportivos abiertos ");
        } else{System.out.println("  ambos polideportivos  con techo");}
       
    }
    
}
