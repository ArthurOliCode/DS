/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programads.pkg2;

import java.util.Scanner;
/**
 *
 * @author arthu_uhkw4r8
 */
public class ProgramaDS2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // var dis = distância percorrida pelo veículo
        // var comb = combustível gasto 
        // var lKm = quantidade de listros por quilômetro
        // var teclado = variável para entrada de dados do usuário
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("---------Bem Vindo---------");
        System.out.println("Neste programa voce ira digitar\n o tamananho do trajeto percorrido\n em Km, além de também, digitar o combustivel\n gasto durante o trajeto.\n");
        System.out.println("-------------------------------\n\n");
        
        System.out.println("Digite o tamanho do trajeto em Km: ");
        float dis = teclado.nextFloat();
        System.out.println("Digite a quantidade de combustivel gasto: ");
        float comb = teclado.nextFloat();
        
        float lKm = comb/dis;
        
        System.out.println("Tabela de dados: ");
        System.out.printf("%-10s | %-10s\n", "Distancia(Km)", "combustivel(L)");
        System.out.printf("%-10.2f | %-10.2f\n", dis, comb);
        System.out.printf("Media: %.2f L/Km\n", lKm);
        System.out.println("----------------------------------\n\n");
    }
    
}
