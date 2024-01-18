/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guiacollectionej05.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Usuario
 */
public class CountryService {

    private Set<String> countries = new HashSet<>();
    private Scanner read = new Scanner(System.in);

    public void agregarPaises() {
        String respuesta;
        do {
            System.out.print("Ingrese un país: ");
            String pais = read.nextLine();

            if (countries.contains(pais)) {
                System.out.println("El país ya ha sido ingresado anteriormente.");
            } else {
                countries.add(pais);
                System.out.println("País agregado correctamente.");
            }

            System.out.print("¿Desea ingresar otro país? (S/N): ");
            respuesta = read.nextLine();
        } while (respuesta.equalsIgnoreCase("S"));
    }

    public void mostrarPaises() {
        System.out.println("Lista de países ingresados:");
        for (String pais : countries) {
            System.out.println(pais);
        }
    }
    public void ordenar (){
      /*     Set<String> sortedCountries = new TreeSet<>(countries);
        System.out.println("Lista de países ordenados alfabéticamente:");
        for (String pais : sortedCountries) {
            System.out.println(pais);
        }*/
     List<String> sortedCountries= new ArrayList<>(countries);
    Collections.sort(sortedCountries);
     for (String pais : sortedCountries) {
            System.out.println(pais);
     }
     
    }
    
    
    public void eliminarPais() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un país a eliminar: ");
        String pais = scanner.nextLine();

        Iterator<String> iterator = countries.iterator();
        boolean encontrado = false;

        while (iterator.hasNext()) {
            String actual = iterator.next();
            if (actual.equalsIgnoreCase(pais)) {
                iterator.remove();
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("País eliminado correctamente.");
        } else {
            System.out.println("El país no se encuentra en el conjunto.");
        }

        System.out.println("Lista de países actualizada:");
        for (String paisActualizado : countries) {
            System.out.println(paisActualizado);
        }
    }
}
