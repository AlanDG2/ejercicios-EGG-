/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el mazin se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package guiapooej08.CadenaService;

import guiapooej08.Cadena.Cadena;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CadenaService {

    private Cadena cadena = new Cadena();
    private Scanner read = new Scanner(System.in);

    public void crearCadena() {
        System.out.println("ingrese su plabra");
        cadena.setFrase(read.nextLine());
        cadena.setLongitud(cadena.getFrase().length());

    }

    public void mostrarVocales() {
        int contadorVocales = 0;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            char caracterActual = cadena.getFrase().charAt(i);
            if (String.valueOf(caracterActual).matches("[aeiouAEIOU]")) {
                contadorVocales++;
            }
        }
        System.out.println(cadena.getFrase()+" contiene " +contadorVocales+" vocales ");
       
    }

   public void  invertirFrase(){
        String resultado = "";
        String str=cadena.getFrase();
    for (int i = str.length() - 1; i >= 0; i--) {
        resultado += str.charAt(i);
    }
       System.out.println(cadena.getFrase()+ " invertida : "+resultado);
   }
   
   public void vecesRepetido(String letra){
        int contador = 0;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            char caracterActual = cadena.getFrase().charAt(i);
            if (String.valueOf(caracterActual).matches(letra)) {
                contador++;
            }
        }
        if (contador>0) {
           System.out.println("la letra " +letra+" se repite " + contador + " veces ");
       }else{System.out.println("la letra " +letra+ " no esta en la frase ");}
       
   }
    public void compararLongitud(String frase){
      int length1=cadena.getFrase().length();
      int length2 =frase.length();
            
        if (length1<length2) {
            System.out.println(cadena.getFrase()+" es mas corta que " + frase );
        }else if (length1==length2) {
             System.out.println(cadena.getFrase()+" es igual  que " + frase );
        }else{    System.out.println(cadena.getFrase()+" es mas larga  que " + frase );}
    }
    
   public void  unirFrases(String frase){
       System.out.println("las frases unidas " +cadena.getFrase()+ " " + frase);
       
   }
   
    public void  reemplazar(String letra){
        String newtxt="";
         for (int i = 0; i < cadena.getLongitud(); i++) {
            char caracterActual = cadena.getFrase().charAt(i);
            if (String.valueOf(caracterActual).matches("[Aa]")) {
               newtxt+=letra;
            }else{ newtxt+=cadena.getFrase().charAt(i);}
        }
         System.out.println(newtxt);
    }
    
    public void contiene(String letra){
        int cont=0;
         for (int i = 0; i < cadena.getLongitud(); i++) {
            char caracterActual = cadena.getFrase().charAt(i);
            if (String.valueOf(caracterActual).matches(letra)) {
              cont++;
            }
        }
         if (cont>0) {
             System.out.println("la frase contiene  la letra " + letra );  
        }else{ System.out.println("la frase no contiene  la letra " + letra );}
        
    }
    
    
    
}
