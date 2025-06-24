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
public class TelaOnibus{
    public static void tela(){
        String continuar = "";
        String respTemp = "";
        Scanner teclado = new Scanner(System.in);
        Onibus onibus[] = new Onibus[1];
        onibus[0] = new Onibus(false, "------", 4, false);
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
                           |   8  Abir Embarque   |
                           |   9  Cobrar Passagem |
                           |   10 Elevador        |
                           |   11 identificacao   |
                           |   12 Sair            |
                           ------------------------
                           """);
            
            
            int escolha = ChecagemEntrada.testInt(teclado, "O que deseja fazer: ");
            switch(escolha){
                case 1:
                    respTemp = ChecagemEntrada.testSimNao(teclado, "Deseja ligar a ingnicao do motor? : [s : sim] [n : nao]");
                    if(respTemp.equals("s")){
                        onibus[0].ligar();
                    }else{
                        onibus[0].desligar();
                    }
                    break;
                case 2:
                    respTemp = ChecagemEntrada.testAceleDesacelerar(teclado, "Deseja Acelerar o onibus ou desacelera-lo? : [a : acelerar] [d : desacelerar]");
                    if (respTemp.equals("a")){
                        onibus[0].acelerar();
                    }else{
                        onibus[0].desacelerar();
                    }
                    break;
                case 3:
                    respTemp = ChecagemEntrada.testSimNao(teclado, "Deseja ligar o farol do onibus? : [s : sim] [n : nao]");
                    if (respTemp.equals("s")){
                        onibus[0].farolLigado();
                    }else{
                        onibus[0].farolDesligado();
                    }
                    break;
                case 4:
                    respTemp = ChecagemEntrada.testSimNao(teclado, "Deseja ligar o pisca alerta do onibus? : [s : sim] [n : nao]");
                    if (respTemp.equals("s")){
                        onibus[0].piscaAlertaLigado();
                    }else{
                        onibus[0].piscaAlertaDesligado();
                    }
                    break;
                case 5:
                    onibus[0].setaLigada();
                    break;
                case 6:
                    onibus[0].virarDirecao();
                    break;
                case 7:
                    onibus[0].buzinar();
                    break;
                case 8:
                    respTemp = ChecagemEntrada.testSimNao(teclado, "Deseja abrir o embarque?: [s : sim] [n : nao]");
                    if(respTemp.equals("s")){
                        onibus[0].abrirPortaoTraseiro();
                    }else{
                        onibus[0].fecharPortaoTraseiro();
                    }
                    break;
                case 9:
                    onibus[0].cobrarPassagem(5);
                    break;
                case 10:
                    onibus[0].usarElevadorCadeirante();
                    break;
                case 11:
                    onibus[0].identificacao();
                    break;
                case 12:
                    continuar = ChecagemEntrada.testSimNao(teclado, "\nVoce deseja continuar: [s : sim] [n : nao]\n");
                    break;
            }
        }
    }
}
