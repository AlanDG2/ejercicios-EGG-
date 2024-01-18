/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guiapooejex05.Entidades;

/**
 *
 * @author Usuario
 */
public class MesesDelAnio {

    private String[] meses;
    private String mesSecreto;

    public MesesDelAnio() {
    }

    public MesesDelAnio(String[] meses, String mesSecreto) {
        this.meses = meses;
        this.mesSecreto = mesSecreto;
    }

    public String[] getMeses() {
        return meses;
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    public String escogerMes() {
        meses = new String[]{"enero", "febrero", "marzo", "abril", "mayo", "junio",
            "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        int indiceMesSecreto = (int) (Math.random() * 12);
        return mesSecreto = meses[indiceMesSecreto];
    }

    public boolean adivinarMes(String mes, String mesSecreto) {

        if (mes.equalsIgnoreCase(mesSecreto)) {
            System.out.println("Ha acertado!");
            return true;
        } else {
            System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes: ");
            return false;
        }

    }
}
