/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programads.pkg7;
import java.util.Scanner;
/**
 *
 * @author arthu_uhkw4r8
 */
public class ProgramaDS7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Teclado = variável para entrada de dados do teclado
        // Num = variálvel para armazenar o primeiro número
        // AnNum = variável que armazenará o número antecessor ao digitado
        
        
        System.out.println("        Bem vindo!");
        System.out.println("Este programa foi feito com o intuito\n de indicar o número antecessor ao informado.");
        System.out.println("---------------------------------------\n\n\n");
        
        
        Scanner teclado = new Scanner(System.in);
        int num = testarInt(teclado, "Digite um numero inteiro valido: ");
        int anNum = num - 1;
        System.out.println("    Tabela de dados");
        System.out.printf("%-10s | %-10s\n", "Numero", "Antecessor" );
        System.out.println("-------------------------");
        System.out.printf("%-10d |  %-10d\n", num, anNum);
        System.out.println("------------------------\n\n");
    }
    
    
    public static int testarInt(Scanner teclado, String msg)
    {
        int num;// Variável para retorno de valor
        while(true)
        {
            System.out.println(msg);
            String entrada = teclado.next();// Variável para validação de entrada

            try{
                num = Integer.parseInt(entrada);
                return num;
            }
            catch(NumberFormatException e){
                System.out.println("Erro! Por favor, insira um numero inteiro valido...");
                System.out.println("-----------------------------------------------------\n\n\n");
            }
        }
        
    }
}
