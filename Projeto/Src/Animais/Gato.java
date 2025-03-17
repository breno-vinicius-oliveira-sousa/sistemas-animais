package animais;

public class Gato extends Animal {
    private String cor;

    public Gato(String nome, int idade, String cor) {
        super(nome, idade);
        this.cor = cor;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Cor do Gato: " + cor);
    }
}