/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiarelacionesejex02.Entities;

/**
 *
 * @author Usuario
 */
public class Sala {

    private String[][] asientos;

    public Sala() {
    }

    public Sala(String[][] asientos) {
        this.asientos = asientos;
    }

    public String[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(String[][] asientos) {
        this.asientos = asientos;
    }

    public String obtenerElemento(int fila, int columna) {
        return asientos[fila][columna];
    }

    public void modificarValor(int fila, int columna, String nuevoValor) {
        asientos[fila][columna] = nuevoValor;
    }
}
