package app;

import animais.Gato;
import animais.Cachorro;

public class App {
    public static void main(String[] args) {
        Gato gato = new Gato("Felix", 2, "Preto");
        Cachorro cachorro = new Cachorro("Rex", 3, "Labrador");

        gato.exibirInfo();
        System.out.println();
        cachorro.exibirInfo();
    }
}