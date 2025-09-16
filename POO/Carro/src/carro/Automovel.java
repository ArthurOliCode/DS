/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carro;

/**
 *
 * @author CAMARGO
 */
public abstract class Automovel {
   protected String marca;
   protected String nomeModelo;
   protected int anoOrigem;
   protected double precoAno1;
   protected double precoAno2;
   protected double precoAno3;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNomeModelo() {
        return nomeModelo;
    }

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public int getAnoOrigem() {
        return anoOrigem;
    }

    public void setAnoOrigem(int anoOrigem) {
        this.anoOrigem = anoOrigem;
    }

    public double getPrecoAno1() {
        return precoAno1;
    }

    public void setPrecoAno1(double precoAno1) {
        this.precoAno1 = precoAno1;
    }

    public double getPrecoAno2() {
        return precoAno2;
    }

    public void setPrecoAno2(double precoAno2) {
        this.precoAno2 = precoAno2;
    }

    public double getPrecoAno3() {
        return precoAno3;
    }

    public void setPrecoAno3(double precoAno3) {
        this.precoAno3 = precoAno3;
    }

    @Override
    public String toString() {
        return "Automovel{" + "marca=" + marca + ", nomeModelo=" + nomeModelo + ", anoOrigem=" 
                + anoOrigem + ", precoAno1=" + precoAno1 + ", precoAno2=" + precoAno2 + ", precoAno3=" 
                + precoAno3 + '}';
    }
    
    
}


