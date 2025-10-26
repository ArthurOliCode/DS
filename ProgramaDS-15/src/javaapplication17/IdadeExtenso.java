/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication17;
import java.util.Scanner;

/**
 *
 * @author arthu_uhkw4r8
 */
public class IdadeExtenso {
    Scanner teclado = new Scanner(System.in);
    TesteEntrada testes = new TesteEntrada();
    int meses;
    int anos;
    int dias;
    int IdadeDias;

    public IdadeExtenso() {
        System.out.println("\n\n Bem vindo!");
        TesteEntrada.titulo("Indentifique quantos dias totais voce possue!");
        
        setAnos(anos);
        setMeses(meses);
        setDias(dias);
        setIdadeDias(getDias(), getMeses(), getAnos());
    }

    public int getMeses() {
        return meses;
    }

    public void setMeses(int entrada) {
        entrada = TesteEntrada.testInt(teclado, "Insira quantos meses voce possue: ");
        if (entrada >= 0 && entrada <= 12){
            this.meses = entrada;
        }
        
    }

    public int getAnos() {
        return anos;
    }

    public void setAnos(int entrada) {
        entrada = TesteEntrada.testInt(teclado, "Insira quantos anos voce possue: ");
        if (entrada <= 120 && entrada >= 0){
            this.anos = entrada ;
        }else{
            System.out.println("Insira uma quantidade válida de anos entre 0 e 120");
        }
        
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int entrada) {
        entrada = TesteEntrada.testInt(teclado, "Insira quantos dias voce possue: ");
        if (entrada < 30 && entrada >= 0){
            this.dias = entrada;   
        }else{
            System.out.println("Insira uma quantidade de dias válidos entre 0 e 29");
        }
    }

    public int getIdadeDias() {
        return IdadeDias;
    }

    public void setIdadeDias(int dias, int meses, int anos) {
        meses *= 30;
        anos *= 365;
        int idadeExtenso = dias + meses + anos;
        this.IdadeDias = idadeExtenso;
    }

    @Override
    public String toString() {
        return "IdadeExtenso{" + "meses=" + meses + ", anos=" + anos + ", dias=" + dias + ", IdadeDias=" + IdadeDias + '}';
    }
    
    
    
}
