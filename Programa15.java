/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa15;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Programa15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double cantidad = 0;
        double resultado =0;
        
        while(true){
         System.out.println("Coversor de masa \n\n");
         System.out.println("1. kilogramos a libras");
         System.out.println("2. kilogramos a gramos");
         System.out.println("3. Libras a kilogramos");
         System.out.println("4. gramos a kilogramos");
         
         System.out.print("Ingrese una opcion\n");
         int item =  entrada.nextInt();
         
         switch(item){
             case 1:
                 System.out.print("Ingrese el monto a convertir:\n ");
                 cantidad = entrada.nextInt();
                 resultado = cantidad * 2.2;
                 System.out.println("El resultado es:" +resultado);
                 break;
              case 2:
                 System.out.print("Ingrese el monto a convertir: ");
                 cantidad = entrada.nextInt();
                 resultado = cantidad * 1000;
                 System.out.println("El resultado es:" +resultado);
                 break;
              case 3:
                  System.out.print("Ingrese el monto a convertir: ");
                 cantidad = entrada.nextInt();
                 resultado = cantidad * 0.45;
                 System.out.println("El resultado es:" +resultado);
                 break;
              case 4: 
                  System.out.print("Ingrese el monto a convertir: ");
                 cantidad = entrada.nextInt();
                 resultado = cantidad * 10000;
                 System.out.println("El resultado es:" +resultado);
                 break;
             default:
                 break;
            
            
                 
         }
         
         System.out.print("Desea realiazar otra conversion (Presiona w para salir)(O s para ingresar otra opcion)\n ");
         char desicion = entrada.next().charAt(0);
         
         if ( desicion != 's')
             break;
         
        }
        // TODO code application logic here
    }
    
}
