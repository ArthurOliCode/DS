/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programads.pkg13;
import java.util.Scanner;

/**
 *
 * @author CAMARGO
 */
public class ProgramaDS13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
         nome = Nome do usuário
         massa = Massa do usuário
         gen = Genêro do usuário
         altura = Altura do usuário
        */
        
        System.out.println("     Bem Vindo!");
        System.out.println("""
                           Este programa ira calcular o peso ideal para você o usuário.
                           O resultado se baseara nas formulas internacionais para IMC:
                           ((massa * altura) - 58) - para homens - ou "- 44.7" - para 
                           mulheres -.
                           """);
        System.out.println("\n\n");
        
        
        Scanner teclado = new Scanner(System.in);
        
        String nome = saidaString(teclado, "Por favor, digite seu nome: ");
        
        float massa = testarFloat(teclado, "Indique sua massa corporal atual: ");
        String gen = testGen(teclado, "Insira o seu genero biologico: ");
        
    }
    
    
    public static String testGen(Scanner teclado, String msg){
        
        String genCor; // Variável genCor = Genêro corrigido, ou seja, sem erros de formatação
        
        while(true){
            System.out.println(msg);
            String entrada = teclado.next().substring(0, 1).toLowerCase();
            
            if(entrada.equals("m") || entrada.equals("f")){
                
                genCor = entrada;
                return genCor;
            }else{
                System.out.println("\n\nErro! Digite um gênero válido!");
                System.out.println("\n\n--------------------------------------------");
                System.out.println();
            }
        }
    }
    
    
    public static String saidaString(Scanner teclado, String msg){
        System.out.println(msg);
        String entrada = teclado.next();
        return entrada;
    }
    
    
    public static float testarFloat(Scanner teclado, String msg)
    {
        float num;// Variável para retorno de valor
        while(true)
        {
            System.out.println(msg);
            String entrada = teclado.next();// Variável para validação de entrada

            try{
                num = Float.parseFloat(entrada);
                return num;
            }
            catch(NumberFormatException e){
                System.out.println("Erro! Por favor, insira um numero inteiro valido...");
                System.out.println("-----------------------------------------------------\n\n\n");
            }
        }
        
    }
}
