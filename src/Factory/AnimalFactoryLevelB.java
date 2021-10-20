package Factory;

import Animal.Cat;
import IAnimal.IAnimal;
import IAnimalFactory.AnimalFactory;

public class AnimalFactoryLevelB implements AnimalFactory {
    @Override
    public IAnimal createAnimal() {
        return new Cat();
    }
}
