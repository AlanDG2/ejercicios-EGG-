/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiapooej02.Entidades;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class Circunferencia {
    private Scanner scanner = new Scanner(System.in);
     private double radio;

      
    public Circunferencia() {
       
    }
    
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
   
}
