public class Main {

    // Создадим иерархию исключений
    static class Ex1 extends Exception {
        Ex1(String msg) { super(msg); }
    }

    static class Ex2 extends Ex1 {
        Ex2(String msg) { super(msg); }
    }

    // Ситуация 1: несколько исключений обрабатываются идентично
    public static void identicalHandling(int code) {
        try {
            switch (code) {
                case 1:
                    throw new NullPointerException("NullPointer");
                case 2:
                    throw new ArithmeticException("Division by zero");
                default:
                    System.out.println("Нормальное выполнение");
            }
        } catch (NullPointerException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
            // Все три исключения обрабатываются одинаково (используем |)
            System.out.println("Идентичная обработка: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }
    }

    // Ситуация 2: иерархия исключений Ex1 <-- Ex2 <-- Ex3
    public static void hierarchicalHandling(int level) throws Ex1, Ex2 {
        switch (level) {
            case 1:
                throw new Ex1("Исключение уровня Ex1");
            case 2:
                throw new Ex2("Исключение уровня Ex2");
            default:
                System.out.println("Нет исключения");
        }
    }

    public static void main(String[] args) {
        identicalHandling(1);
        identicalHandling(2);
        identicalHandling(3);
        identicalHandling(0);

        // Важно: catch блоки должны идти от потомка к предку
        try {
            hierarchicalHandling(3);
        } catch (Ex2 e) {
            System.out.println("Перехвачен Ex2: " + e.getMessage());
        } catch (Ex1 e) {
            System.out.println("Перехвачен Ex1 (самый общий): " + e.getMessage());
        }

        // Неправильный порядок- код he скомпилируется

        try {
            hierarchicalHandling(2);
        } catch (Ex2 e) {  // Потом менее конкретный
            System.out.println("Ex2: " + e.getMessage());
        } catch (Ex1 e) {  // Последний самый общий
            System.out.println("Ex1: " + e.getMessage());
        }
    }
}