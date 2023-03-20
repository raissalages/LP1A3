public class Animal implements Alimentavel{
    private String nome;
    private String especie;
    private int idade;
    private boolean alimentado;
    private String som;

    public Animal(String nome, String especie, int idade, String som) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.alimentado = false;
        this.som = som;
    }

    public String EmitirSom(){
        return som;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void Alimentar() {
        alimentado = true;
    }
}
