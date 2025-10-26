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
        int contM = 0;
        int contT = 0;
        int somaMediaN = 0;
        int somaMediaF = 0;
        int mediaN = 0;
        
        while(contM < getQtdMedias()){
            while(contT < getTermos()){
                int entrada = TesteEntrada.testInt(teclado, "Insira o termo " + (contT + 1) + ":");
                somaMediaN += entrada;
                System.out.println("Termo: " + entrada);
                System.out.println("Soma N " + somaMediaN);
                System.out.println("Cont T " + contT);
                contT++;
            }
            mediaN = somaMediaN / getTermos();
            somaMediaF += mediaN;
            System.out.println("MediaN: " + mediaN);
            System.out.println("Soma N: " + somaMediaN);
            System.out.println("Termos: " + getTermos());
            System.out.println("Cont M:" + contM);
            contM++;
            contT = 0;
            somaMediaN = 0;
        }
        this.media = somaMediaF / getQtdMedias();
    }

    @Override
    public String toString() {
        return "Medias{" + "qtdMedias=" + getQtdMedias() + ", media=" + getMedia() + ", termos=" + getTermos() + '}';
    }
    
    
    
}
