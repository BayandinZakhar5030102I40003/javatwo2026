class Animal {
    // можно переопределить
    public void makeSound() {
        System.out.println("Животное make звуки");
    }

    // final - нелзя переопределить
    public final void breathe() {
        System.out.println("Животное дышет");
    }
}

class Dog extends Animal {
    // переопределяем обычный метод
    @Override
    public void makeSound() {
        System.out.println("Собака лает: Гав-гав!");
    }

    // переопределение final-метода вызовет ошибку компиляции
    /*
    @Override
    public void breathe() {
        System.out.println("Собака дышит");  // ОШИБКА! Cannot override the final method
    }
    */
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.makeSound();
        dog.breathe();
    }
}