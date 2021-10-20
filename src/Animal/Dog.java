package Animal;

import IAnimal.IAnimal;

public class Dog implements IAnimal {
    @Override
    public void eat() {
        System.out.println("Dog is eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping...");
    }
}
