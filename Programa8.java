/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaocho;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class ProgramaOcho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        char letra1 = ' ', letra2 = ' ', letra3 = ' ',letra4 = ' ',letra5 = ' ';
        int vocal1 = 0, vocal2 = 0, vocal3 = 0, vocal4 = 0, vocal5 = 0;
        int conso1 = 0,conso2 = 0,conso3 = 0,conso4 = 0,conso5 = 0;
        int totVoc = 0;
        int totConson =0;
         
        System.out.println("Ingrese 5 letras");
        letra1 = leer.nextLine().charAt(0);
        letra2 = leer.nextLine().charAt(0);
        letra3 = leer.nextLine().charAt(0);
        letra4 = leer.nextLine().charAt(0);
        letra5 = leer.nextLine().charAt(0);
        
        if(letra1=='a'||letra1=='e'||letra1=='i'||letra1=='o'||letra1=='u'||letra1=='A'||letra1=='E'||letra1=='I'||letra1=='O'||letra1=='U'){
            vocal1 =1;
        }else{
            conso1 =1;
        if(letra2=='a'||letra2=='e'||letra2=='i'||letra2=='o'||letra2=='u'||letra2=='A'||letra2=='E'||letra2=='I'||letra2=='O'||letra2=='U'){
            vocal2 =1;
        }else{
            conso2 =1;
        if(letra3=='a'||letra3=='e'||letra3=='i'||letra3=='o'||letra3=='u'||letra3=='A'||letra3=='E'||letra3=='I'||letra3=='O'||letra3=='U'){
            vocal3 =1;
        }else{
            conso3 =1;
        if(letra4=='a'||letra4=='e'||letra4=='i'||letra4=='o'||letra4=='u'||letra4=='A'||letra4=='E'||letra4=='I'||letra4=='O'||letra4=='U'){
            vocal4 =1;
        }else{
            conso4 =1;
        if(letra5=='a'||letra5=='e'||letra5=='i'||letra5=='o'||letra5=='u'||letra5=='A'||letra5=='E'||letra5=='I'||letra5=='O'||letra5=='U'){
            vocal5 =1;
        }else{
            conso5 =1;
            
        }
        
        totVoc = (vocal1 + vocal2 + vocal3 + vocal4 + vocal5);
        totConson = (conso1 + conso2 + conso3 + conso4 + conso5);
        System.out.println("");
        System.out.println("-Vocales" +totVoc);
        System.out.println("-Consonantes" +totConson);
        
        }     
        }   // TODO code application logic here    }
    
        }
        }
    }
}