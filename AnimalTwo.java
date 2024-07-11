import java.util.ArrayList;
import java.util.List;

public class AnimalTwo {
    private void makeSound() { }
}

class Lion extends AnimalTwo {
    private String makeSound() {
        return "roar";
    }
}

class Mouse extends AnimalTwo implements SoundOfAnimal {
    public String makeSound() {
        return "beeps";
    }

    @Override
    public void soundOfAnimal() {
        System.out.println("ship-ship");
    }
}

class Snake extends AnimalTwo implements SoundOfAnimal {
    private String makeSound() {
        return "hisses";
    }

    @Override
    public void soundOfAnimal() {
        System.out.println("It's hiss");
    }
}

class AnimalTwoDB {
    List<AnimalTwo> animalList = new ArrayList();

    private void saveAnimal(AnimalTwo animal) {
        animalList.add(animal);
    }

    public void getAnimal(int i) {
        System.out.println(animalList.get(i));
    }

    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        AnimalTwoDB animalTwoDB = new AnimalTwoDB();
        animalTwoDB.saveAnimal(mouse);
        AnimalTwo animalTwo = new AnimalTwo();
        System.out.println(mouse.makeSound());
        mouse.soundOfAnimal();
    }
}
