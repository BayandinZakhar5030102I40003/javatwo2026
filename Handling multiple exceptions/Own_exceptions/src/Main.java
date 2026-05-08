class InvalidAge extends Exception {

    // 1. Конструктор без параметров
    public InvalidAge() {
        super("Недопустимое значение возраста");
    }

    // 2. Конструктор с сообщением об ошибке
    public InvalidAge(String message) {
        super(message);
    }

    // 3. Конструктор с сообщением и причиной
    public InvalidAge(String message, Throwable cause) {
        super(message, cause);
    }
}

public class Main {

    public static void validateAge(int age) throws InvalidAge {
        if (age < 0 || age > 150) {
            throw new InvalidAge("Возраст " + age);
        }
        System.out.println("Возраст " + age + " корректен");
    }

    public static void main(String[] args) {

        try {
            validateAge(-5);
        } catch (InvalidAge e) {
            System.out.println("Ошибка: " + e.getMessage());
            System.out.println("Тип исключения: " + e.getClass().getSimpleName());
        }

    }
}