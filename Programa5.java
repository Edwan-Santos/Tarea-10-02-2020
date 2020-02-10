/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estadoderesultados;
import java.util.Scanner;


/**
 *
 * @author user
 */
public class EstadoDeResultados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double ventas = 0;
        double costVentas = 0;
        double utilidadBruta = 0;
        double gastosOperacion = 0;
        double utilidadOperacion = 0;
        double otrosProductos = 0;
        double otrosGastos = 0;
        double utilidadantesDelISRYPtu = 0;
        double isr = 28;
        double ptu = 0;
        double utilidadNeta = 0;
        
        
        System.out.print("Estado de resultados del 1 de enero al 31 de diciembre del 2016 \n\n");
        System.out.print("El valor de las ventas es: ");
         ventas = entrada.nextInt();
        System.out.print("El valor del costo de ventas es: ");
         costVentas = entrada.nextInt();
        
         utilidadBruta = ventas - costVentas;
         
                
        System.out.print("La utilidad bruta es: " + utilidadBruta );
        
        System.out.print("\nEl valor de los gastos de operacion es: ");
        gastosOperacion = entrada.nextInt();
        utilidadOperacion = utilidadBruta - gastosOperacion;
        System.out.print("\n\nEl valor de la utildad de operacion es: " + utilidadOperacion );
        
        
        System.out.print("\nOtros productos: ");
        otrosProductos = entrada.nextInt();
        
        System.out.print("Otros gastos: ");
        otrosGastos = entrada.nextInt();
          utilidadantesDelISRYPtu = (utilidadOperacion + otrosProductos) - otrosGastos;
        
        System.out.print("\nEl valor de la utildad antes del ISR y PTU es: " +  utilidadantesDelISRYPtu );
        
        System.out.print("\nisr: ");
        isr = entrada.nextInt();
        System.out.print("ptu: ");
        ptu = entrada.nextInt();
        
        utilidadNeta =  utilidadantesDelISRYPtu - (isr + ptu);
        
        System.out.print("\nEl valor de la utildad neta es: " +  utilidadNeta );
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
