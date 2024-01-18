/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiapooejex06.Entidades;

/**
 *
 * @author Usuario
 */
public class Ahorcado {
    private String palabra;
    private int letras;
    private int intentos;

    public Ahorcado() {
    }

    public Ahorcado(String palabra, int letras, int intentos) {
        this.palabra = palabra;
        this.letras = letras;
        this.intentos = intentos;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public int getLetras() {
        return letras;
    }

    public void setLetras(int letras) {
        this.letras = letras;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }



    
}
