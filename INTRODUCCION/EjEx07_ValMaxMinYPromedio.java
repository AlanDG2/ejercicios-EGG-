


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Usuario
 *//*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
promedio de n números (n>0). El valor de n se solicitará al principio del programa y los
números serán introducidos por el usuario. Realice dos versiones del programa, una
usando el bucle “while” y otra con el bucle “do - while”.
*/
 import java.util.Scanner;
public class EjEx07_ValMaxMinYPromedio {

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) {
        Scanner read =new Scanner(System.in);
        System.out.println("intrduzca la cantidad de valores ");
        int amountValues = read.nextInt();
        int minValue=0;
        int maxValue=0;
        double average=0;
        System.out.println("de que manera desea realizar el ejerecicio \n 1). para while \n 2). para do while  ");
        int option=read.nextInt();
        switch (option) {
            case 1:hacerMientras(amountValues,minValue,maxValue,average); break;
            case 2:mientras(amountValues,minValue,maxValue,average); break;
            default:
                System.out.println(" numero erroneo ");
        }
  
    }
    public static void hacerMientras(int cant,int min,int max,double prom){
         Scanner read =new Scanner(System.in);
        int count=1;
        do {
            
            System.out.println("digite  un numero  mayor a cero ");
            int num=read.nextInt();
            if (num>max){max=num;}
            if(count==1){min=num;}
            if(num<min){min=num;}
            prom+=num;
            count++;
            
        } while (count<=cant);
        prom/=cant;
         System.out.println("el valor minimo es " +min+ " el valor maximo es " +max+ " el  numero promedio  es " +(double)prom); 
    }
    
        public static void mientras (int cant,int min,int max,double prom){
         Scanner read =new Scanner(System.in);
        int count=1;
        while(count<=cant){
          System.out.println("digite  un numero  mayor a cero ");
            int num=read.nextInt();
            if (num>max){max=num;}
            if(count==1){min=num;}
            if(num<min){min=num;}
            prom+=num;
            count++;
        }
        prom/=cant;
         System.out.println("el valor minimo es " +min+ " el valor maximo es " +max+ " el  numero promedio  es " +(double)prom); 
    }
    
    
}
