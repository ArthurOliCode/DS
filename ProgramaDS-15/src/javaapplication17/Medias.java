/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication17;
import java.util.Scanner;

/**
 *
 * @author ArthurOliCode
 */
public class Medias {
    Scanner teclado = new Scanner(System.in);
    int qtdMedias;
    int media;
    int termos;

    public Medias() {
        TesteEntrada.titulo("Bem vindo ao calculo de media entre medias!");
        setTermos();
        setQtdMedias();
        setMedia();
    }

    public int getTermos() {
        return termos;
    }

    public void setTermos() {
        int entrada = TesteEntrada.testInt(teclado, "Insira quantos termos em cada uma das medias voce gostaria de ter: ");
        if (entrada > 0){
            this.termos = entrada;
        }else{
            System.out.println("Insira uma quantidade valida de termos! ");
        }
        
    }

    public int getQtdMedias() {
        return qtdMedias;
    }

    public void setQtdMedias() {
        int entrada = TesteEntrada.testInt(teclado, "Insira quantas medias você gostaria de realizar: ");
        if(entrada > 0){
            this.qtdMedias = entrada;
        }else{
            System.out.println("Digite um numero valido maior que 0");
        }
    }

    public int getMedia() {
        return media;
    }

    public void setMedia() {
        // Variáveis para o controle de loop
        int contM = 0; // Cont Médias
        int contT = 0; // Cont Termos
        int somaMediaN = 0; // Soma média genérica
        int somaMediaF = 0;
        int mediaN = 0;
        
        // Loop para qtd de médias
        while(contM < getQtdMedias()){
            while(contT < getTermos()){
                int entrada = TesteEntrada.testInt(teclado, "Insira o termo " + (contT + 1) + ":");
                somaMediaN += entrada;
                contT++;
            }
            // Calculo da média genérica
            mediaN = somaMediaN / getTermos();
            somaMediaF += mediaN;
            contM++;
            // Reset das variáveis dentro do loop de Termos
            contT = 0;
            somaMediaN = 0;
        }
        // Cálculo da média final
        this.media = somaMediaF / getQtdMedias();
    }

    @Override
    public String toString() {
        return "Medias{" + "qtdMedias=" + getQtdMedias() + ", media=" + getMedia() + ", termos=" + getTermos() + '}';
    }
    
    
    
}
