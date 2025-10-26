/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication17;
import java.util.Scanner;
/**
 *
 * @author arthu_uhkw4r8
 */
public class TesteEntrada {
    Scanner teclado = new Scanner(System.in);
    
    
         public static void linhas(int limite, String linha, boolean fim){
         int c = 0;
         while(c < limite){
             System.out.printf(linha);
             c++;
         }
         if(fim){
             System.out.println("\n\n");
         }else{
             System.out.println("");
         }
         
     }
    
     public static int testInt(Scanner teclado, String msg){
        int num;
        
        while(true){ 
            try{
                System.out.println(msg);
                String entrada = teclado.nextLine();
                
                num = Integer.parseInt(entrada);
                return num;
                
            }catch(NumberFormatException e){
                System.out.println("\n\nEntrada invalida, por favor, insira um numero inteiro valido");
                linhas(50, "-", true);
            }
        }
    }
    
     public static double testDouble(Scanner teclado, String msg){
        double num;
        
        while(true){
            try{
                System.out.println(msg);
                String entrada = teclado.nextLine();
                
                num = Double.parseDouble(entrada);
                return num;
                
            }catch(NumberFormatException e){
                System.out.println("\n\nEntrada invalida, por favor, insira um numero valido");
                linhas(50, "-", true);
            }
        }
    }
}
