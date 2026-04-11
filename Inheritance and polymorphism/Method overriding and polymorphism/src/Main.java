class Animal {
    public void makeSound() {
        System.out.println("makeSound");
    }

    public Animal getInstance() {
        System.out.println("Animal.getInstance()");
        return new Animal();
    }
}

class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Гав-гав!");
    }

    @Override
    public Dog getInstance() {
        System.out.println("Dog.getInstance()");
        return new Dog();
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();

        myAnimal.makeSound(); //"makeSound"

        myDog.makeSound();     // Гав-гав!

        Animal animal = myDog.getInstance();  // Возвращает Dog, но ссылка Animal
        System.out.println("Тип объекта: " + animal.getClass().getSimpleName());
    }
}