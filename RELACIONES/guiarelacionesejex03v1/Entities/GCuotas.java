/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiarelacionesejex03v1.Entities;

import java.util.Date;

/**
 *
Gestión de cuotas: Se registrarán y podrán consultar las cuotas generadas en cada póliza.
Esas cuotas van a contener la siguiente información: número de cuota, monto total de la
cuota, si está o no pagada,
 */
public class GCuotas {
    private GPolizas  polizas;
    private int installments;
    private double total;
    private boolean pagada;
    private Date vencimiento;
    private String formaPago;

    public GCuotas() {
    }

    public GCuotas(GPolizas polizas, int installments, double total, boolean pagada, Date vencimiento, String formaPago) {
        this.polizas = polizas;
        this.installments = installments;
        this.total = total;
        this.pagada = pagada;
        this.vencimiento = vencimiento;
        this.formaPago = formaPago;
    }

    public GPolizas getPolizas() {
        return polizas;
    }

    public void setPolizas(GPolizas polizas) {
        this.polizas = polizas;
    }

    public int getInstallments() {
        return installments;
    }

    public void setInstallments(int installments) {
        this.installments = installments;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public Date getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Date vencimiento) {
        this.vencimiento = vencimiento;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }
    
    
}
