package Factory;

import Animal.Bird;
import IAnimal.IAnimal;
import IAnimalFactory.AnimalFactory;

public class AnimalFactoryLevelA implements AnimalFactory {
    @Override
    public IAnimal createAnimal() {
        return new Bird();
    }
}
