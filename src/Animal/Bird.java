package Animal;

import IAnimal.IAnimal;

public class Bird implements IAnimal {
    @Override
    public void eat() {
        System.out.println("Bird is eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Bird is sleeping...");
    }
}
