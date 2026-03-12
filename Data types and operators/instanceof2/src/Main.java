public class Main {

    // Базовый класс
    static class Animal {
        public void makeSound() {
            System.out.println("Животное издает звук");
        }
    }

    // Подкласс
    static class Dog extends Animal {
        public void bark() {
            System.out.println("Гав!");
        }

        @Override
        public void makeSound() {
            bark();
        }
    }

    // Другой подкласс
    static class Cat extends Animal {
        public void meow() {
            System.out.println("Мяу!");
        }

        @Override
        public void makeSound() {
            meow();
        }
    }

    public static void main(String[] args) {

        // Создаем объекты
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        Animal animal3 = new Animal();

        // Проверяем типы
        System.out.println("animal1 instanceof Dog: " + (animal1 instanceof Dog));     // true
        System.out.println("animal1 instanceof Cat: " + (animal1 instanceof Cat));     // false
        System.out.println("animal1 instanceof Animal: " + (animal1 instanceof Animal)); // true

        System.out.println("animal2 instanceof Cat: " + (animal2 instanceof Cat));     // true
        System.out.println("animal2 instanceof Animal: " + (animal2 instanceof Animal)); // true

        System.out.println("animal3 instanceof Dog: " + (animal3 instanceof Dog));     // false
        System.out.println("animal3 instanceof Animal: " + (animal3 instanceof Animal)); // true

        // instanceof с интерфейсами
        String str = "Hello";
        System.out.println("str instanceof String: " + (str instanceof String));       // true
        System.out.println("str instanceof Object: " + (str instanceof Object));       // true
        System.out.println("str instanceof CharSequence: " + (str instanceof CharSequence)); // true

        // Практическое применение: безопасное приведение типов
        processAnimal(animal1); // Dog
        processAnimal(animal2); // Cat
        processAnimal(animal3); // Просто животное
    }

    public static void processAnimal(Animal animal) {
        if (animal instanceof Dog) {
            // Безопасное приведение к Dog
            Dog dog = (Dog) animal;
            System.out.print("Обрабатываем собаку: ");
            dog.bark();
        } else if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            System.out.print("Обрабатываем кошку: ");
            cat.meow();
        } else {
            System.out.print("Обрабатываем животное: ");
            animal.makeSound();
        }
    }
}

class InstanceNull {
    public static void main(String[] args) {

        String nullString = null;

        System.out.println("nullString instanceof String: " + (nullString instanceof String)); // false
        System.out.println("nullString instanceof Object: " + (nullString instanceof Object)); // false

        String str = getStringMaybeNull(); // может вернуть null

        if (str instanceof String) {
            System.out.println("Получили строку: " + str.toUpperCase());
        } else {
            System.out.println("Получили null или не строку");
        }
    }

    public static String getStringMaybeNull() {
        return Math.random() > 0.5 ? "Hello" : null;
    }
}