public class Main {

    // Метод, который генерирует исключение, которое будет перехвачено
    public static void methodWithCaughtException() {
        System.out.println("Вход в methodWithCaughtException");

        // Генерируем ArithmeticException
        int result = 10 / 0;
        System.out.println("Результат: " + result);
    }

    // Метод, который генерирует исключение, которое НЕ будет перехвачено
    public static void methodWithUncaughtException() {
        System.out.println("Вход в methodWithUncaughtException");

        // Генерируем NullPointerException
        String str = null;
        int length = str.length(); // Здесь будет NullPointerException
        System.out.println("Длина строки: " + length);
    }

    // Метод, который вызывает метод с перехватываемым исключением
    public static void callerMethodCaught() {
        System.out.println("Вход в callerMethodCaught");

        try {
            methodWithCaughtException();
        } catch (ArithmeticException e) {
            System.out.println("Исключение ПЕРЕХВАЧЕНО в callerMethodCaught: " + e);
            System.out.println("Программа продолжает работу после перехвата");
        }

        System.out.println("callerMethodCaught завершил работу");
    }

    // Метод, который вызывает метод с НЕперехватываемым исключением
    public static void callerMethodUncaught() {
        System.out.println("Вход в callerMethodUncaught");
        methodWithUncaughtException(); // Без try-catch
        System.out.println("Эта строка не выполнится");
    }

    public static void main(String[] args) {
        System.out.println("=== Часть 1: Исключение будет ПЕРЕХВАЧЕНО ===\n");

        try {
            callerMethodCaught();
        } catch (Exception e) {
            System.out.println("Этот catch не сработает, так как исключение уже обработано выше");
        }

        System.out.println("\n=== Часть 2: Исключение приведет к АВАРИЙНОЙ ОСТАНОВКЕ ===\n");

        // Вызываем метод, который выбросит неперехваченное исключение
        callerMethodUncaught();

        System.out.println("Эта строка никогда не будет выведена");
    }
}