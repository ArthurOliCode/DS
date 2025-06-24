/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex001poo;
import java.util.Scanner;
/**
 *
 * @author arthu_uhkw4r8
 */
public class TelaCarro {
    public static void tela(){
        String continuar = "";
        String respTemp = "";
        Scanner teclado = new Scanner(System.in);
        Carro carro[] = new Carro[1];
        carro[0] = new Carro(0, 0, "", 0, false);
        while(!continuar.equals("n")){
            System.out.println("""
                           ------------------------
                           |   1  Ingnicao        |
                           |   2  Velocidade      |
                           |   3  Farol           |
                           |   4  Pisca Alerta    |
                           |   5  Seta            |
                           |   6  Direcao         |
                           |   7  Buzinar         |
                           |   8  Porta-Malas     |
                           |   9  Ar condicionado |
                           |   10  Sair            |
                           ------------------------
                           """);
            
            
            int escolha = ChecagemEntrada.testInt(teclado, "O que deseja fazer: ");
            switch(escolha){
                case 1:
                    respTemp = ChecagemEntrada.testSimNao(teclado, "Deseja ligar a ingnicao do motor? : [s : sim] [n : nao]");
                    if(respTemp.equals("s")){
                        carro[0].ligar();
                    }else{
                        carro[0].desligar();
                    }
                    break;
                case 2:
                    respTemp = ChecagemEntrada.testAceleDesacelerar(teclado, "Deseja Acelerar o carro, ou desacelera-lo? : [a : acelerar] [d : desacelerar]");
                    if (respTemp.equals("a")){
                        carro[0].acelerar();
                    }else{
                        carro[0].desacelerar();
                    }
                    break;
                case 3:
                    respTemp = ChecagemEntrada.testSimNao(teclado, "Deseja ligar o farol do carro? : [s : sim] [n : nao]");
                    if (respTemp.equals("s")){
                        carro[0].farolLigado();
                    }else{
                        carro[0].farolDesligado();
                    }
                    break;
                case 4:
                    respTemp = ChecagemEntrada.testSimNao(teclado, "Deseja ligar o pisca alerta do carro? : [s : sim] [n : nao]");
                    if (respTemp.equals("s")){
                        carro[0].piscaAlertaLigado();
                    }else{
                        carro[0].piscaAlertaDesligado();
                    }
                    break;
                case 5:
                    carro[0].setaLigada();
                    break;
                case 6:
                    carro[0].virarDirecao();
                    break;
                case 7:
                    carro[0].buzinar();
                    break;
                case 8:
                    respTemp = ChecagemEntrada.testPortaMalas(teclado, "Deseja abrir ou fechar o porta-malas?: [a : abrir] [f : fechar]");
                    if(respTemp.equals("a")){
                        carro[0].abrirPortaMalas();
                    }else{
                        carro[0].fecharPortaMalas();
                    }
                    break;
                case 9:
                    respTemp = ChecagemEntrada.testSimNao(teclado, "Deseja ligar o ar condicionado?: [s : sim] [n : nao]");
                    if(respTemp.equals("s")){
                        carro[0].ligarArCondicionado();
                    }else{
                        carro[0].desligarArCondicionado();
                    }
                    break;
                case 10:
                    continuar = ChecagemEntrada.testSimNao(teclado, "\nVoce deseja continuar: [s : sim] [n : nao]\n");
                    break;
            }
        }
    }
}
