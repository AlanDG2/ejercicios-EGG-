/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiarelacionesej02.Entidades;

import java.util.Random;

/**
 *
 * @author Usuario
 */
public class Revolver {
    private Integer posicionActual;
    private Integer posicionAgua;

    public Revolver() {
    }

    public Revolver(Integer posicionActual, Integer posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public Integer getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(Integer posicionActual) {
        this.posicionActual = posicionActual;
    }

    public Integer getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(Integer posicionAgua) {
        this.posicionAgua = posicionAgua;
    }
    
    public void llenarRevolver(){
         Random random = new Random();
        posicionActual= random.nextInt(6) + 1;
        posicionAgua= random.nextInt(6) + 1;

    }
     public boolean mojar(){
        boolean mojado = false;
        if(posicionActual==posicionAgua){
        mojado=true;}
        return mojado;
    }
     
      public void siguienteChorro(){
      posicionActual++;
      if(posicionActual>6){
          posicionActual=1;
      }
    }

    @Override
    public String toString() {
        return  "posicionActual=" + posicionActual + ", posicion de la bala =" + posicionAgua + '}';
    }
      
    
      
}
