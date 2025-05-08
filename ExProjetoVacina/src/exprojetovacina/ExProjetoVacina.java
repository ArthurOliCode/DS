/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exprojetovacina;
import java.util.Scanner;

/**
 *
 * @author 
 * ArthurOliCode
 * Aquiles Jedi
 * Felpzeira16
 */
public class ExProjetoVacina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String resposta = "";
        int valorG = 0;
        int contador = 0;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("----------------");
        System.out.println("   Bem vindo");
        System.out.println("----------------");
        
        int tam = testeInt(teclado, "Digite o tamanho do genes a ser analisado");
        int arranjo[] = new int[tam];
        
        for(int i = 0; i < tam; i++){
            if(tam >= 0){
                int gene = testeInt(teclado, "digite o gene: ");
                arranjo[i] = gene;
            }else{
                
                System.out.println("Erro! Digite mais de digitos");
            } 
        }
        
        
        valorG = arranjo[tam - 1];
        
        for (int i = 0; i < tam - 1; i++) { 
            if (arranjo[i] == valorG) {
                contador++;
            }
        }


        System.out.printf("\n\n%-20s Tabela de Resultados\n\n", " ");
        System.out.printf("Resultado: ");
        if (contador == 1) {
            System.out.println("Ainda não é o suficiente!");
        } else if (contador >= 2) {
            System.out.println("Achei o danado!");
        } else {
            System.out.println("Sumiu!");
        }
        System.out.printf("Arranjo: ");
        
        for(int i = 0; i < tam; i++){
            System.out.printf("[" + arranjo[i] +"]");
        }     
    }
    
    public static int testeInt(Scanner teclado, String msg){
            int num;

            while(true){

                System.out.println(msg);
                String entrada = teclado.next();

                try{
                    num = Integer.parseInt(entrada);
                    return num;
                }
                catch(NumberFormatException e){
                    System.out.println("\n\nErro! Por favor digite um valor valido!");
                    System.out.println("----------------------------------------\n\n");
                }
            }
    }
    
}
