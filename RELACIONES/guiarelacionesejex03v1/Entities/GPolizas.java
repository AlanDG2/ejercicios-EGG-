/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiarelacionesejex03v1.Entities;
import guiarelacionesejex03v1.Entities.GIClientes;
import guiarelacionesejex03v1.Entities.GVehiculos;
import java.util.Date;

/**
 *
 son: número de
póliza, fecha de inicio y fin de la póliza, cantidad de cuotas, forma de pago, monto total
asegurado, incluye granizo, monto máximo granizo, tipo de cobertura (total, contra
terceros, etc.).
 */
public class GPolizas {
    private GIClientes client;
    private GVehiculos car;
    private Integer policyNumber;
    private Date starDate;
    private Date endDate;
    private Integer installments;
    private String payment;
    private Integer total;
    private Boolean hail;
    private Integer totalHail;
    private String coverageType;

    public GPolizas() {
    }

    public GPolizas(GIClientes client, GVehiculos car, Integer policyNumber, Date starDate, Date endDate, Integer installments, String payment, Integer total, Boolean hail, Integer totalHail, String coverageType) {
        this.client = client;
        this.car = car;
        this.policyNumber = policyNumber;
        this.starDate = starDate;
        this.endDate = endDate;
        this.installments = installments;
        this.payment = payment;
        this.total = total;
        this.hail = hail;
        this.totalHail = totalHail;
        this.coverageType = coverageType;
    }

    public GIClientes getClient() {
        return client;
    }

    public void setClient(GIClientes client) {
        this.client = client;
    }

    public GVehiculos getCar() {
        return car;
    }

    public void setCar(GVehiculos car) {
        this.car = car;
    }

    public Integer getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(Integer policyNumber) {
        this.policyNumber = policyNumber;
    }

    public Date getStarDate() {
        return starDate;
    }

    public void setStarDate(Date starDate) {
        this.starDate = starDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getInstallments() {
        return installments;
    }

    public void setInstallments(Integer installments) {
        this.installments = installments;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Boolean getHail() {
        return hail;
    }

    public void setHail(Boolean hail) {
        this.hail = hail;
    }

    public Integer getTotalHail() {
        return totalHail;
    }

    public void setTotalHail(Integer totalHail) {
        this.totalHail = totalHail;
    }

    public String getCoverageType() {
        return coverageType;
    }

    public void setCoverageType(String coverageType) {
        this.coverageType = coverageType;
    }
    
    
    
    
    
}
