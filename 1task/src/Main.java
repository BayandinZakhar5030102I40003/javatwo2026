abstract class Bird {
    public abstract void eat();
}

interface Flyable {
    void fly();
}

class Sparrow extends Bird implements Flyable {
    @Override
    public void eat() {
        System.out.println("Воробей ест");
    }

    @Override
    public void fly() {
        System.out.println("Воробей летит");
    }
}

class Penguin extends Bird {
    @Override
    public void eat() {
        System.out.println("Пингвин ест");
    }

    public void swim() {
        System.out.println("Пингвин плывет");
    }
}

// Клиентский код
public class Main {
    public static void makeBirdEat(Bird bird) {
        bird.eat();
    }

    public static void makeBirdFly(Flyable flyableBird) {
        flyableBird.fly();
    }

    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        Bird penguin = new Penguin();

        makeBirdEat(sparrow);
        makeBirdEat(penguin);

        makeBirdFly((Flyable) sparrow);
        // makeBirdFly(penguin); // Ошибка компиляции - пингвин не Flyable
    }
}