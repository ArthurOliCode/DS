/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programads.pkg10;
import java.util.Scanner;

/**
 *
 * @author ArthurOliCode
 */
public class ProgramaDS10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
         teclado = variável para entrada de dados
         nome = Nome do funcionário
         salAtual = Salário atual do funcionário
         pReajuste = Percentual de reajuste
         salF = Salário final

        */
        
        //Apresentação inicial
        System.out.println("    Bem vindo!");
        System.out.println("""
                           Este programa ira calcular o valor de reajuste do salario 
                           de um funionario x, informado. Os dados serao apresentados
                           ao final do programa.
                           """);
        System.out.println("\n\n");
        
        
        //Variáveis iniciais
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o nome do funcionario: ");
        String nome = teclado.next();
        
        float salAtual = testeFloat(teclado, "Por favor, informe o salario do funcionario: ");
        float pReajuste = testeFloat(teclado, "Digite o percentual de reajuste desejada para aplicar ao rendimento mensal: ");
        
        //Variáveis finais
        float salF = salAtual + (salAtual * (pReajuste / 100)) ;
        
        
        //Tabela de resultados
        System.out.printf("\n\n%-20s Tabela de Resultados\n\n", " ");
        System.out.println("--------------------------------------------------------------");
        System.out.printf("%-10s %-10s | %-10s | %-10s \n", "", "Nome", "Salario I", "Salario F");
        System.out.println("--------------------------------------------------------------");
        System.out.printf("%-10s %-10s | %-10.2f | %-10.2f \n", "",nome, salAtual, salF);
        System.out.println("--------------------------------------------------------------");
    }
    
    public static float testeFloat(Scanner teclado, String msg){
        float num;
        
        while(true){
            
            System.out.println(msg);
            String entrada = teclado.next();
            
            try{
                num = Float.parseFloat(entrada);
                return num;
            }
            catch(NumberFormatException e){
                System.out.println("\n\nErro! Por favor digite um valor válido!");
                System.out.println("----------------------------------------\n\n");
            }
        }
    }
}
