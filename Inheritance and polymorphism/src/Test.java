class Parent {
    String name = "DaD";

    void show() {
        System.out.println("Привет от Parent");
    }
}

class Child extends Parent {
    String name = "Child";

    void show() {
        // super - обращение к родит_классу
        System.out.println(super.name);
        super.show();

        // this - обращение к себе
        System.out.println(this.name);
        System.out.println("Привет от Child");
    }
}

public class Test {
    public static void main(String[] args) {
        Child child = new Child();
        child.show();
    }
}