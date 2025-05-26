/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex001poo;

import java.util.Scanner;

/**
 *
 * @author arthu_uhkw4r8
 */
public class ChecagemEntrada {
    public static int testInt(Scanner teclado, String msg){
        int num;
        
        while(true){ 
            try{
                System.out.println(msg);
                String entrada = teclado.next();
                
                num = Integer.parseInt(entrada);
                return num;
                
            }catch(NumberFormatException e){
                System.out.println("\n\nEntrada invalida, por favor, insira um numero inteiro valido");
                System.out.println("--------------------------------------------------------\n\n");
            }
        }
    }
   
    public static String testSimNao(Scanner teclado, String msg){
        System.out.println(msg);
        String resp = teclado.next().strip().toLowerCase().substring(0, 1);
        while(!resp.equals("s") && !resp.equals("n")){
            System.out.println("\nDigite uma resposta valida: [s : sim] [n : nao]");
            resp = teclado.next().strip().toLowerCase().substring(0,1);
        }
        return resp;
    }
    
    public static String testAceleDesacelerar(Scanner teclado, String msg){
        System.out.println(msg);
        String resp = teclado.next().strip().toLowerCase().substring(0, 1);
        while(!resp.equals("a") && !resp.equals("d")){
            System.out.println("\nDigite uma resposta valida: [a : acelerar] [d : desacelerar]");
            resp = teclado.next().strip().toLowerCase().substring(0,1);
        }
        return resp;
    }
}
