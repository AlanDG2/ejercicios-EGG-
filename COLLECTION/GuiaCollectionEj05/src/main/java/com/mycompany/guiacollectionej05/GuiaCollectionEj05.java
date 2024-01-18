/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.guiacollectionej05;

import com.mycompany.guiacollectionej05.Service.CountryService;

/**
 *
 * @author Usuario
 */
public class GuiaCollectionEj05 {

    public static void main(String[] args) {
        CountryService countryService =new CountryService();
        countryService.agregarPaises();
        countryService.mostrarPaises();
        countryService.ordenar();
        countryService.eliminarPais();
        
    }
}
