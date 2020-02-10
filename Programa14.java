/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa14;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Programa14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int meses = 0;
        double cuotamensual = 0;
        
        System.out.println("Ingrese la cantidad de meses a ahorrar");
        meses = datos.nextInt();
        System.out.println("Ingrese el valor de la cuota a ahorrar");
        cuotamensual = datos.nextInt();
        
        for (int i=1; i<=meses; i++){
            System.out.println("mes  "+i+" total ahorrao " +i*cuotamensual);
        }
        
        // TODO code application logic here
    }
    
}
