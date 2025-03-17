package animais;

public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Raça do Cachorro: " + raca);
    }
}