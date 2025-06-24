/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex001poo;
import java.util.Scanner;
/**
 *
 * @author CAMARGO
 */
public class Ex001POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String resp = "";
        Scanner teclado = new Scanner(System.in);
        
        while(!resp.equals("n")){
            System.out.println("\n\n    Bem vindo");
            System.out.println("------------------------");
            System.out.println("|   1  Carro           |");
            System.out.println("|   2  Moto            |");
            System.out.println("|   3  Onibus          |");
            System.out.println("|   4  sair            |");
            System.out.println("------------------------");
            
            int escolha = ChecagemEntrada.testInt(teclado, "Escolha sua opcao de automovel: ");
            switch(escolha){
                case 1:
                    TelaCarro.tela();
                    break;
                case 2:
                    TelaMoto.tela();
                    break;
                case 3:
                    break;
                default:
                    resp = ChecagemEntrada.testSimNao(teclado, "Deseja Continuar? : ");
                    break;
            }
        }
        
    }
    
}
