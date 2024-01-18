/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaherenciaejex03.Service;

import guiaherenciaejex03.Entities.Alojamiento;
import guiaherenciaejex03.Entities.Camping;
import guiaherenciaejex03.Entities.Hotel;
import guiaherenciaejex03.Entities.ExtraHotel;
import java.util.stream.Collectors;
import guiaherenciaejex03.Entities.HotelCincoEstrellas;
import guiaherenciaejex03.Entities.HotelCuatroEstrellas;
import guiaherenciaejex03.Entities.Residencia;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class AlojamientoService {

    public ArrayList crearLista() {

        Alojamiento h4e;
        Alojamiento h5e;
        Alojamiento camp;
        Alojamiento res;

        ArrayList<Alojamiento> list = new ArrayList();

        for (int i = 0; i < 3; i++) {
            h4e = new HotelCuatroEstrellas();
            h4e.crearAlojamiento();
            list.add(h4e);
            
            h5e = new HotelCincoEstrellas();
            h5e.crearAlojamiento();
            list.add(h5e);
            
            camp = new Camping();
            camp.crearAlojamiento();
            list.add(camp);
            
            res = new Residencia();
            res.crearAlojamiento();
            list.add(res);
           
        }
        return list;
    }
    
    public void mostrar(ArrayList<Alojamiento> list){
        for (Alojamiento alojamiento : list) {
            System.out.println(alojamiento);
        }
    }

    public void sortedList(ArrayList<Alojamiento> list) {
        /* ArrayList<Alojamiento> hoteles = list.stream().filter(a -> a instanceof Hotel).collect(Collectors.toCollection(ArrayList::new));
     
       Collections.sort(hoteles, (Alojamiento a1, Alojamiento a2) -> Double.compare(a1.precioHabitacion(), a2.precioHabitacion()));
   
         */
        ArrayList<Alojamiento> hoteles = list;

        for (int i = 0; i < hoteles.size(); i++) {
            if (hoteles.get(i) instanceof ExtraHotel) {
                hoteles.remove(i);
            }
        }
        Collections.sort(hoteles, (Alojamiento a1, Alojamiento a2) -> Double.compare(a1.precioHabitacion(), a2.precioHabitacion()));

        hoteles.forEach((hotel) -> {
            System.out.println(hotel);
        });

    }

    public void restaurantes(ArrayList<Alojamiento> list) {
        //  ArrayList<Alojamiento> hoteles = list.stream().filter(a -> a instanceof Camping && ((Camping) a).isRestaurante()).collect(Collectors.toCollection(ArrayList::new));
   
        ArrayList<Alojamiento> hoteles= new ArrayList<>();
        for (Alojamiento alojamiento : list) {
            if (alojamiento instanceof Camping) {
                 if (((Camping) alojamiento).isRestaurante()) {
                    hoteles.add(alojamiento);
                }
                }
            }
        
        for (Alojamiento hotel : hoteles) {
            System.out.println(hotel);
        }
        }
    
        
      public void descuento(ArrayList<Alojamiento> list) {
        // ArrayList<Alojamiento> hotel = list.stream().filter(a -> a instanceof Residencia && ((Residencia) a).isDescuentoGremios()).collect(Collectors.toCollection(ArrayList::new));
   
        ArrayList<Alojamiento> hoteles= new ArrayList<>();
        for (Alojamiento alojamiento : list) {
            if (alojamiento instanceof Residencia) {
                 if (((Residencia) alojamiento).isDescuentoGremios()) {
                    hoteles.add(alojamiento);
                }
                }
            }
        
        for (Alojamiento hotel : hoteles) {
            System.out.println(hotel);
        }
        }
    
        
   
    
    }
