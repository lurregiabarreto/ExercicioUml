package br.com.zup;

public class Rasteiros extends Inimigos {


    private double danosEspinhos;

    public Rasteiros(String nome, double vida) {
        super(nome, vida);
    }

    public double getDanosEspinhos() {
        return danosEspinhos;
    }

    public void setDanosEspinhos(double danosEspinhos) {
        this.danosEspinhos = danosEspinhos;
    }

    public void aplicarDanos() {
    }
}