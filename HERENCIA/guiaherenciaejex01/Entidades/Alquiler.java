/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaherenciaejex01.Entidades;

import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import static java.time.temporal.TemporalQueries.localDate;
import java.util.Calendar;

/**
 *
 * el nombre, documento del cliente, la fecha de alquiler, fecha de devolución,
 * la posición del amarre y el barco que lo ocupará.
 *
 */
public class Alquiler {

    private String nombre;
    private Integer id;
    private Calendar fecha;
    private Calendar devolucion;
    private String posicion;
    private Barco barco;
      private Scanner read = new Scanner(System.in);

    public Alquiler() {
    }

    public Alquiler(String nombre, Integer id, Calendar fecha, Calendar devolucion, String posicion, Barco barco) {
        this.nombre = nombre;
        this.id = id;
        this.fecha = fecha;
        this.devolucion = devolucion;
        this.posicion = posicion;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha( Calendar fecha) {
        this.fecha = fecha;
    }

    public Calendar getDevolucion() {
        return devolucion;
    }

    public void setDevolucion(Calendar devolucion) {
        this.devolucion = devolucion;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    //el nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
//    amarre y el barco que lo ocupará.
    //
    public void crearAlquiler(Barco barco) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("ingrese su nombre ");
        setNombre(read.nextLine());

       System.out.println("ingrese su id");
        setId(read.nextInt());

        read.nextLine();
         System.out.print("Ingrese una fecha de alquiler  (formato dd/MM/yyyy): ");
         String fechaAStr = read.nextLine();
         System.out.println("ingrese fecha de devolucion ");
        String fechaBStr = read.nextLine();

        Calendar fechaA = Calendar.getInstance();
        Calendar fechaB = Calendar.getInstance();
        

        try {
            fechaA.setTime(sdf.parse(fechaAStr));
            fechaB.setTime(sdf.parse(fechaBStr));
            setFecha(fechaA);
            setDevolucion(fechaB);
            System.out.println("-----------------------------------------");
            System.out.println("DATOS ");
            System.out.println("Fecha de alquiler : " + sdf.format(fechaA.getTime()));
            System.out.println("Fecha de devolucion: " + sdf.format(fechaB.getTime()));

        } catch (ParseException e) {
            System.out.println("Formato de fecha inválido. Intente nuevamente.");
        }
        
        setPosicion("12");
        setBarco(barco);
        
        
    }
    
    public long dias(){
             
            // Calcular la diferencia en milisegundos entre las fechas
            long diferenciaMillis = getDevolucion().getTimeInMillis() - getFecha().getTimeInMillis();

            // Convertir la diferencia a días
            long diferenciaDias = diferenciaMillis / (24 * 60 * 60 * 1000);

            System.out.println("Días transcurridos: " + diferenciaDias);
            return diferenciaDias;
        
    }

    @Override
    public String toString() {
        return " \n Nombre: " + nombre + "\n Id :"+id+ "\n Posicion=" + posicion ;
                
    }
        

    }


