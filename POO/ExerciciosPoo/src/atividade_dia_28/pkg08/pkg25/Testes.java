/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade_dia_28.pkg08.pkg25;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
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
     
     public static LocalDate testLocalDate(Scanner teclado, String msg){
         LocalDate data;
         DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
         
         while(true){
             try{
                 System.out.println(msg);
                 System.out.println("Insira os dados na ordem: dd/MM/yyyy");
                 String entrada = teclado.nextLine();
                 
                 data = LocalDate.parse(entrada, formatador);
                 
                 return data;
             }catch (DateTimeParseException e){
                 System.out.println("Data invalida, digite uma data no formato dd/MM/yyyy");
                 linhas(50, "-", true);
             }catch (Exception e){
                 System.out.println("Entrada invalida, verifique os dados de ano, mes e dia são validos.");
                 linhas(50, "-", true);
             }
         }
     }
     
     public static String testString(Scanner teclado, String msg, int numLetras){
        String resp = "";
        String entrada = ""; 
        
        while(entrada.length() < numLetras)
        {
            System.out.println(msg);
            entrada = teclado.nextLine();
            
            if(entrada.length() >= numLetras){
                resp = entrada; 
            }else if(entrada.length() < numLetras){
                System.out.printf("\n\nEntrada invalida, por favor, resultados com menos de %s letras nao serao aceitos!\n", numLetras);
                linhas(50, "-", true);
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
                linhas(50, "-", true);
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
         
         System.out.printf("%20s %s \n", "", "Resultados");
         linhas(40, "=", false);
         System.out.println("");
         System.out.printf("Ola %s! Bem vindo!\n\n", nome);
         
         System.out.printf("Nome: %10s %s \n", "", nome);
         System.out.printf("Idade: %9s %s \n", "", idade);
         System.out.printf("Idade: %9s %.2f \n", "", tamanho);
         System.out.printf("Cidade: %8s %s \n", "", cidade);
         System.out.printf("estudante: %5s %b \n", "", estudante);
         System.out.println("");
         System.out.printf("%s \n",frase);
         linhas(40, "=", true);
     }
     
     
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
     
     public static void titulo(String titulo){
         linhas(titulo.length() * 2, "=", false);
         System.out.printf("%4s %s \n", "", titulo);
         linhas(titulo.length() * 2, "=", true);
     }
}
