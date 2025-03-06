/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programads.pkg6;

import java.util.Scanner;

/**
 *
 * @author arthu_uhkw4r8
 */
public class ProgramaDS6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        entrada = Variável para realizar o tratamento de possíveis erros de entrada de dados
        esc = variável para escolha entre gasolina ou álcool para a realização dos calcúlos
        pComb = variável para guardar o preço do combustível
        dis = variável para a distância do trajeto que será feito
        lKm = gasto de combustível em litros por kilômetro
        lTot = total de combustível gasto
        pTot = preço total sobre o gasto de litro por todo o trajeto
        */
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Bem vindo!\n");
        System.out.println("Este programa ira realizar calculos sobre o preço\ndo gasto do gasto medio de combustivel por Km");
        System.out.println("----------------------------------------------");
        
        
        System.out.println("Qual combustivel sera utilizado para o calculo: (a/alcool) (g/gasolina)");
        String esc = teclado.next().substring(0, 1).toLowerCase();
        while(!esc.equals("a") && !esc.equals("g"))//loop com  condição para validação da entrada de dados da variável esc
        {
            System.out.println("\nErro! Por favor, digite uma das opcoes acima!");
            esc = teclado.next().substring(0, 1).toLowerCase();
        }
        
        
        
        if(esc.equals("a"))//estrutura de condição para as duas possíveis escolhas
        {
           float dis = tratarFloat(teclado, "Digite a distancia do trajeto que sera percorrido: ");
           float lKm = tratarFloat(teclado,"Informe o consumo medio de combustivel de L/Km: ");
           float pComb = tratarFloat(teclado, "Informe o preco unitario do litro do alcool: ");
           
           float lTot = dis / lKm;
           float pTot = lTot * pComb;
          
           
           System.out.println("\n\n    Tabela de dados");//Apresentação de resultados
           System.out.printf("%-10s | %-10s | %-10s\n", "Distancia", "Consumo medio", "Preco Unitario");
           System.out.printf("%-10.2f | %-13.2f | %-10.2f\n", dis, lKm, pComb);
           System.out.println("\n   --------------------------  \n");
           System.out.printf("%-10s | %-10s\n", "Combustivel gasto", "Preco total");
           System.out.printf("%-17.2f | %-10.2f\n", lTot, pTot);
           System.out.println("---------------------------------\n\n");
           
        }else
        {
            System.out.println("escolheu g");
        }
    }
    
    
    
    
    public static float tratarFloat(Scanner teclado, String mensagem)//Método para validar entradas do tipo float
    {
        float num;
        while(true)
        {
            System.out.println(mensagem);
            String entrada = teclado.next();//Variável para tratamento de erro
            
            try
            {
             num = Float.parseFloat(entrada);
             return num; //Retorno de um número válido, e término do método
            }catch(NumberFormatException e)
            {
                System.out.println();
            }
        }
    }
}
