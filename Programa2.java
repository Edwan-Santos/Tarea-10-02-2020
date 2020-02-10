/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculogeometrico;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class CalculoGeometrico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("CALCULO DEL AREA DEL RECTANGULO \n\n");
        System.out.print("Ingrese la base: ");
        int base = entrada.nextInt();
        System.out.print("Ingrese la altura: ");
        int altura = entrada.nextInt();
        
        int area = base * altura;
        
        System.out.print("El area del rectangulo es: " + area );
        
        
        
        
        // TODO code application logic here
    }
    
}
