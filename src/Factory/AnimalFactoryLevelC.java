package Factory;

import Animal.Dog;
import IAnimal.IAnimal;
import IAnimalFactory.AnimalFactory;

public class AnimalFactoryLevelC implements AnimalFactory {
    @Override
    public IAnimal createAnimal() {
        return new Dog();
    }
}
