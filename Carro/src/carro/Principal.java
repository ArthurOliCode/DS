/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carro;
import java.util.Scanner;
/**
 *
 * @author CAMARGO
 */

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaração de váriavel para modelos de carro
        Carro [] carro;
        carro = new Carro[3];
        carro[0] = new Carro(0, 0);
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("---------------------------------");
        System.out.println("            Bem Vindo");
        System.out.println("---------------------------------\n\n");

        carro[0].setVelocidade(testInt(teclado, "Digite o valor para a velocidade do carro: "));
        carro[0].setPrecoAno1(75480.32);
        carro[0].setPrecoAno2(93682.53);
        carro[0].setPrecoAno3(123405.29);
        
        carro[0].calcularMenorPreco(carro[0].getPrecoAno1(), carro[0].getPrecoAno2(), carro[0].getPrecoAno3());
        carro[0].calcularMaiorPreco(carro[0].getPrecoAno1(), carro[0].getPrecoAno2(), carro[0].getPrecoAno3());
        
        carro[0].toString();
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
        public static double testDouble(Scanner teclado, String msg){
            double num;

            while(true){ 
                try{
                    System.out.println(msg);
                    String entrada = teclado.next();

                    num = Double.parseDouble(entrada);
                    return num;

                }catch(NumberFormatException e){
                    System.out.println("\n\nEntrada invalida, por favor, insira um numero inteiro valido");
                    System.out.println("--------------------------------------------------------\n\n");
                }
            }
        }
}
