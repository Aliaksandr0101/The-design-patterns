import java.util.ArrayList;
import java.util.List;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
class AnimalDB{
    List<Animal> animalList = new ArrayList();
    public void saveAnimal(Animal animal){
      animalList.add(animal);
    }
    public void getAnimal(int i){
        System.out.println(animalList.get(i));
    }
}

