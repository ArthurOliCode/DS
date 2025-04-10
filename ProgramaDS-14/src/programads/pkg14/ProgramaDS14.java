/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programads.pkg14;
import java.util.Scanner;

/**
 *
 * @author ArthurOliCode
 */
public class ProgramaDS14 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        /*
         teclado = entrada de dados
         quantL = quantidade de litros a serem vendidos
         descL = Desconto por quantidade de litro vendida
         tipoCom = Tipo de combustível que o cliente prefere
         taxaCom = Taxa do comustível em específico
         precL = Preço total sobre a quantidade de litros do combustível escolhido
         alcV = Valor do combustível álcool
         gasV = Valor do combustível gasolina
        */
        
        
        System.out.println("     Bem Vindo!");
        System.out.println("""
                           Este ira calcular o preco unitario do tipo de 
                           combustivel escolhido pelo cliente, alem disso, 
                           havera um desconto pela quantidade de litro,
                           que ira depender da escolha do usuario. 
                           Ao final, o programa apresentara os dados.
                           """);
        System.out.println("\n");
        
        
        System.out.printf("%-10s Tabela de Precos\n", " ");
        System.out.printf("-----------------------------------\n");
        System.out.printf("%-5s: %-10s | %-10s \n", "Combustivel", "Gasolina", "Alcool");
        System.out.printf("%-5s: %-5s %-10s | %-10s \n", "Preco", "","R$3.30", "R$2.90");
        System.out.println("-----------------------------------\n\n");
        
        System.out.printf("%-10s Descontos\n", " ");
        System.out.printf("-----------------------------------\n");
        System.out.printf("%-5s: %-10s | %-10s \n", "Combustivel", "Gasolina", "Quantidade Litros");
        System.out.printf("%-5s: %-3s %-6s | %-3s %s \n", "Porcentagem", "","4%", "3%", "ate 20");
        System.out.printf("%-5s: %-3s %-6s | %-3s %s \n", "Porcentagem", "","6%", "5%", "acima de 20");
        System.out.println("-----------------------------------\n\n");
        
        
        Scanner teclado = new Scanner(System.in);
        double descL = 4 * 0.01; 
        double taxaCom = 0;
        
        float quantL = testFloat(teclado, "Digite a quantidade de Litros necessaria para o tanque do seu automovel: ");
        
        String tipoCom = testResp(teclado, "Informe sua preferencia de combustivel: ");
        
        
        if (tipoCom.equals("g")){
            taxaCom = 3.30;
            
            if (quantL <= 20){
                descL = 3 * 0.01;
            }else{
                descL = 6 * 0.01;
            }
            
            
        }else if(tipoCom.equals("a")){
            taxaCom = 2.90;
            if (quantL <= 20){
                descL = 4 * 0.01;
            }else{
                descL = 5 * 0.01;
            }
            
        }
        
        System.out.println(descL);
        double precL = (quantL * taxaCom) - (quantL * descL); 
        
        System.out.println(descL);
        
        System.out.printf("%-10s Tabela de Resultados\n", " ");
        System.out.printf("----------------------------------------\n");
        System.out.printf("%-5s: %-10s \n", "Combustivel", tipoCom);
        System.out.printf("%-5s: %-5s %.2f\n", "Preco", "", precL);
        System.out.println("-----------------------------------\n\n");
        
        
        
    }
    
    
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
    
    
    public static float testFloat(Scanner teclado, String msg){
        float num;
        
        while(true){
            try{
                System.out.println(msg);
                String entrada = teclado.next();
                
                num = Float.parseFloat(entrada);
                return num;
                
            }catch(NumberFormatException e){
                System.out.println("\n\nEntrada invalida, por favor, insira um numero valido");
                System.out.println("--------------------------------------------------------\n\n");
            }
        }
    }
    
    public static String testResp(Scanner teclado, String msg){
        String resp = "";
        String entrada = ""; 
        
        while(!entrada.equals("g") && !entrada.equals("a"))
        {
            System.out.println(msg);
            entrada = teclado.next();
            entrada = entrada.substring(0, 1).toLowerCase();
            
            if(entrada.equals("g") || entrada.equals("a")){
                resp = entrada; 
            }else{
                System.out.println("\n\nEntrada invalida, por favor, escolha entre alcool ou gasolina!");
                System.out.println("------------------------------------------------------------------\n\n");
            }
        }
        return resp;       
    } 
}
