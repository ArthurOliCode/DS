/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programads.pkg1;

import java.util.Scanner;
/**
 *
 * @author arthu_uhkw4r8
 */
public class ProgramaDS1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //teclado = váriavel para input
        //num1 = Primeiro número digitado pelo usuário
        //num2 = Segundo número digitado
        //soma = Soma entre os valores
        //mult = Multiplicação entre os valores
        //mai = Verificação de qual número é maior entre os valores digitados
        //men = Verificação de qual número é menor entre os valores digitados
        //div = Divisão entre os números informados

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Bem vindo ao sistema");
        System.out.println("-- Voce ira digitar dois numeros\n inteiros, e o programa ira realizar\n diversas operacoes aritmeticas\n\n");
        System.out.println("--------------------\n\n");
        
        System.out.println("Digite o primeiro numero: ");
        int num1 = teclado.nextInt();
        System.out.println("Digite o segundo numero: ");
        int num2 = teclado.nextInt();
        
        int soma = num1 + num2;
        int mult = num1 * num2;
        int mai = num1 > num2 ? num1:num2;
        int men = num1 < num2 ? num1:num2;
        int div = mai / men;
        
        System.out.println("    ------Resultados-----\n");        
        System.out.printf("|Numero 1: %d | Numero 2: %d|\n", num1, num2);
        System.out.printf("|Soma : %d                  |\n", soma);
        System.out.printf("|multiplicacao : %d        |\n", mult);
        System.out.printf("|Divisao: %d                 |\n", div);
        System.out.println("--------------------------\n");
    }
    
}
