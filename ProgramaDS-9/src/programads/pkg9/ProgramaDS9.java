/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package programads.pkg9;
import java.util.Scanner;

/**
 *
 * @author CAMARGO
 */

public class ProgramaDS9 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        /*
          teclado = variável para entrada de dados
          munic = variável para informar o município 
          totEle = Total de eleitores
          vBran = Votos em branco
          vNull = votos núlos
          vVal = votos válidos
          pBran = percentual de votos em branco
          pNull = percentual de votos núlos
          pVal = percentual de válidos
          
        */
        
        System.out.printf("%-10s Bem vindo!\n\n", " ");
        System.out.println("""
                           Este programa ira coletar dados de uma eleicao e 
                           ira apresentar uma coletanea de informacoes ao final.
                           """);
        System.out.println("\n\n");
        
        // Declaração de variáveis iniciais
        Scanner teclado = new Scanner(System.in);
        int totEle = testarInt(teclado, "informe o numero total de votos: ");
        int vBran = testeVot(totEle, "Digite a quantiadade de votos em Branco: ", teclado);
        int vNull = testeVot(totEle, "Informe a quantiadade de votos Nulos: ", teclado);
        int vVal = totEle - (vBran + vNull);
        
        // Declaração das porcentagens
        float pBran = (vBran * 100) / totEle;
        float pNull = (vNull * 100) / totEle;
        float pVal = (vVal * 100) / totEle;
        
        
        
        // Apresentação de dados
        System.out.printf("%-10s Tabela de Informacoees", " ");
        System.out.printf("%-10s: %-10s | %-10s | %-10s \n\n", "Votos", "Brancos", "Nulos", "Validos");
        System.out.printf("%-10d | %-10d | %-10d | %-10d \n\n", totEle, vBran, vNull, vVal);
        System.out.println("----------------------------------------");
        System.out.printf("%-10s Porcentagens\n", "");
        System.out.printf("%-10d | %-10.1f | %-10.1f | %-10.1f \n\n", totEle, pBran, pNull, pVal);
        System.out.println("---------------------------------------");
        
        
    }
    
    // Metódo para validar a entrada de dados inteiros
    public static int testarInt(Scanner teclado, String msg){
        int num;
        
        while(true){
            System.out.println(msg);
            String entrada = teclado.next();
            
            try{
                num = Integer.parseInt(entrada);
                return num;
                
            }catch(NumberFormatException e){
                
            }
        }
    }
    
    // Metódo para válidar a quantidade cada tipo de voto em relação ao total
    public static int testeVot(int totVotos, String msg, Scanner teclado){
        
        int votos;
        
        
        while(true){
            
            votos = testarInt(teclado, msg);
            
            if (votos > totVotos || votos < 0){
                System.out.println("\nEntrada invalida, por favor digite corretamente!");
                System.out.println("------------------------------------------------\n\n\n");
            }else{
                return votos;
            }
        }
        
    }
}
