class Animal {
    String name = "Дикое";
    String type = "Животное";

    // Конструктор 1
    Animal() {
        System.out.println("1.Animal()");
    }

    // Конструктор 2
    Animal(String type) {
        this.type = type;
        System.out.println("2.Animal(String)" + type);
    }

    // Метод суперкласса
    void makeSound() {
        System.out.println("Животное издаёт звуки");
    }

    void eat() {
        System.out.println("Животное ест");
    }
}

class Dog extends Animal {
    String name = "Doge";

    // Вариант 1:
    Dog() {
        super();  // Вызов конструктора Animal() без параметров
        System.out.println("   Конструктор Dog()");
    }

    Dog(String type) {
        super(type);  // Вызов конструктора Animal(String)
        System.out.println("   Конструктор Dog(String): тип = " + type);
    }

    Dog(String type, String name) {
        super(type);  // Вызов конструктора суперкласса
        this.name = name;
        System.out.println("   Конструктор Dog(String, String): имя = " + name);
    }

    //Вариант 2
    void showFields() {

        System.out.println("this.name (своё поле): " + this.name);
        System.out.println("super.name (поле суперкласса): " + super.name);
        System.out.println("super.type (поле суперкласса): " + super.type);
    }

    // Переопределённый метод
    @Override
    void makeSound() {
        System.out.println("Собака uwu");
    }
    //Вариант 3
    void demonstrateMethods() {
        // Вызов своего переопределённого метода
        System.out.print("this.makeSound(): ");
        this.makeSound();

        // Вызов метода суперкласса
        System.out.print("super.makeSound(): ");
        super.makeSound();

        // Вызов непереопределённого метода (super необязателен)
        System.out.print("super.eat(): ");
        super.eat();

        System.out.print("this.eat(): ");
        this.eat();
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("1: обращение конструктору суперкласса \n");

        System.out.println("Dog():");
        Dog dog1 = new Dog();

        System.out.println("\nDog(#):");
        Dog dog2 = new Dog("Домашнее");

        System.out.println("\nDog(#, ##):");
        Dog dog3 = new Dog("#", "##");

        System.out.println("\n2: доступ к полю суперкласса");
        dog3.showFields();

        System.out.println("\n3: доступ к методу суперкласса");
        dog3.demonstrateMethods();

    }
}