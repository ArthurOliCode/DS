/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programads.pkg8;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author arthu_uhkw4r8
 */
public class ProgramaDS8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* 
        dataAtual = variável para armazenar a data atual do sistema
        teclado = variável para armazenar a entrada de dados
        aNas = variável para guardar o ano de nascimento do usuário
        mNas = Mês de nascimento
        dNas = Dia de nascimento
        dataAtual = Data do sistema
        sAno = Ano atual do sistema
        sMes = Dia atual do sistema
        sDias = Dia atual do sistema
        anos = Anos de vida do indivíduo
        DMes = Diferencial entre mês de nascimento e mês atual
        Ddia = Diferencial entre o dia de nascimento, e o atual
        idAnos = idade do usuário em anos
        id = idade do usuário em dias

        */
        
        System.out.println("     Bem Vindo!");
        System.out.println("Neste progrma, sera calculado a idade de um usuario\n informada em ano, meses e dias, agrupando todos os\n dados totalizados em dias de vida.");
        System.out.println("---------------------------------------------------\n\n");
        
        
        LocalDate dataAtual = LocalDate.now();
        Scanner teclado = new Scanner(System.in);
        
        int sAno = dataAtual.getYear();
        int sMes = dataAtual.getMonthValue();
        int sDia = dataAtual.getDayOfMonth();
        int aNas = testarInt(teclado, "Informe seu ano de nascimento: ");
        int mNas = testarInt(teclado, "Informe seu mes de nascimento: ");
        int dNas = testarInt(teclado, "Digite o dia em que nasceu: ");
        int idAnos = sAno - aNas;
        int dMes = (sMes - mNas);
        int dDia = (sDia - dNas);
        
        if( dMes >= 0 &&  dDia >= 0)
        {
            idAnos += 1;
        }else{
            idAnos -= 1;
        }
        
        dMes = dMes * -1;
        dDia = dDia * -1;
        int id = (idAnos * 365) + (dMes * 30) + dDia;
        
        System.out.printf("%-13s Tabela de Dados\n", "");
        System.out.println("------------------------------------------------------\n");
        System.out.printf("%-12s %-15s | %-15s | %-15s\n","",  "Ano", "Mes", "Dia");
        System.out.printf("%-2s : %-15d | %-15d | %-15d\n", "Nascimento", aNas, mNas, dNas);
        System.out.printf("%-2s : %-15d | %-15d | %-15d\n", "Atualmente", sAno, sMes, sDia);
        System.out.printf("%-10s : %-15d | %-15d | %-15d\n", "Idade", idAnos, sMes, sDia);
        System.out.printf("%-10s : %-2d dias\n\n", "Dias", id);
        System.out.println("------------------------------------------------------");
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
