/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa13;
import java.util.Scanner;


/**
 *
 * @author user
 */
public class Programa13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

		
int acumulado = 0;

		
for (int i = 1; i <= 5; i++) {
		
	System.out.print("Ingrese el " + i + " numero: ");
		
	float entrada = scanner.nextFloat();

			
acumulado += entrada;
		}

		
System.out.println("El promedio es: " + acumulado / 5.0);
	}
}

        // TODO code application logic here
    
    
