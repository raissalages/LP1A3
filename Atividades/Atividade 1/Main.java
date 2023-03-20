public class Main {
    public static void main(String[] args) {
        Zoologico zoologico = new Zoologico("Zoolouco");
        Mamifero mamifero = new Mamifero("Rogerin", "Cabra", 79, "AAAAAAAAAA", 79);
        zoologico.AdicionarAnimal(mamifero);

        zoologico.AlimentarAnimais();

        for(Animal animal : zoologico.getAnimais()){
            System.out.println(animal.getNome());
        }
    }
}
