/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaherenciaej01.Entities;

/**
 *
 * Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato,
 * Caballo. La clase Animal tendrá como atributos el nombre, alimento, edad y
 * raza del Animal.
 */
public class Animal {

    protected String name;
    protected String food;
    protected Integer edad;
    protected String breed;

    public Animal() {
    }

    public Animal(String name, String food, Integer edad, String breed) {
        this.name = name;
        this.food = food;
        this.edad = edad;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    public void alimentarse(){
         System.out.println( name +", "+ food+", "+ edad+ ", "+ breed);
    }

}
