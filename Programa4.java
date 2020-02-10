/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculohipotenusa;
import java.util.Scanner;


/**
 *
 * @author user
 */
public class CalculoHipotenusa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("CALCULO DE LA HIPOTENUSA DE UN TRIANGULO RECTANGULO \n\n");
        System.out.print("Ingrese el valor del cateto1: ");
        int cateto1 = entrada.nextInt();
        System.out.print("Ingrese el valor del cateto2: ");
        int cateto2 = entrada.nextInt();
        
        double hipotenusa = cateto1 * cateto1 + cateto2 * cateto2;
        
        System.out.print("La hipotenusa de un triangulo rectangulo es: " + hipotenusa);
        
        // TODO code application logic here
    }
    
}
