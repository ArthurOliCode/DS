/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex001poo;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CAMARGO
 */
public class Moto extends Automovel{

    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
    
/**
 *
 * @author CAMARGO
 */

    private boolean ligado;
    private int velocidade;
    private int ano;
    private String marca;
    private float combus;
    private int rodas;
    private float peso;
    private float valor;
    private boolean farol;
    private boolean piscaA;
    private String direcao;
    private boolean seta; 
    private Scanner teclado = new Scanner(System.in);
    private boolean pedal;

    public boolean isPedal() {
        return pedal;
    }

    public void setPedal(boolean pedal) {
        this.pedal = pedal;
    }

    public Moto(int velocidade, int ano, String marca, float combus, boolean ingnicao) {
        setVelocidade(velocidade);
        setAno(ano);
        setMarca(marca);
        setLigado(ligado);
        this.combus = combus;
    }

    
    
    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    
    
    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    
    
    public float getCombus() {
        return combus;
    }

    public void setCombus(float combus) {
        this.combus = combus;
    }

    
    
    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    
    
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    
    
    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    
    public String getDirecao() {
        return direcao;
    }

    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }

    
    public boolean isFarol() {
        return farol;
    }

    public void setFarol(boolean farol) {
        this.farol = farol;
    }

    
    
    public boolean isPiscaA() {
        return piscaA;
    }

    public void setPiscaA(boolean piscaA) {
        this.piscaA = piscaA;
    }
  
    
    
    public boolean isSeta() {
        return seta;
    }

    public void setSeta(boolean seta) {
        this.seta = seta;
    }
    
    
    
    @Override
    public void ligar() {
        setLigado(true);
        System.out.println("\nCarro ligado...\n\n");
    }

    @Override
    public void desligar() {
        setLigado(false);
    }
    
    @Override
    public void acelerar() {
        if (isLigado()){
            int vel = testInt(teclado, "\n\nDigite um valor valido para a aceleracao: ");
            if (getVelocidade() >= 0 && vel > 0){
                setVelocidade(getVelocidade() + vel);
                System.out.printf("\nA velocidade atual é %skm/h\n\n", getVelocidade());
            }
        }else{
            System.out.println("E necessario primeiramente ligar a ingnicao do motor!\n");
        }
        
        
    }

    @Override
    public void desacelerar() {
        if (isLigado()){
            int vel = testInt(teclado, "\n\nDigite um valor valido para desacelerar a moto: ");
            if (getVelocidade() >= 0 && vel > 0){
                if (getVelocidade() - vel >= 0){
                    setVelocidade(getVelocidade() - vel);
                    System.out.printf("\nA velocidade atual é %skm/h\n\n", getVelocidade());
                }else{
                    setVelocidade(0);
                }
            }
        }else{
            System.out.println("E necessario primeiramente ligar a ingnicao do motor!\n");
        }
        
    }
    
    
    @Override
    public void farolLigado() {
        if (isLigado()){
            if (!isFarol()){
                setFarol(true);
                System.out.println("\n\nLigando os farois: \n\n");
                for (int c = 0; c < 2; c++){
                    if(c == 0){
                       System.out.println("  o___o ");
                       wait(200);
                       System.out.println(" -- I  ");
                       wait(200);
                       System.out.println("o   o");
                       wait(200);
                   }else{
                       System.out.println("  o___o - -");
                       wait(200);
                       System.out.println(" --`I  ``");
                       wait(200);
                       System.out.println("o   o    ``");
                       wait(200);
                   }
                    wait(600);

                }
            }else{
                System.out.println("O farol já esta desligado! \n\n");
            }
        }else{
            System.out.println("E necessario primeiramente ligar a ingnicao do motor!\n\n");
        } 
    }

    @Override
    public void farolDesligado() {
        if(isLigado()){
            if(isFarol()){
                System.out.println("\n\nDesligando os farois: \n\n");
               for(int c = 0; c < 2; c++){
                   if(c == 0){
                       System.out.println("  o___o - -");
                       wait(200);
                       System.out.println(" --`I  ``");
                       wait(200);
                       System.out.println("o   o    ``");
                       wait(200);
                   }else{
                       System.out.println("  o___o ");
                       wait(200);
                       System.out.println(" -- I  ");
                       wait(200);
                       System.out.println("o   o");
                       wait(200);
                   }
                   
               }
            }else{
                System.out.println("O farol ja esta desligado!\n\n");
            }
        }else{
            System.out.println("E necessario primeiramente ligar a ingnicao do motor!\n\n");
        } 
        
    }

    @Override
    public void piscaAlertaLigado() {
        if(isLigado()){
            if (!isPiscaA()){
                System.out.println("\n\nLigando o pisca alerta: \n");

                System.out.println("  /\\");
                wait(600);
                System.out.println(" // \\");
                wait(600);
                System.out.println("//   \\");
                wait(600);
                System.out.println("-------");
                setPiscaA(true);
            }
        }else{
            System.out.println("E necessario primeiramente ligar a ingnicao do motor!\n\n");
        } 
        
    }

    @Override
    public void piscaAlertaDesligado() {
        if (isLigado()){
            if (isPiscaA()){
                System.out.println("\n\nDesligando o pisca alerta: \n");
                for(int c = 0; c <= 4; c++){
                    if (c == 0){
                        System.out.println("  /\\");
                        wait(100);
                        System.out.println(" // \\");
                        wait(100);
                        System.out.println("//   \\");
                        wait(100);
                        System.out.println("------- \n");
                    }else if(c == 1){
                        System.out.println("  /\\");
                        wait(100);
                        System.out.println(" // \\");
                        wait(100);
                        System.out.println("//   \\ \n");
                        wait(100);
                    }else if(c == 2){
                        System.out.println("  /\\");
                        wait(100);
                        System.out.println(" // \\ \n");
                        wait(100);
                    }else if(c == 3){
                        System.out.println("  /\\ \n");
                        wait(100);
                    }else{
                        System.out.println("Pisca alerta desligado!\n\n");
                    }

                    setPiscaA(false);
                }
            }
        }else{
            System.out.println("E necessario primeiramente ligar a ingnicao do motor!\n\n");
        } 
        
    }

    @Override
    public void virarDirecao() {
       if (isLigado()){
           System.out.println("\n\nVoce deseja virar para qual direcao: [d: direita] [e: esquerda]");
           String direc = teclado.next().strip().substring(0, 1).toLowerCase();
           if(getDirecao() == null){
               System.out.println("Voce nao acionou a seta antes de virar! Atente-se mais a sinalizacao!!");
           }else if(!direc.equals(getDirecao())) {
               System.out.println("A direcao que você deseja virar, esta diferente da direcao dada pela seta! Tome cuidado!");
           }else while(!getDirecao().equals("d") && !getDirecao().equals("e")){
               System.out.println("\nDigite corretamente a direcao: [d: direita] [e: esquerda]");
               direc = teclado.next().strip().substring(0, 1).toLowerCase();
               setDirecao(direc);
           }
           if (direc.equals("d")){
               System.out.println(" \n\n ");
               System.out.println("Virando a moto para a direita...");
               System.out.println("---------> ");
               wait(1000);
               System.out.println("\n\nVoltando a direcao da moto para neutra...");
               System.out.println("<---------\n\n");
           }else{
               System.out.println("\n\n");
               System.out.println("Virando a moto para a esquerda...");
               System.out.println("<---------");
               wait(1000);
               System.out.println("Voltando a direcao da moto para neutra....");
               System.out.println("--------->\n\n");
           }
       }else{
           System.out.println("E necessario primeiramente ligar a ingnicao do motor!\n");
       }
    }

    @Override
    public void setaLigada() {
        if (isLigado()){
            System.out.println("\n\nQual direcao ira virar: [d: direita] [e: esquerda]");
            String direc = teclado.next().strip().substring(0, 1).toLowerCase();
            setDirecao(direc);
            while (!direc.equals("d") && !direc.equals("e")){
               System.out.println("Digite corretamente a direcao: [d: direita] [e: esquerda]");
               direc = teclado.next();
            }
            if (direc.equals("d")){
                System.out.println(" \n\n ");
                System.out.println("  /");
                System.out.println(" /");
                System.out.println("---> ");
                System.out.println(" `");
                System.out.println("  `");
                wait(1000);
                System.out.println("\n\nDesligando a seta...\n\n");
                wait(800);
           }else{
                System.out.println("\n\n");
                System.out.println("`");
                System.out.println(" `");
                System.out.println("<---");
                System.out.println(" /");
                System.out.println("/");
                wait(1000);
                System.out.println("\n\nDesligando a seta....\n\n");
                wait(800);
           }
        }else{
            System.out.println("E necessario primeiramente ligar a ingnicao do motor!\n\n");
        }
    }

    @Override
    public void buzinar() {
        if (isLigado()){
            int miliSegundos = testInt(teclado, "\n\nQuantos segundos voce deseja continuar buzinando: ") * 1000;
            System.out.println("\nBi-bi!!\n\n");
            wait(miliSegundos);
        }else{
            System.out.println("E necessario primeiramente ligar a ingnicao do motor!\n\n");
        }
    }
    
    public void pedal(boolean estacionar){
        if(isLigado()){
            if(estacionar){
                System.out.println("Descendo o pedal....");
                wait(1000);
                System.out.println("    \\");
                wait(500);
                System.out.println("/---==O");
                wait(500);
                System.out.println(" O /  O");
                wait(500);
            }else{
                System.out.println("\nÉ necessário que a moto esteja devidamente estacionada!\n\n");
            }
        }else{
            System.out.println("\nE necessario primeiramente ligar a ingnicao do motor!\n\n");
        }
        
    }
    
    
    public void usarCapacete() {
        String[] frames = {
            "  _______      \n/       \\    \n|         |   \n \\_______/    ",  // Capacete suspenso
            "    |          \n  __|__       \n /_____\\      \n|  O O  |     ",  // Descendo
            "  .-----._     \n /  o o  \\    \n|    ∆    |   \n \\_______/    ",  // Quase encaixado
            "  ___________  \n /  HELMET  \\ \n|   SAFETY   |\n \\___________/"   // Capacete ajustado :cite[3]
        };
        for (String frame : frames) {
            System.out.println(frame);
            wait(300);
        }
        System.out.println("Capacete seguro! ?️");
    }
    
    
    public void empinar() {
        String[] frames = {
            "   ____        \n _/____\\_      \n()  ||  ()     \n    oo         ",  // Posição inicial
            "   ____        \n _/    \\_      \n()  ||  ()     \n   /  \\        \n  o    o       ",  // Inclinação 25°
            "   ____        \n /     \\       \n()  ||  ()     \n  /    \\       \n o      o      ",  // Inclinação 45° :cite[2]
            "  ____         \n /    \\        \n() || ()       \n /      \\      \no        o     ",  // Inclinação 70°
            "  _            \n / \\_          \n() | ()        \n/       \\_     \no         o    "   // Wheelie completo (~90°)
        };
        for (String frame : frames) {
            System.out.println(frame);
            wait(400);
        }
        System.out.println("empinando!");
    }
    
    
    public static int testInt(Scanner teclado, String msg){
        int num;
        
        while(true){ 
            try{
                System.out.println(msg);
                String entrada = teclado.next();
                
                num = Integer.parseInt(entrada);
                return num;
                
            }catch(NumberFormatException e){
                System.out.println("\n\nEntrada invalida, por favor, insira um numero inteiro valido");
                System.out.println("--------------------------------------------------------\n\n");
            }
        }
    }
    
    public static void wait(int miliSegundos){
        try {
            Thread.sleep(miliSegundos);
            } catch (InterruptedException ex) {    
                Logger.getLogger(Carro.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    

    
    
    

}

