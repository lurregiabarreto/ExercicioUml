package br.com.zup;

public class Magos extends  Heroi{
    private double poderMagico;
    private double aplicarMagia;


    public Magos(String nome, double vida, double poderMagico, double aplicarMagia) {
        super(nome, vida);
        this.poderMagico = poderMagico;
        this.aplicarMagia = aplicarMagia;
    }

    public void aplicarMagia() {

    }
}