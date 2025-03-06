/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programads.pkg5;

import java.util.Scanner;
/**
 *
 * @author arthu_uhkw4r8
 */
public class ProgramaDS5 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("UnusedAssignment")
    public static void main(String[] args) {
        // TODO code application logic here
        
        //vl1 = variável para armazenar o primeiro valor
        //vl2 = variável para armazenar o segundo valor
        //cl = variável para clonagem de um dos valores
        //teclado = variável entrada de dados com o método Scanner
        
        
        System.out.println("Bem vindo!");
        System.out.println("\nEste programa ira trocar os valores das \nduas variaveis informados por voce, usuario!");
        System.out.println("------------------------------------------\n\n");
        
        
        Scanner teclado = new Scanner(System.in);
        int vl1 = lerInt(teclado, "Digite o primeiro valor: ");
        int vl2 = lerInt(teclado, "Informe o segundo valor: ");
        int cl = vl1;
        
        //Sistema de trocas dos valores
        vl1 = vl2;
        vl2 = cl;
        
        System.out.println("    Tabela de Resultados\n\n");//Apresentação de Resultados
        System.out.printf("%-10s | %-10s\n", "Primeiro Valor", "Segundo Valor");
        System.out.printf("%-2s: %-6d | %-10d\n", "Incial", vl2, vl1);
        System.out.printf("%-2s : %-6d | %-10d\n", "Final",vl1, vl2);
        System.out.println("--------------------------");
    }
    
    
    public static int lerInt(Scanner teclado, String mensagem)//Método para validação de entradas do tipo int
    {
        int num;
        
        while(true)//Loop para verificação com certeza de resposta válida
        {
            System.out.println(mensagem);
            String entrada = teclado.nextLine().trim();//Variável para validação da entrada de dados
            
            try{
                num = Integer.parseInt(entrada);
                return num;
            }catch(NumberFormatException e){
                System.out.println("\nEntrada invalida, digite um numero inteiro valido!");
                System.out.println("----------------------------------------------------\n\n");
            }
        }
            
    }
}
