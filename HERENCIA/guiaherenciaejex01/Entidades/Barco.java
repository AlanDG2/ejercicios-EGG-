/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaherenciaejex01.Entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
 */
public class Barco {
    protected String matricula;
    protected Integer eslora;
    protected Integer añoFabricacion ;
    private Scanner read = new Scanner(System.in);

    public Barco() {
    }

    public Barco(String matricula, Integer eslora, Integer añoFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.añoFabricacion = añoFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getEslora() {
        return eslora;
    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    public Integer getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(Integer añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }
    
    
    public double calcularModulo() {
        return eslora * 10;
    }
    
    public void crearBarco(String name){
        System.out.println("ingrese la matricula del " +name );
        setMatricula(read.nextLine());
   
        System.out.println("ingrese la cantidad de metros de eslora del " +name );
        setEslora(read.nextInt());
        read.nextLine();
        System.out.println("Ingrese la  año de fabricacion  : ");
        setAñoFabricacion(read.nextInt());
        read.nextLine();
        setAñoFabricacion(2015);
        
          
    }

    @Override
    public String toString() {
        return "\n Matricula:" + matricula + "\n Eslora: " + eslora + "\n Anio de fabricacion " + añoFabricacion ;
    }
    
    
    
            
}
