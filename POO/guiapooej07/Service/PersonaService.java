/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
 Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas

cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
*/
package guiapooej07.Service;

import guiapooej07.Entidades.Persona;
import java.util.Scanner;

public class PersonaService {
    private Persona persona =new Persona();
    private Scanner read = new Scanner(System.in);
    
    public Persona crearPersona(){
        Persona persona = new Persona();
        String sexo;
        System.out.println("Ingrese su  nombre ");
        String nombre =read.nextLine();
       
        //persona.setNombre(read.nextLine());
        System.out.println("Ingrese su  edad ");
        int edad =read.nextInt();
        //persona.setEdad(read.nextInt());
        read.nextLine();
        do {
             System.out.println("Ingrese su  sexo 'H' 'M' ");
             sexo=read.nextLine();
            if ( !sexo.equalsIgnoreCase("H") && !sexo.equalsIgnoreCase("M") ) {
                System.out.println("respuesta invalida intente de nuevo "); 
            }
        } while (!sexo.equalsIgnoreCase("H") && !sexo.equalsIgnoreCase("M"));
        
        //persona.setSexo(sexo);
        
        System.out.println("ingrese su peso");
        double peso = read.nextDouble();
        //persona.setPeso(read.nextDouble());
         System.out.println("ingrese su altura en metros ");
         double altura = read.nextDouble();
        //persona.setAltura(read.nextDouble());
        read.nextLine();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
       return new Persona(nombre,edad,sexo,peso,altura);
    }
    public int calcularIMC(Persona persona){
       double imc= persona.getPeso()/(Math.pow(persona.getAltura(),2));
        if (imc<20) {
            return -1;
        }else if(imc>=20 && imc<=25){
            return 0; 
        }else{
            return 1;}
    }
    
    public boolean esMayorDeEdad(Persona persona){
        boolean mayor=false;
        if(persona.getEdad()>=18){mayor=true;}
        return mayor;
    }
    
    
    
}
