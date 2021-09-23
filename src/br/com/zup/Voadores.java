package br.com.zup;

public class Voadores extends Inimigos {

    private double danoTiros;

    public Voadores(String nome, double vida, double danoTiro) {
        super(nome, vida);
        this.danoTiros = danoTiro;

    }

    public double getDanoTiros() {
        return danoTiros;
    }

    public void setDanoTiros(double danoTiros) {
        this.danoTiros = danoTiros;
    }

    public double aplicarDano() {
        return danoTiros;
    }
}


