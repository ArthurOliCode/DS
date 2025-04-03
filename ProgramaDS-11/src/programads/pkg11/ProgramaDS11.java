/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programads.pkg11;
import java.util.Scanner;

/**
 *
 * @author AthurOliCode
 */
public class ProgramaDS11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
         teclado = variável para entrada de dados
         custCar = custo bruto do carro
         pDist = Percentual do distribuidor
         pImpos = Percentual de imposto
         cConsu = Valor final para o consumidor

        */
        
        
        // Apresentação inicial
        System.out.println("    Bem vindo!");
        System.out.println("""
                           Este programa ira calcular o custo de um carro considerando
                           o custo de fabrica e, distribuidos. Os dados serao apresentados
                           ao final do programa.
                           """);
        System.out.println("\n\n");
        
        
        // Valores iniciais
        Scanner teclado = new Scanner(System.in);
        
        float pDis = 28;
        float pImpos = 45;
        
        System.out.println("\nInforme a marca do automovel:");
        String marcaCar = teclado.next();
        System.out.println("\nInforme o modelo do carro:");
        String modeloCar = teclado.next();
        
        float custCar = testeFloat(teclado, "\nInforme por favor, o custo de fabrica do carro desejado: ");
        
        
        System.out.printf("Imposto Dis : %.2f", pDis);
        System.out.printf("Imposto Impos : %.2f", pImpos);
        
        
        // Valor final
        float cConsu = custCar + (custCar * (pImpos / 100)) + (custCar * (pDis / 100));
        
        
        // Tabela de resultados
        
        System.out.printf("\n\n%-20s Tabela de Resultados\n\n", " ");
        System.out.println("--------------------------------------------------------------");
        System.out.printf("%-5s %-10s | %-10s | %-10s | %-10s \n", "", "Marca", "Modelo","Custo Base", "Preco Final");
        System.out.println("--------------------------------------------------------------");
        System.out.printf("%-5s %-10s | %-10s | %-10.2f | %-10.2f \n", "", marcaCar, modeloCar, custCar, cConsu);
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
