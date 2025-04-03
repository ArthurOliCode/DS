/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programads.pkg12;
import java.util.Scanner;

/**
 *
 * @author AthurOliCode
 */
public class ProgramaDS12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
         teclado = variável para entrada de dados
         nome = Nome do funcionário
         salFixo = Salário fixo
         carsVendidos = Carros vendidos por este trabalhador
         comissaoCar = Comissão por cada carro vendido
         valor
         taxaVendas = Taxa fixa por cada uma das vendas
         valorAdVendas = Valor adicional sobre vendas realizadas
         vendas = Quantidade de vendas feitas
         salFinal = Salário final do funcionário

        */
        // Apresentação inicial
        System.out.println("    Bem vindo!");
        System.out.println("""
                           Este programa ira calcular o salario de um funcionario de
                           uma revendedora de automoveis, considerando uma comissao
                           por cada unidade de carro vendido, junto a uma porcentagem
                           de 5% pelo valor de vendas realizadas por ele. Assim,
                           apresentando o salario final ao final do programa.
                           """);
        System.out.println("\n\n");
        
        // Valores iniciais
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe o nome do funcionario em questao: ");
        String nome = teclado.next();
        
        float salFixo = testeFloat(teclado, "Insira o valor fixo por mês do mesmo: ");
        int vendas = testeInt(teclado, "Digite o valor das vendas efetuadas: ");
        int carsVendidos = testeInt(teclado, "Digite o número de carros negociados pelo funcionario: ");
        int comissaoCar = testeInt(teclado, "Informe a comissão fixa por cada carro vendido: ");
        
        float taxaVendas = 5;
        
        
        // Valores finais
        float valorAdVendas = vendas * (taxaVendas/100);
        float valorAdCarros = carsVendidos * comissaoCar;
        float salFinal = salFixo + valorAdVendas + valorAdCarros;
        
        
        
        // Tabela de resultados
        
        System.out.printf("\n\n%-30s Tabela de Resultados\n\n", " ");
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.printf("%-5s %-10s | %-10s | %-10s | %-10s | %-10s \n", "", "Nome", "Salario Fixo","Vendas", "Carros vendidos", "Salario Final");
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.printf("%-5s %-10s | %-12.2f | %-10d | %-15dsadad | %-10.2f \n", "", nome, salFixo, vendas, carsVendidos, salFinal);
        System.out.println("---------------------------------------------------------------------------------------------");
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
    
    
    public static int testeInt(Scanner teclado, String msg){
        int num;
        
        while(true){
            
            System.out.println(msg);
            String entrada = teclado.next();
            
            try{
                num = Integer.parseInt(entrada);
                return num;
            }
            catch(NumberFormatException e){
                System.out.println("\n\nErro! Por favor digite um valor válido!");
                System.out.println("----------------------------------------\n\n");
            }
        }
    }

 }

