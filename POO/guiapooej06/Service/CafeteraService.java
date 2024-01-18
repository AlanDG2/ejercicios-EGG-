/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
métodos:
 Constructor predeterminado o vacío
 Constructor con la capacidad máxima y la cantidad actual

 Métodos getters y setters.
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
 Método vaciarCafetera(): pone la cantidad de café actual en cero.
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
*/
package guiapooej06.Service;

import guiapooej06.Entidades.Nesspreso;
import java.util.Scanner;

public class CafeteraService {
    private Nesspreso cafetera =  new Nesspreso ();
    private Scanner read = new Scanner(System.in);

   public void crearCafetera(){
       do {
             System.out.println(" Ingrese la cantidad maxima de gr de cafe  que puede almacenar la cafetera ");
       cafetera.setCapacidadMaxima(read.nextInt());
           if (cafetera.getCapacidadMaxima()<1) { 
               System.out.println("  valor invalido  ingrese una cantidad mayor  ");
           }
       } while (cafetera.getCapacidadMaxima()<1);
       
        do {
             System.out.println(" Ingrese la cantidad actual  de gr de cafe  que contiene la cafetera ");
       cafetera.setCantidadActual(read.nextInt());
           if (cafetera.getCantidadActual()> cafetera.getCapacidadMaxima()) { 
               System.out.println("  valor invalido intente de nuevo");
           }
       } while (cafetera.getCantidadActual()> cafetera.getCapacidadMaxima());
     
   }
   
   public void llenarCafetera(){
       System.out.println("la cafetera  tiene actualmente " + cafetera.getCantidadActual() + "gr de cafe  \n Agregar " + (cafetera.getCapacidadMaxima()-cafetera.getCantidadActual()));
       cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
   }
   
    public void servirTaza() {
        int option;
        int taza = 0;
        String tazaLlena = "";

        do {
            System.out.println("Que tamano desea?\n1) Pequeno\n2) Mediano\n3) Grande\n4) Extra grande");
            option = read.nextInt();
            switch (option) {
                case 1:
                    taza = 10;
                    break;
                case 2:
                    taza = 15;
                    break;
                case 3:
                    taza = 20;
                    break;
                case 4:
                    taza = 25;
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }
        } while (option < 1 || option > 4);

        if (option > cafetera.getCantidadActual()) {
            System.out.println("Cantidad de cafe insuficiente. Por favor ingrese mas cafe.");
        } else {
            read.nextLine(); // Consumir la nueva línea después de leer la opción del tamaño de la taza.
            
            do {
                try {
                    System.out.println("Llenando taza....");
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }

                System.out.println("Su taza quedo llena?");
                tazaLlena = read.nextLine();

                if (!tazaLlena.equalsIgnoreCase("si") && !tazaLlena.equalsIgnoreCase("no")) {
                    System.out.println("Respuesta invalida. Por favor ingrese 'si' o 'no'.");
                    tazaLlena = "";
                }

            } while (!tazaLlena.equalsIgnoreCase("si"));

            cafetera.setCantidadActual(cafetera.getCantidadActual()-taza);
            System.out.println("Taza servida. Cantidad actual de cafe: " +cafetera.getCantidadActual() );
        }
    }
    
    
    
   public void vaciarCafetera(){
       System.out.println(" vaciando  cafetera ");
       cafetera.setCantidadActual(0);
       
   } 
   
    public void agregarCafetera(){
       System.out.println(" cuantos gramos de cafe desea agregar ");
       int cant=read.nextInt();
       int espacio=cafetera.getCapacidadMaxima()-cafetera.getCantidadActual();
        if (cant>espacio ) {
            System.out.println(" esa cantidad sobre pasa el limte,  se agregaran solo " + (espacio));
            cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        }else{
          cafetera.setCantidadActual(cant+cafetera.getCantidadActual());
        }
        System.out.println("cantidad actual de cafe es " + cafetera.getCantidadActual()+ " gramos.");
   } 
   
    
    public void menu(){
         int option;
        do {
            
            System.out.println(" Bienvenido  que opcion desea \n 1). llenar completamente la cafetera  \n 2). agregar una cantidad especifica de cafe  \n 3). servir taza  \n 4).vaciar cafetera \n 5).salir ");
            option = read.nextInt();
            switch (option) {
                case 1:
                    llenarCafetera();
                    break;
                case 2:
                     agregarCafetera();
                    break;
                case 3:
                    servirTaza();
                    break;
                case 4:
                    vaciarCafetera();
                    break;
                case 5:
                    System.out.println("Hasta luego, esperamos verlo pronto");
                    break;
                default:
                    System.out.println("Opción invalida. Intente de nuevo.");
                    break;
            }

        } while (option != 5);

    }
    
}
