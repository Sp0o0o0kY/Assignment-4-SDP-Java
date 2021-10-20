package Animal;

import IAnimal.IAnimal;

public class Cat implements IAnimal {
    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping...");
    }
}
