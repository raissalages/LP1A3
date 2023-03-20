public class Mamifero extends Animal{
    private int mesesGestacao;
    public Mamifero(String nome, String especie, int idade, String som, int mesesGestacao) {
        super(nome, especie, idade, som);
        this.mesesGestacao = mesesGestacao;
    }
}
