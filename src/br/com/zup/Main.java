package br.com.zup;

public class Main {

    public static void main(String[] args) {


        Guerreiros guerreira = new Guerreiros("Luna",105,100);
       // Magos mestre = new Magos("Mestre dos magos",150,100);
        Rasteiros rasteiros = new Rasteiros("Caída",200,200);
        // Voadores attack = new Voadores("Atacar",108,300);

        //Trocando os nomes
        System.out.println("Nome: " + guerreira.getNome());
        guerreira.trocarNome( "Solar");
        System.out.println(guerreira.getNome());







    }
}
