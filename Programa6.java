/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayorymenor;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class MayorYMenor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
 
int numero1;
int numero2;
int numero3;

System.out.println("\nEste programa lee tres numeros y determina el mayor y el menor. ");
System.out.println("Por favor introduzca el primer numero:");
numero1 = entrada.nextInt();

System.out.println("\nPor favor introduzca el segundo entero:");
numero2 = entrada.nextInt();
 
System.out.println("\nPor favor introduzca el tercer entero:");
numero3 = entrada.nextInt();
 
int menor = numero1;
 
if ( numero2 < menor)
menor = numero2;
if ( numero3 < menor)
menor = numero3;

int mayor = numero1;
 
if (numero2 > mayor)
mayor = numero2;
if (numero3 > mayor)
mayor = numero3;

System.out.printf("\nEl menor de los numeros es: %d\n", menor);
System.out.printf("\nEl mayor de los numeros es: %d\n", mayor);

}           // Cierra el metodo main
}
        // TODO code application logic here
    
    

