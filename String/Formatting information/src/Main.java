import java.util.Formatter;

public class Main {
    public static void main(String[] args) {

        System.out.printf("Целое число: %d%n", 12345);

        System.out.printf("Число с плавающей точкой: %.2f%n", 123.4567);

        System.out.printf("Строка: %s%n", "Привет мир");

        System.out.printf("Логическое значение: %b%n", false);

        System.out.printf("Первая строка%nВторая строка%n");

        Formatter formatter = new Formatter();
        formatter.format("Имя: %s, Возраст: %d, Рост: %.1f", "Иван", 25, 175.5);
        System.out.println(formatter.toString());
        formatter.close();
    }
}