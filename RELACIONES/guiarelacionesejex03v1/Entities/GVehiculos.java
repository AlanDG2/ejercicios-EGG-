/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiarelacionesejex03v1.Entities;

/**
 *
 * @author Usuario
 */
public class GVehiculos {
     //Marca, modelo, año, número de motor, chasis, color, tipo (camioneta, sedán, etc.).
    private String brand;
    private String model;
    private Integer year;
    private Integer engineNumber;
    private String chassis;
    private String color;
    private String kind;

    public GVehiculos() {
    }

    public GVehiculos(String brand, String model, Integer year, Integer engineNumber, String chassis, String color, String kind) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.engineNumber = engineNumber;
        this.chassis = chassis;
        this.color = color;
        this.kind = kind;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getEngineNumber() {
        return engineNumber;
    }

    public void setEngineNumber(Integer engineNumber) {
        this.engineNumber = engineNumber;
    }

    public String getChassis() {
        return chassis;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        return "GVehiculos{" + "brand=" + brand + ", model=" + model + ", year=" + year + ", engineNumber=" + engineNumber + ", chassis=" + chassis + ", color=" + color + ", kind=" + kind + '}';
    }
    
    
}
