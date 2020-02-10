/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa11;
import java.util.Scanner;


/**
 *
 * @author user
 */
public class Programa11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      int horas = 0;
      int tarifa = 0;
      double totalAPagar = 0;
      
      System.out.println("Inrese total de horas");
       horas = entrada.nextInt();
       System.out.println("Inrese la tarifa por hora");
       tarifa = entrada.nextInt();
       
       int diferencia = horas - 40; 
       
       if (diferencia > 0){
           totalAPagar = 40 * tarifa + diferencia * tarifa * 1.5; 
       }
       else {
           totalAPagar = horas * tarifa;
       }     
       
       System.out.println("El total a pagar es: " +totalAPagar);
       
       
       
       
      
        // TODO code application logic here
    }
    
}
