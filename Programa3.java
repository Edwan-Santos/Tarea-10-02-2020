/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paroimpar;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ParoImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Ingresa un numero ");
        int a = sc.nextInt();
        
        
        if(a%2==0){
             System.out.println(a+" es par");
             
        }else{
            System.out.println(a+" es impar");
            
            
        }      
     }
        // TODO code application logic here
    }
    

