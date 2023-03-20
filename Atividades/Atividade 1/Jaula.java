import java.util.ArrayList;
import java.util.List;

public class Jaula {
    public List<Animal> animais;

    public Jaula(){
        animais = new ArrayList<>();
        animais.add(new Animal("teste", "teste", 0, "teste"));
    }
}
