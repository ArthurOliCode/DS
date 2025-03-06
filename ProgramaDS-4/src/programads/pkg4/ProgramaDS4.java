/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programads.pkg4;

import java.util.Scanner;
/**
 *
 * @author arthu_uhkw4r8
 */
public class ProgramaDS4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //teclado = variável para armazenar valor de entrada do teclado do usuário
        //b = variável para valor da base do retângulo
        //h = variável para valor da altura
        //a = valor da área do retângulo
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.printf("%-10s \n", "     Bem vindo!");
        System.out.println("\n\nEste programa ira analisar os dados informados sobre a base e \naltura de um retangulo, e apresentara os resultados ao final do programa\n\n");
        System.out.println("\n\n----------------------------------------------------------\n\n");
        
        
        System.out.println("Informe o valor da base do retangulo: ");
        float b = teclado.nextFloat();
        System.out.println("Informe o valor da altura: ");
        float h = teclado.nextFloat();
        
        float a = b * h;
        
        System.out.printf("\n\n\n%-10s\n\n", "Tabela de Resultados");
        System.out.println("-----------------------------------");
        System.out.printf("%-10s %-10s\n", "base", "altura");
        System.out.printf("%-10.2f %-10.2f\n", b, h);
        System.out.printf("%-10s\n", "Area do retangulo");
        System.out.printf("%-10.2f\n", a);
        System.out.println("-----------------------------------");
    
    
    }
    
}
