// Интерфейс
interface Drawable {
    void draw();
}

class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Рисуем круг");
    }
}

public class Main {
    public static void main(String[] args) {
        var shape = new Circle();// Тип shape выведен как Circle
        shape.draw();
    }
}
