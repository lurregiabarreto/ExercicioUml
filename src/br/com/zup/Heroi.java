package br.com.zup;

public class Heroi {


    private String nome;
    private double vida;

    public Heroi(String nome, double vid) {
        this.nome = nome;
        this.vida = vida;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public void trocarNome(String nome) {
        setNome(nome);

    }

    public void receberDano(double dano) {
        this.vida = this.vida - dano;

    }

    public double exibirVida() {
        return vida;
    }
}