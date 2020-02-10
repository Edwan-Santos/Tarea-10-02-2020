/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulos;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Triangulos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner triangulo = new Scanner(System.in);
        
        System.out.println("Ingresar lado a." );
        int a= triangulo.nextInt();
        System.out.println("Ingresar lado b." );
        int b= triangulo.nextInt();
        System.out.println("Ingresar lado c." );
        int c= triangulo.nextInt();
        
        if(a==b && b==c && a==c && b==a && c==b && c==a){
           System.out.println("Triangulo Equilatero." );
        }
        if(a==b && b!=c && a!=c && a!=b && b!=c && c==a && a!=b && b==c && c!=a){
            System.out.println("Triangulo Isosceles." );
            
        if (a!=b && b!=c && a!=c ) {
            
           System.out.println("Triangulo Escaleno." ); 
        }    
        }
        
        // TODO code application logic here
    }
    
}
