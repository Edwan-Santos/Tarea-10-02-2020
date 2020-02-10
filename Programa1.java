/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x;
        int y;
        
        
        System.out.print("Ingrese el primer numero: ");
        x = entrada.nextInt();
        
        System.out.print("Ingrese el segundo numero: ");
        y = entrada.nextInt();
        
        int suma = x + y;
        int resta = x - y;
        int multiplicacion = x * y;
        double division = x / y;
        
        System.out.println("\nla suma es: " + suma);
        System.out.println("la resta es: " + resta);
        System.out.println("la multiplicacion es: " + multiplicacion );
        System.out.println("la division es: " + division);
        
        
        entrada.nextInt();
        
        
        
        // TODO code application logic here
    }
    
}
