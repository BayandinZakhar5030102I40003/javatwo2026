class Shape {

    // Метод для расчета площади (будет переопределен)
    public double calculateArea() {
        return 0;
    }

    // Перегруженные методы для разных типов параметров
    public void draw() {
        System.out.println("Рисую фигуру");
    }

    public void draw(String color) {
        System.out.println("Рисую фигуру цветом: " + color);
    }

    public void draw(int size) {
        System.out.println("Рисую фигуру размером: " + size);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Переопределение метода calculateArea
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Переопределение перегруженных методов
    @Override
    public void draw() {
        System.out.println("Рисую круг с радиусом " + radius);
    }

    @Override
    public void draw(String color) {
        System.out.println("Рисую круг цветом " + color + " с радиусом " + radius);
    }

    // Дополнительный перегруженный метод специфичный для Circle
    public void draw(String color, boolean fill) {
        if (fill) {
            System.out.println("Рисую закрашенный круг цветом " + color + " с радиусом " + radius);
        } else {
            draw(color);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle(5.0);

        shape.draw();
        circle.draw();

        circle.draw("красный");
        circle.draw("синий", true);
        circle.draw(10);
    }
}