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
         imc = Indíce de massa corporal do usuário
         pesoI = Peso ideal de acordo com o genêro
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
        
        double massa = testarFloat(teclado, "Indique sua massa corporal atual: ");
        double altura = testarFloat(teclado, "Escreva sua altura em metros: ");
        String gen = testGen(teclado, "Insira o seu genero biologico: ");
        
        double imc = massa / (altura * altura);
        double pesoI = 0;
        
        
        
        if(imc > 0){
            pesoI = (72.7 * altura) - 58;
            if(gen.equals("m") && imc == pesoI){
                resultados(nome, massa, altura, "Ideal");
            }
            else{
                pesoI = (62.1 * altura) - 44.7;
                if(gen.equals("f") && imc == pesoI){
                    resultados(nome, massa, altura, "Ideal");
                }
                else if(imc < 18.5){
                    resultados(nome, massa, altura, "Magreza");

                }
                else if(imc <= 24.9){
                    resultados(nome, massa, altura, "Normal");
                }
                else if(imc <= 29.9 ){
                    resultados(nome, massa, altura, "Sobrepeso");
                }
                else if(imc <= 34.9){
                    resultados(nome, massa, altura, "Obesidade I");
                }
                else if(imc <= 39.9){
                    resultados(nome, massa, altura, "Obesidade II");
                }
                else if(imc >= 40){
                    resultados(nome, massa, altura, "Obesidade III");
                }  
            }
        }  
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
    
    public static void resultados(String nome, double massa, double altura, String status){
        System.out.printf("%-10s Tabela de Resultados\n", " ");
        System.out.printf("----------------------------------------\n");
        System.out.printf("%-5s: %-5s \n", "Nome", nome);
        System.out.printf("%-5s: %-3s %.2f\n", "Peso", "", massa);
        System.out.printf("%-5s: %-2s %.2f\n", "Altura", "", altura);
        System.out.printf("%-5s: %-1s %s\n", "Situacao", "", status);
        System.out.println("-----------------------------------\n\n");
    }
}
