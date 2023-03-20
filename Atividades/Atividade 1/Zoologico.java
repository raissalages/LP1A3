import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    public String nome;
    private List<Jaula> jaulas;

    public Zoologico(String nome){
        this.nome = nome;
        jaulas = new ArrayList<>();
        jaulas.add(new Jaula());
    }
    public void AdicionarAnimal(Animal animal){
        for (Jaula jaula: jaulas) {
            if(jaula.animais.get(0).getClass() == animal.getClass()){
                jaula.animais.add(animal);
                return;
            }
        }
        Jaula jaula = new Jaula();
        jaula.animais.add(animal);
        jaulas.add(jaula);
    }
    public void AlimentarAnimais(){
        for(Jaula jaula : jaulas){
            for(Animal animal : jaula.animais){
                animal.Alimentar();
            }
        }
    }
    public List<Jaula> getJaulas(){
        return jaulas;
    }
    public List<Animal> getAnimais(){
        List<Animal> returnAnimais = new ArrayList<>();

        for(Jaula jaula : jaulas){
            for(Animal animal : jaula.animais){
                returnAnimais.add(animal);
            }
        }
        return returnAnimais;
    }
}
