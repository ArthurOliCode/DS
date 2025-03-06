/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programads.pkg3;

import java.util.Scanner;
/**
 *
 * @author arthu_uhkw4r8
 */
public class ProgramaDS3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //teclado = variável para entrada de dados
        //nmV = Variável para o nome do vendedor
        //slI = Salário inicial do vendedor 
        //slF = salário final do vendedor
        //vnd = total de vendas realizadas
        //com = comissão do vendedor
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.printf("%-20s \n\n", "Bem vindo");
        System.out.println("Este programa ira calcular o salario final de um\nfuncionario apos um valor fixo de 15% para comissao de vendas\n\n");
        
        System.out.println("Informe o nome do vendedor: ");
        String nmV = teclado.next();
        System.out.println("\nDigite o salario fixo do mesmo: ");
        float slI = teclado.nextFloat();
        System.out.println("\nInforme o total de vendas(em dinheiro) realizadas pelo funcionario: ");
        float vnd = teclado.nextFloat();
        
        double com = vnd * 0.15;
        double slF = slI + com;
        
        System.out.println("\n\n----------------------------------");
        System.out.printf("%-20s %-10s\n\n", "Tabela de dados do vendedor ", nmV);
        System.out.printf("%-10s %-10.2f\n", "Salario Incial", slI);
        System.out.printf("%-10s %-10.2f\n", "Vendas", vnd);
        System.out.printf("%-10s %-10.2f\n", "Comissao", com);
        System.out.printf("%-10s %-10.2f\n", "Salario Final", slF);
        System.out.println("----------------------------------");
    }
    
}
