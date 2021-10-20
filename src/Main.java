import Animal.Dog;
import Factory.AnimalFactoryLevelA;
import Factory.AnimalFactoryLevelB;
import Factory.AnimalFactoryLevelC;
import IAnimal.IAnimal;
import IAnimalFactory.AnimalFactory;

public class Main {
    public static void main(String[] args){

        //For creating So many Animals
        //And you can write here which animal you want to create. For instance: Bird or Cat or Dog
           AnimalFactory animalFactory1 = createAnimalByKind("Bird");//Bird or Cat or Dog
           IAnimal Animal = animalFactory1.createAnimal();

           //Animal for eating
           Animal.eat();
           //Animal for sleeping
            Animal.sleep();

    }


    public static AnimalFactory createAnimalByKind(String kind){
        if(kind.equalsIgnoreCase("Bird"))
            return  new AnimalFactoryLevelA();
        else if(kind.equalsIgnoreCase("Cat"))
            return  new AnimalFactoryLevelB();
        else if(kind.equalsIgnoreCase("Dog")){
            return new AnimalFactoryLevelC();
        }
        else{
            throw new RuntimeException(kind + " is unknown kind of Animal");
        }
}
}
