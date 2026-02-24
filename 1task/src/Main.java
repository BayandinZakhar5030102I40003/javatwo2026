abstract class Bird {
    public abstract void eat();
}

interface Flyable {
    void fly();
}

class Sparrow extends Bird implements Flyable {
    @Override
    public void eat() {
        System.out.println("Воробей кушает");
    }

    @Override
    public void fly() {
        System.out.println("Воробей летает");
    }
}

class Penguin extends Bird {
    @Override
    public void eat() {
        System.out.println("Пингвин ест");
    }

    public void swim() {
        System.out.println("Пингвин плавает");
    }
}


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
        // makeBirdFly(penguin); // Ошибка компиляции - пингвин не летает
        //Вывод:
        //Воробей кушает
        //Пингвин ест
        //Воробей летает
    }
}
//Суть принципа
//Основная формулировка:
//Объекты в программе должны быть заменяемыми экземплярами их базовых типов без нарушения корректности программы.
//Иными словами: если S — подтип типа T, то объекты типа T в любой части программы можно заменить объектами типа S,
// и программа при этом продолжит работать корректно, не выдавая ошибок и не меняя ожидаемого поведения.