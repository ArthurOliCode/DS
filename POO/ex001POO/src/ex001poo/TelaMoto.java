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
public class TelaMoto {
    public static void tela(){
        String continuar = "";
        String respTemp = "";
        Scanner teclado = new Scanner(System.in);
        Moto moto[] = new Moto[1];
        moto[0] = new Moto(0, 0, "", 0, false);
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
                           |   8  Capacete        |
                           |   9  empinar         |
                           |   10  Sair           |
                           ------------------------
                           """);
            
            
            int escolha = ChecagemEntrada.testInt(teclado, "O que deseja fazer: ");
            switch(escolha){
                case 1:
                    respTemp = ChecagemEntrada.testSimNao(teclado, "Deseja ligar a ingnicao do motor? : [s : sim] [n : nao]");
                    if(respTemp.equals("s")){
                        moto[0].ligar();
                    }else{
                        moto[0].desligar();
                    }
                    break;
                case 2:
                    respTemp = ChecagemEntrada.testAceleDesacelerar(teclado, "Deseja Acelerar a moto ou desacelera-lo? : [a : acelerar] [d : desacelerar]");
                    if (respTemp.equals("a")){
                        moto[0].acelerar();
                    }else{
                        moto[0].desacelerar();
                    }
                    break;
                case 3:
                    respTemp = ChecagemEntrada.testSimNao(teclado, "Deseja ligar o farol da moto? : [s : sim] [n : nao]");
                    if (respTemp.equals("s")){
                        moto[0].farolLigado();
                    }else{
                        moto[0].farolDesligado();
                    }
                    break;
                case 4:
                    respTemp = ChecagemEntrada.testSimNao(teclado, "Deseja ligar o pisca alerta da moto? : [s : sim] [n : nao]");
                    if (respTemp.equals("s")){
                        moto[0].piscaAlertaLigado();
                    }else{
                        moto[0].piscaAlertaDesligado();
                    }
                    break;
                case 5:
                    moto[0].setaLigada();
                    break;
                case 6:
                    moto[0].virarDirecao();
                    break;
                case 7:
                    moto[0].buzinar();
                    break;
                case 8:
                    respTemp = ChecagemEntrada.testSimNao(teclado, "Deseja colocar o capacete: [s : sim] [n : nao]");
                    if(respTemp.equals("s")){
                        moto[0].usarCapacete();
                    }else{
                        
                    }
                    break;
                case 9:
                    respTemp = ChecagemEntrada.testSimNao(teclado, "Deseja empinar?: [s : sim] [n : nao]");
                    if(respTemp.equals("s")){
                        moto[0].empinar();
                    }else{
                        
                    }
                    break;
                case 10:
                    continuar = ChecagemEntrada.testSimNao(teclado, "\nVoce deseja continuar: [s : sim] [n : nao]\n");
                    break;
            }
        }
    }
}
