/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade_dia_28.pkg08.pkg25;
import java.util.Scanner;

/**
 *
 * @author ArthurOliCode
 */
public class Testes {
    
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
                System.out.println("--------------------------------------------------------\n\n");
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
                System.out.println("--------------------------------------------------------\n\n");
            }
        }
    }
     
     public static String testString(Scanner teclado, String msg, int numLetras){
        String resp = "";
        String entrada = ""; 
        
        while(entrada.length() <= numLetras)
        {
            System.out.println(msg);
            entrada = teclado.nextLine();
            
            if(entrada.length() >= numLetras){
                resp = entrada; 
            }else{
                System.out.printf("\n\nEntrada invalida, por favor, resultados com menos de %s letras nao serao aceitos!\n", numLetras);
                System.out.println("------------------------------------------------------------------\n\n");
            }
        }
        return resp;       
    } 
     
     public static String testFrase(Scanner teclado, String msg){
        String entrada = ""; 
        
        while(entrada.equals(""))
        {
            System.out.println(msg);
            entrada = teclado.nextLine();
            
            if(!entrada.equals("")){ 
                return entrada;
            }else{
                System.out.println("\n\nEntrada invalida, por favor, insira uma frase que nao seja vazia!");
                System.out.println("------------------------------------------------------------------\n\n");
            }
        }
        return entrada;
    } 
     
     public static boolean estudante(Scanner teclado, String msg){
         System.out.println("Voce e estudante de alguma instituicao? ");
         String entrada = teclado.next().substring(0, 1).toLowerCase();
         if(entrada.equals("s")){
             return true;
         }else{
             return false;             
         }
     }
     
     public static void resultadosEstudante(int idade, double tamanho, boolean estudante,
    String nome, String frase, String cidade){
         int c = 0;
         System.out.printf("%20s %s \n", "", "Resultados");
         while(c < 40){
            System.out.printf("=");
            c++;
         }
         System.out.println("");
         System.out.printf("Olá %s! Bem vindo!\n\n", nome);
         
         System.out.printf("Nome: %10s %s \n", "", nome);
         System.out.printf("Idade: %9s %s \n", "", idade);
         System.out.printf("Idade: %9s %.2f \n", "", tamanho);
         System.out.printf("Cidade: %8s %s \n", "", cidade);
         System.out.printf("estudante: %5s %b \n", "", estudante);
         System.out.println("");
         System.out.printf("%s \n",frase);
         
         c = 0;
         while(c < 40){
            System.out.printf("=");
            c++;
         }
         System.out.println("");
     }
}
