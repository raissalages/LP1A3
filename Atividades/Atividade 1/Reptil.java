public class Reptil extends Animal{
    private double temperaturaCorporal;
    public Reptil(String nome, String especie, int idade, String som, double temperaturaCorporal) {
        super(nome, especie, idade, som);
        this.temperaturaCorporal = temperaturaCorporal;
    }
}
