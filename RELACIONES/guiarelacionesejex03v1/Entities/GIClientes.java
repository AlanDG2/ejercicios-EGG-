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
public class GIClientes {
     //Nombre y apellido, documento, mail domicilio, teléfono.
    private String name;
    private String lastName;
    private Integer id;
    private String mail;
    private String direction;
    private Integer phoneNumber;

    public GIClientes() {
    }

    public GIClientes(String name, String lastName, Integer id, String mail, String direction, Integer phoneNumber) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.mail = mail;
        this.direction = direction;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "GIClientes{" + "name=" + name + ", lastName=" + lastName + ", id=" + id + ", mail=" + mail + ", direction=" + direction + ", phoneNumber=" + phoneNumber + '}';
    }
}
