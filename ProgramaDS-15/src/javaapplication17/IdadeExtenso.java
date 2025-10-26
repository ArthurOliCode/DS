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

    public IdadeExtenso(int meses, int anos, int dias) {
        this.meses = meses;
        this.anos = anos;
        this.dias = dias;
    }

    public int getAnos() {
        return anos;
    }

    public void setAnos(int anos) {
        this.anos = TesteEntrada.testInt(teclado, "Insira quantos anos você possue: ");
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        int entrada = TesteEntrada.testInt(teclado, "Insira quantos anos você possue: ");
        if (entrada < 30 && entrada > 0){
            this.dias = entrada;   
        }else{
            System.out.println("Insira uma quantidade de dias válidos entre 1 e 29");
            
        }
    }

    public int getIdadeDias() {
        return IdadeDias;
    }

    public void setIdadeDias(int IdadeDias) {
        this.IdadeDias = IdadeDias;
    }
    
    
}
